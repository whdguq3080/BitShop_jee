package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		String page = request.getParameter("page");
		if(page == null) {page = "main";}
		String dir = request.getParameter("dir");
		if(dir== null) {
			String sPath= request.getServletPath();
			sPath = sPath.replace(".do", "");
			System.out.println("sPath   : "+sPath);
			dir = sPath.substring(1);
		}
		System.out.println("dir : "+dir);
		
		switch ((cmd == null) ? "move" : cmd) {
		case "login":
			String id = request.getParameter("uid");
			String pass = request.getParameter("upw");
			
			if (id.equals("test") && pass.equals("test")) {
			} else {
				dir="";
				page="index";
			}
			Command.move(request, response, dir,page);
			break;
		case "move":
			String dest = request.getParameter("dest");
			if(dest ==null) {
				dest ="NONE";
			}
			request.setAttribute("dest",dest );
			Command.move(request, response, dir,page);
			break;
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
