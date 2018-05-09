package kosta.ridonbox.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.ridonbox.model.dto.ModelAndView;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("/admin")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Map<String, Action> map;

	public void init(ServletConfig config) throws ServletException {
		map=(Map<String, Action>)config.getServletContext().getAttribute("map");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String key=request.getParameter("command");
		if(key==null) key="main";
		
		//�ʿ��� Ű�� �ش��ϴ� Ŭ������ ������ �޼ҵ带 ȣ���ϰ� ���ϰ��� �޴´�.
		Action action=map.get(key);
		ModelAndView mv=action.execute(request, response);
		if(mv==null) {
			return;
		}
		
		
		//���ϰ��� ���� �̵���İ� �̵���θ� ���Ѵ�.
		if(mv.isRedirect()) {
			response.sendRedirect(mv.getPath());
			return;
		}
		
		request.getRequestDispatcher(mv.getPath()).forward(request, response);
	}
	

}