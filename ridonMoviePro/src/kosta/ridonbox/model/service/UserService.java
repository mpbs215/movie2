package kosta.ridonbox.model.service;

import java.sql.SQLException;
import java.util.List;

import kosta.ridonbox.model.dto.BookDTO;
import kosta.ridonbox.model.dto.EventDTO;
import kosta.ridonbox.model.dto.MemberDTO;
import kosta.ridonbox.model.dto.MovieDTO;

public interface UserService {
	/**
	 * �α�
	 * @param id �α����� ����ھ��̵� 
	 * @param password �α����� ����ں�й�ȣ 
	 * @return �α��εǾ����� �ȵǾ����� Ȯ
	 */
	public int loginMember(String id,String password) throws SQLException;
	
	/**
	 * ȸ������ 
	 * @param memberDTO ȸ�������� ȸ������ MemberDTO�� ��.
	 * @return ȸ�����ԵǾ����� �ȵǾ����� Ȯ��.
	 * @throws SQLException
	 */
	public int joinMember(MemberDTO memberDTO) throws SQLException;
	
	/**
	 * ���̵� �ߺ�üũ
	 * @param memberID
	 * @return 1�̸� ���̵� �ߺ�, 0�̸� ��밡��
	 * @throws SQLException
	 */
	public int checkById(String id) throws SQLException;
	
	/**
	 *�������������� BoxOffice������ ��ȭ������.
	 * @return BoxOffic�� ��ȭ ���� list
	 * @throws SQLException
	 */
	public List<MovieDTO> showByBoxoffice() throws SQLException;
	
	/**
	 * �������������� �ֽŰ����ۼ����� ������.
	 * @return	�ֽŰ����ۼ� ��ȭ���� list
	 * @throws SQLException
	 */
	public List<MovieDTO> showByLatest() throws SQLException;
	
	/**
	 * ��ȭ�� �����ϸ� �� ��ȭ����(Detail) �����ֱ� ����  
	 * @param movieNo	 ������ ��ȭ ��
	 * @return		 ���õ� ��ȭ������ ������.(MovieDTO)
	 * @throws SQLException
	 */
	public MovieDTO showDetail(String movieNo) throws SQLException;
	
	/**
	 * �������� �����ϴ� Ŭ����  
	 * @param booking �����ϴ� ������ BookDTO�� �Ѱ���.
	 * @return	���ŵǾ����� �ȵǾ�����int�� �Ѱ���.
	 * @throws SQLException
	 */
	public void Booking(BookDTO booking) throws SQLException;
	
	/**
	 * �̺�Ʈ �������� �Ѱ��ֱ� ���ؼ�  
	 * @return	��ü�̺�Ʈ ������ �Ѱ���. 
	 * @throws SQLException
	 */
	public List<EventDTO> listEvent() throws SQLException;
	
/////////////////////////////����������
	/**
	 * �����(��) ������ �����ֱ� ���� 
	 * @return	memberId (����� ���̵�)
	 * @throws SQLException 
	 * @throws MemberDTO 
	 */
	public MemberDTO memberInfo(String memberId) throws SQLException;
	
	/**����*/
	/**
	 * �����(��) ���� ������ �����ֱ� ����  
	 * @return	memberId (����� ���̵�) 
	 * @throws SQLException 
	 * @throws List<BookDTO> (�� ������� ���� dto ����Ʈ�� ����)
	 */
	public List<BookDTO> memberbyBookList(String memberId) throws SQLException;

	int myPageByMemberUpdate(MemberDTO memberDTO) throws SQLException;

	//��ȭ�� ���� (����)
	
}
