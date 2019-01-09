package service;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;

import domain.AccountBean;

public class AccountServiceImpl implements AccountService {
	private ArrayList<AccountBean> list;
	public AccountServiceImpl() {
		list = new ArrayList<>();
	}
	@Override
	public String createAccountNum(int money) {
		String accountNum = "";
		AccountBean account = new AccountBean();
		account.setAccountNum(openAccountNum());
		account.setMoney(money);
		list.add(account);
		accountNum = account.getAccountNum();
		return accountNum;
	}
	@Override
	public String openAccountNum() {
		Random random = new Random();
		return random.nextInt(9000)+1000+"-"+random.nextInt(10000);	
	}
	@Override
	public ArrayList<AccountBean> accountlist() {
		return list;
	}
	@Override
	public AccountBean listAccountNum(String accountNum) {
		AccountBean account = new AccountBean();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				account = list.get(i);
				break;
			}
		}
		return account;
	}
	@Override
	public String accountCount() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updateDeposit(String account, int money) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateWithdrawal(String account, int money) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAccount(String account) {
		// TODO Auto-generated method stub
		
	}
}
