package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {
	
	public void create();
	public ArrayList<MemberBean> findAll();
	public ArrayList<MemberBean> findSome();
	public ArrayList<MemberBean> findone();
	public int count();
	public void exist();
	public void update();
	public void delete();
}
