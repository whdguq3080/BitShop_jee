package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountService {
	//CRUD
	public String openAccountNum(int money);
	public String createAccountNum();
	public ArrayList<AccountBean> list();
	public AccountBean listAccountNum(String accountNum);
	public String accountCount();
	public String date();
	public void updateDeposit(String account,int money);
	public void updateWidthraw(String account,int money);
	public void deleteAccount(String account);
}