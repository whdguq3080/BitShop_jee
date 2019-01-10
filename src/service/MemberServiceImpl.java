package service;

import java.util.ArrayList;

import dao.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService {

	private static MemberServiceImpl instance = new MemberServiceImpl();
	private MemberServiceImpl() {
		dao = MemberDAOImpl.getInstance();
	}
	public static MemberServiceImpl getInstance() {return instance;}
	MemberDAOImpl dao;

	
	@Override
	public void createMember(MemberBean member) {
		System.out.println("멤버서비스 조인에 진입");
		System.out.println("===컨트롤러에서 넘어온 회원정보");
		dao.insertMember(member);
	}

	@Override
	public ArrayList<MemberBean> findAllMembers() {
		ArrayList<MemberBean> list = new ArrayList<>();
		dao.selectAllMembers();
		return list;
	}

	@Override
	public ArrayList<MemberBean> findMembersByName(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		dao.selectMembersByName(name);
		return list;
	}

	@Override
	public MemberBean findMemberById(String id) {
		
		return dao.selectMemberById(id);
	}

	@Override
	public int countMembers() {
		dao.countMembers();
		return 0;
	}

	@Override
	public boolean existMember(String id,String pass) {
		boolean ok = false;
		MemberBean member = new MemberBean();
		 member = dao.existMember(id, pass);
		 if(member != null) {
			 ok = true;
		 }
		return ok;
	}

	@Override
	public void changeMember(MemberBean member) {
		dao.updateMember(member);
	}

	@Override
	public void removeMember(String id,String pass) {
		dao.deleteMember(id, pass);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("");
	}

}
