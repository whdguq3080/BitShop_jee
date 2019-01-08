package service;

import java.util.ArrayList;

import dao.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService {

	private static MemberServiceImpl instance = new MemberServiceImpl();
	private MemberServiceImpl() {}
	public static MemberServiceImpl getInstance() {return instance;}
	
	
	
	@Override
	public void joinMember(MemberBean member) {
		System.out.println("멤버서비스 조인에 진입");
		System.out.println("===컨트롤러에서 넘어온 회원정보");
		System.out.println("id :"+member.getId());
		System.out.println("pass:"+member.getName());
		System.out.println("비번" + member.getPass());
		System.out.println("주민번호"+member.getSsn());
		MemberDAOImpl.getInstance().insertMember(member);
	}

	@Override
	public ArrayList<MemberBean> listName() {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public ArrayList<MemberBean> findByName() {
		ArrayList<MemberBean> list = new ArrayList<>();
		
		return list;
	}

	@Override
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		
		return member;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void exist() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("");
	}

}
