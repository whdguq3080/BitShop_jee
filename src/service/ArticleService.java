package service;

import java.util.ArrayList;

import domain.AdminBean;

public interface ArticleService {
	public void createAdmin();
	public ArrayList<AdminBean> findAll();
	public ArrayList<AdminBean> findSome();
	public ArrayList<AdminBean> findOne();
	public int count();
	public void exist();
	public void update();
	public void delete();
}
