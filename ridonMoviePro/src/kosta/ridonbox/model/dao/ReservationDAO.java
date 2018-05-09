package kosta.ridonbox.model.dao;

import java.sql.SQLException;
import java.util.List;

import kosta.ridonbox.model.dto.MemberDTO;
import kosta.ridonbox.model.dto.MovieDTO;
import kosta.ridonbox.model.dto.ReservationDTO;
import kosta.ridonbox.model.dto.ScreenDTO;



public interface ReservationDAO {

	/**
	 * � ��ȭ�� ���� ��� ���� �ߴ����� ���� ���� ������ ��� �����ִ� �޼ҵ�
	 * */
	List<ReservationDTO> selectAll() throws SQLException;
	
	
	/**
	 * ���� �߰�
	 * */
	int insert(ReservationDTO reservationDTO, MemberDTO memberDTO, MovieDTO movieDTO, ScreenDTO screenDTO) throws SQLException;
	
	
	/**
	 * Ư�� ���� ������ �����ִ� �޼ҵ�
	 * */
	ReservationDTO selectByRevNum(String revNum) throws SQLException;
	

	/**
	 * ���Ÿ� �Ͽ��ٰ� ����� ��� ���� ���� ������ ������ �� ����ϴ� �޼ҵ�
	 * */
	int deleteRev(String revNum) throws SQLException;
	
	
	
	/**
	 * ������ ���� �߿� �� �� �ǰų� �����ؾ� �ϴ� �κ��� ������ ����ϴ� �޼ҵ�
	 * */
	int updateRev(ReservationDTO reservationDTO) throws SQLException;
	
}
