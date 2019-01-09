package dao;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountDAO {
	//CRUD
	public void insertAccountNum(int money);
	public String selectAccountNum();
	public ArrayList<AccountBean> bankNumList();
	public AccountBean listAccountNum(String accountNum);
	public String accountCount();
	public void depositMoney(String account,int money);
	public void WithdrawalMoney(String account,int money);
	public void cutAccount(String account);
}