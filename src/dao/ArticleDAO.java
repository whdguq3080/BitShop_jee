package dao;

import java.util.ArrayList;

import domain.AdminBean;

public interface ArticleDAO {
	public void joinAdmin();
	public ArrayList<AdminBean> findAll();
	public ArrayList<AdminBean> findSome();
	public ArrayList<AdminBean> findOne();
	public int count();
	public void exist();
	public void update();
	public void delete();
}
