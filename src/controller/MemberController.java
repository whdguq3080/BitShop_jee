package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import domain.MemberBean;
import service.MemberService;
import service.MemberServiceImpl;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberBean member = null;
		MemberService memberService = MemberServiceImpl.getInstance();
		/**
		 * 디폴트 값
		 * cmd : move
		 * dir : member
		 * page : main
		 * dest : NONE
		 */
		String cmd = request.getParameter("cmd");
		cmd = (cmd == null) ? "move" : cmd ;
		String page = request.getParameter("page");
		if(page == null) {page = "main";}
		String dest = request.getParameter("dest");
		if(dest == null) {dest = "NONE";}
		System.out.println("page"+page);
		String dir = request.getParameter("dir");
		if(dir== null) {
			String sPath= request.getServletPath();
			sPath = sPath.replace(".do", "");
			System.out.println("sPath   : "+sPath);
			dir = sPath.substring(1);
		}
		System.out.println("cmd:"+cmd);
		System.out.println("dir:"+dir);
		
		switch (cmd) {
		case "login":
			member = new MemberBean();
			String id = request.getParameter("uid");
			String pass = request.getParameter("upw");
			boolean login = memberService.existMember(id, pass);
			if (login) {
				member = memberService.findMemberById(member.getId());
				request.setAttribute("member",member);
				request.setAttribute("dest", dest);
			} else {
				dir="";
				page="index";
			}
			break;
		case "move":
			request.setAttribute("dest",dest);
			break;
		case "join":
			member = new MemberBean();
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("name"));
			member.setPass(request.getParameter("pass"));
			member.setSsn(request.getParameter("ssn"));
			memberService.createMember(member);
			member = memberService.findMemberById(member.getId());
			request.setAttribute("member", member);
			request.setAttribute("dest", dest);
			break;
		case "logout":
			dir="";
			page="index";
			break;
		}
		Command.move(request, response, dir,page);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
