package kosta.ridonbox.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.ridonbox.model.dto.ModelAndView;

/**
 * FAQ������ �̵��� ����ϴ� Action
 * ��û�� X
 * ���䰪: X �ϵ��ڵ� �����̹Ƿ� �׳� ������ ���� �� �̵��ϸ� �ɵ�
 */
public class FaqAction implements Action {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ModelAndView mv = new ModelAndView();
		mv.setPath("web/faq.jsp");
		
		
		
		return mv;
	}

}
