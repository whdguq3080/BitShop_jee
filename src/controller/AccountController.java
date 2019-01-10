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
		case "open-account":
			System.out.println("open-account");
			String money = request.getParameter("money");
			String accNum = accountService.createAccountNum(Integer.parseInt(money));
			AccountBean acc= accountService.listAccountNum(accNum);
			String dest = request.getParameter("dest");
			if(dest ==null) {
				dest ="open-result";
			}
			request.setAttribute("dest",dest );
			request.setAttribute("acc", acc);
			System.out.println("acc" +acc);
			Command.move(request, response, dir,page);
			break;
		case "move":
			System.out.println("액션이 이동");
			dest = request.getParameter("dest");
			if(dest ==null) {
				dest ="NONE";
			}
			request.setAttribute("dest",dest );
			Command.move(request, response, dir,page);
			break;
		case "account-detail":
			
			break;
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
