package kosta.ridonbox.model.service;

import java.sql.SQLException;

import kosta.ridonbox.model.dao.AdminDAO;
import kosta.ridonbox.model.dao.AdminDAOImpl;
import kosta.ridonbox.model.dto.BranchDTO;
import kosta.ridonbox.model.dto.EventDTO;
import kosta.ridonbox.model.dto.MovieDTO;

public class AdminServiceImpl implements AdminService {
	private AdminDAO adminDAO = new AdminDAOImpl();

	@Override
	public int eventInsert(EventDTO eventDTO) throws SQLException {
		int result = adminDAO.eventInsert(eventDTO);
		if(result==0) throw new SQLException("��ϵ��� �ʾҽ��ϴ�");
		return result;
	}

	@Override
	public int eventUpdate(EventDTO eventNo) throws SQLException {
		int result = adminDAO.eventUpdate(eventNo);
		if(result==0) throw new SQLException("�������� �ʾҽ��ϴ�");
		return result;
	}

	@Override
	public int eventDelete(int eventNo) throws SQLException {
		int result = adminDAO.eventDelete(eventNo);
		if(result==0) throw new SQLException("�������� �ʾҽ��ϴ�");
		return result;
	}



	@Override
	public int movieDelete(int movieNo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int branchInsert(BranchDTO branchDTO) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BranchDTO branchUpdate(int branchNo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int branchDelete(int branchNo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	

	@Override
	public int movieInsert(MovieDTO movieDTO) throws SQLException {
		int result = adminDAO.movieInsert(movieDTO);
		if(result == 0) throw new SQLException("��ϵ��� �ʾҽ��ϴ�.");
		return result;
	}

	@Override
	public int movieUpdate(MovieDTO movieDTO) throws SQLException {
		int result = adminDAO.movieUpdate(movieDTO);
		if(result==0) throw new SQLException("�������� �ʾҽ��ϴ�.");
		return result;
	}

}
