package com.test.ex.cmd;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.ex.dao.Bdao;

public class bWriteCommand implements BCommand{

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		
		// DB 접속하기 Bdao dao = new Bdao();
		// | dao.write(bName, bTitle, bContent);
		// --> DB에서 동작할 수 있도록 구현하기
		Bdao dao = new Bdao();
		try {
			dao.write(bName, bTitle, bContent);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
