package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountService {
	
	public void CreateAccountNum();
	public ArrayList<AccountBean> findAll();
	public ArrayList<AccountBean> findSome();
	public ArrayList<AccountBean> findOne();
	public int count();
	public void exist();
	public int money();
	public void update();
	public void delete();
}
