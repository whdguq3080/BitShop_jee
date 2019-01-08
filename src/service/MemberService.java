package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {
	
	public void joinMember(MemberBean member);
	public ArrayList<MemberBean> listName();
	public ArrayList<MemberBean> findByName();
	public MemberBean findById(String id);
	public int count();
	public void exist();
	public void update();
	public void delete();
}
