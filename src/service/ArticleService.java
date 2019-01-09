package service;

import java.util.ArrayList;

import domain.AdminBean;

public interface ArticleService {
	public void createAdmin();
	public ArrayList<AdminBean> findArticle();
	public ArrayList<AdminBean> findSome();
	public ArrayList<AdminBean> findOne();
	public int countAdmin();
	public void exist();
	public void update();
	public void delete();
}
