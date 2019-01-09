package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountService {
	//CRUD
	public String createAccountNum(int money);
	public String openAccountNum();
	public ArrayList<AccountBean> accountlist();
	public AccountBean listAccountNum(String accountNum);
	public String accountCount();
	public void updateDeposit(String account,int money);
	public void updateWithdrawal(String account,int money);
	public void deleteAccount(String account);
}