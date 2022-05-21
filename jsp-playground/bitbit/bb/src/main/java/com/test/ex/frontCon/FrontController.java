package com.test.ex.frontCon;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.ex.cmd.BCommand;
import com.test.ex.cmd.bListCommand;
import com.test.ex.cmd.bWriteCommand;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGet");
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
		actionDo(request, response);
		doGet(request, response);
	}
	
	/*  주문 받는 곳*/
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("actionDo");
		request.setCharacterEncoding("UTF-8");
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		//해당 영역만 뽑아옴
		String cmd = uri.substring(conPath.length());
		String viewPage = null;
		
		System.out.println("uri : " + uri);
		System.out.println("conPath : " + conPath);
		System.out.println("cmd : " + cmd);
		
		BCommand command = null;
		
		if(cmd.equals("/write_view.do")) { //요청
			//Bcommnd command = new BwriteCommand();
			//이 부분은 간략히 나열만 한다.
			viewPage = "write_form.jsp";
		} else if(cmd.equals("/write.do")) {
			command = new bWriteCommand();
			command.excute(request, response);
			viewPage = "list.do";
		} else if(cmd.equals("/list.do")) {
			command = new bListCommand();
			command.excute(request, response);
			viewPage = "list.do";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}

}
