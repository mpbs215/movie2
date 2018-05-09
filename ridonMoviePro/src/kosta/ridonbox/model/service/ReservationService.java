package kosta.ridonbox.model.service;

import java.sql.SQLException;
import java.util.List;

import kosta.ridonbox.model.dto.ReservationDTO;

public interface ReservationService {

	/**
	 * reservationService ���� ����Ʈ ��ü�� �����ִ� ����Ͻ� ���� ó���ϴ� �κ�
	 * */
	 List<ReservationDTO> selectAll() throws SQLException;
	
	 
	 /**
	  * ���ſ� ���� ����Ͻ� ������ ó���ϴ� �κ�
	  * */
	 int insert(ReservationDTO reservationDTO) throws SQLException;
	
	 
	 /**
	  * ���Ÿ� �Ͽ��ٰ� ��Ҹ� �� �� ����Ͻ� ������ ó���ϴ� �κ�
	  * */
	 int deleteRev(String revNum) throws SQLException;
	 
	 
	 /**
	  *  ���� ������ �����ؾ� �ϴ� �κ��� ���� �� ����Ͻ����� ó���ϴ� �κ�
	  * */
	 
	 int updateRev(ReservationDTO reservationDTO) throws SQLException;
	 
	 
	 /**
	  *  Ư�� ���� ������ ������ �� ����Ͻ������� ó���ϴ� �κ�
	  * */
	 ReservationDTO selectByRevNum(String revNum) throws SQLException;
}

