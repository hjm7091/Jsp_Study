package com.javalec.ex25;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MemberAllService implements Service {

	public MemberAllService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<MemberDto> execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		MemberDao dao = MemberDao.getInstance();
		return dao.membersAll();
	}
	
}