package kosta.ridonbox.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.ridonbox.model.dto.ModelAndView;

/**
 * myPage �̵��� ����ϴ� Action
 * ���缼�ǿ��� ID���� �о�;���
 * ���䰪: ID�� �ش��ϴ� ȸ������, ��������
 */
public class MyPageAction implements Action {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ModelAndView mv = new ModelAndView();
		mv.setPath("web/myPage.jsp");
		return mv;
	}

}
