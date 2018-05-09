package kosta.ridonbox.model.service;

import java.sql.SQLException;

import kosta.ridonbox.model.dto.BranchDTO;
import kosta.ridonbox.model.dto.EventDTO;
import kosta.ridonbox.model.dto.MovieDTO;

public interface AdminService {
		
		
		/**
		 * �̺�Ʈ ���
		 * @param evetDAO 
		 * @return int������ 1 �̻��̸� ����, 0�̸� ����
		 */
		public int eventInsert(EventDTO evetDTO) throws SQLException;
		
		/**
		 * �̺�Ʈ ����
		 * @param evetDAO 
		 * @return int������ 1 �̻��̸� ����, 0�̸� ����
		 */
		public int eventUpdate(EventDTO evetNo) throws SQLException;

		/**
		 * �̺�Ʈ ����
		 * @param evetNo (pk) 
		 * @return int������ 1 �̻��̸� ����, 0�̸� ����
		 */
		public int eventDelete(int evetNo) throws SQLException;
		
		/**
		 * ��ȭ ���
		 * @param movieDTO 
		 * @return int������ 1 �̻��̸� ����, 0�̸� ����
		 */
		public int movieInsert(MovieDTO movieDTO) throws SQLException;

		/**
		 * ��ȭ ����
		 * @param movieNo(pk)
		 * @return int������ 1 �̻��̸� ����, 0�̸� ����
		 */
		public int movieUpdate(MovieDTO movieDTO) throws SQLException;

		/**
		 * �󿵰� ���
		 * @param branchDTO  
		 * @return int������ 1 �̻��̸� ����, 0�̸� ����
		 */
		public int branchInsert(BranchDTO branchDTO) throws SQLException;

		/**
		 * �󿵰� ����
		 * @param branchNo(pk) (�󿵰��ѹ�)
		 * @return BranchDTO (�����Ȱ�)
		 */
		public BranchDTO branchUpdate(int branchNo) throws SQLException;

		/**
		 * �󿵰� ����
		 * @param branchNo(pk) (�󿵰��ѹ�)
		 * @return int������ 1 �̻��̸� ����, 0�̸� ����
		 */
		public int branchDelete(int branchNo) throws SQLException;

		int movieDelete(int movieNo) throws SQLException;
}
