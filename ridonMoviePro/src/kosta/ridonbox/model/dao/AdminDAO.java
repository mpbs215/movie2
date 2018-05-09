package kosta.ridonbox.model.dao;

import java.sql.SQLException;
import java.util.List;

import kosta.ridonbox.model.dto.BranchDTO;
import kosta.ridonbox.model.dto.EventDTO;
import kosta.ridonbox.model.dto.MovieDTO;
import kosta.ridonbox.model.dto.MovieScreenDTO;
import kosta.ridonbox.model.dto.ScreenDTO;
import kosta.ridonbox.model.dto.TheaterDTO;

public interface AdminDAO {
	
	/**
	 * �̺�Ʈ ���
	 * @param evetDAO 
	 * @return int : 1 �̻� - ����, 0 - ����
	 */
	public int eventInsert(EventDTO eventDTO) throws SQLException;
	
	/**
	 * �̺�Ʈ ������Ʈ
	 * @param evetNo (pk)
	 * @return int : 1 �̻� - ����, 0 - ����
	 */
	public int eventUpdate(EventDTO eventDTO) throws SQLException;

	/**
	 * �̺�Ʈ ����
	 * @param evetNo (pk)
	 * @return int : 1 �̻� - ����, 0 - ����
	 */
	public int eventDelete(int eventNo) throws SQLException;

	/**
	 * ��ȭ ���
	 * @param MovieDTO
	 * @return boolean : true - ����, false - ����
	 */
	public int movieInsert(MovieDTO movieDTO) throws SQLException;

	/**
	 * ��ȭ ����
	 * @param movieNo (pk)
	 * @return boolean : true - ����, false - ����
	 */
	public int movieUpdate(MovieDTO movieNo) throws SQLException;

	/**
	 * �� �ð�ǥ ���� ���
	 * @param BranchDTO 
	 * @return boolean : true - ����, false - ����
	 */
	public int branchInsert(ScreenDTO screenDTO) throws SQLException;

	/**
	 * �� �ð�ǥ ���� ����
	 * @param branchNo (pk) //����Ű�� �����ϴ°� ����
	 * @return boolean : true - ����, false - ����
	 */
	public BranchDTO branchUpdate(int branchNo) throws SQLException;

	List<MovieScreenDTO> movieList() throws SQLException;

	List<TheaterDTO> theaterList() throws SQLException;

	public int movieDelete(String movieNo) throws SQLException;


}
