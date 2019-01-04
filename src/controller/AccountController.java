package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import domain.AccountBean;
import service.AccountService;
import service.AccountServiceImpl;

@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AccountService accountService = new AccountServiceImpl();
		String cmd = request.getParameter("cmd");
		cmd = (cmd == null) ? "move" : cmd ;
		System.out.println(cmd);
		String page = request.getParameter("page");
		if(page == null) {page = "main";}
		System.out.println(page);
		String dir = request.getParameter("dir");
		if(dir==null) {	
			String sPath = request.getServletPath();
			sPath = sPath.replace(".do", "");
			dir= sPath.substring(1);
		}
		System.out.println(dir);
		switch(cmd) {
		case "move":
			System.out.println("액션이 이동");
			Command.move(request, response, dir,page);
			break;
		case "open-account":
			String money = request.getParameter("money");
			String accNum = accountService.openAccountNum(Integer.parseInt(money));
			AccountBean acc= accountService.listAccountNum(accNum);
			request.setAttribute("acc", acc);
			request.setAttribute("compo", "acc-success");
			Command.move(request, response, dir,page);
			break;
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
