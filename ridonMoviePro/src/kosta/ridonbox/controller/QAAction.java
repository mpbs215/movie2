package kosta.ridonbox.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.ridonbox.model.dto.ModelAndView;

/**
 * QA������ �̵��� ����ϴ� Action
 * ��û�� X
 * ���䰪: QA�Խ��ǿ� ��ϵ� �� ����Ʈ
 */
public class QAAction implements Action {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ModelAndView mv = new ModelAndView();
		mv.setPath("web/QAboard.jsp");
		return mv;
	}

}