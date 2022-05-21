package com.test.ex.cmd;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.ex.dao.Bdao;
import com.test.ex.dto.Bdto;

public class bListCommand implements BCommand{

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		Bdao dao = new Bdao();
		ArrayList<Bdto> dtos = dao.list();
		request.setAttribute("list", dtos);
	}
}
