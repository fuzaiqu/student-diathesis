package com.dw.controll;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dw.dao.StudentDao;
import com.dw.dao.impl.StudentDaoImpl;
import com.dw.dao.impl.UserDaoImpl;
import com.dw.model.Student;
import com.dw.model.User;





public class PreServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String method = (String) request.getParameter("method");
		if ("studentAdd".equals(method)) {
			studentAdd(request, response);
		} else if ("updateStudent".equals(method)) {
			updateStudent(request, response);
		}else if("preupdatetepwd".equals(method)){
			preupdatetepwd(request, response);
		}else if(method==null){
			updatetepwd(request, response);
		}
	}
	
	
	
	
	public void studentAdd(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String mainPage = "studentAdd.jsp";
		request.setAttribute("mainPage", mainPage);
		RequestDispatcher dispatcher = request.getRequestDispatcher("main.jsp");
		dispatcher.forward(request, response);
	}
	
	
	
	
	
	public void updateStudent(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		StudentDao studao = new StudentDaoImpl();
		int ids = Integer.parseInt(id);
		Student student = studao.findStudentByid(ids);
		request.setAttribute("student", student);
		String mainPage = "studentUpdate.jsp";
		request.setAttribute("mainPage", mainPage);
		RequestDispatcher dispatcher = request.getRequestDispatcher("main.jsp");
		dispatcher.forward(request, response);
	}
	
	
	
	
	
	public void preupdatetepwd(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String mainPage = "updatepwd.jsp";
		request.setAttribute("mainPage", mainPage);
		RequestDispatcher dispatcher = request.getRequestDispatcher("main.jsp");
		dispatcher.forward(request, response);
	}
	
	
	
	
	
	public void updatetepwd(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session=request.getSession();
		 String username=(String)session.getAttribute("username");
		 String repassword=request.getParameter("repassword");
		 User user=new User(username,repassword);
		 UserDaoImpl userdao=new UserDaoImpl();
		 int a=userdao.updateUserPassWord(user);
		 if(a!=0){
			 String mainPage = "updatepwdSuccess.jsp";
			 request.setAttribute("mainPage", mainPage);
		 }else{
			 request.setAttribute("error", "����ʧ��");
		 }
		    RequestDispatcher dispatcher = request.getRequestDispatcher("main.jsp");
			dispatcher.forward(request, response);
	}
	
	
}
