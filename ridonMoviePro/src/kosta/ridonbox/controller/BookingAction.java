package kosta.ridonbox.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.ridonbox.model.dto.ModelAndView;

/**
 * ���������� �̵��� ����ϴ� Action
 * ��û��: ���� ���� and ��ȭ����
 * ���䰪: �������� - MyPage ����Ȯ�ζ����� �̵�
 */
public class BookingAction implements Action {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ModelAndView mv = new ModelAndView();
		mv.setPath("web/bookingview.jsp");
		String test;
		return mv;
	}

}