package com.nit.test;

import java.io.IOException;

import com.DAo.AccountDao;
import com.common.UserBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/account")
public class AccountServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserBean ub=new UserBean();
		ub.setuName(request.getParameter("uname"));
		ub.setpWord(request.getParameter("pword"));
		ub.setRePWord(request.getParameter("repass"));
		ub.setAddress(request.getParameter("add"));
		ub.setPhNo(Long.parseLong(request.getParameter("phone")));
		ub.setAmount(Double.parseDouble(request.getParameter("amt")));
		long random10DigitNumber = (long) (Math.random() * 1_000_000_0000L);
		ub.setAccNo(random10DigitNumber);
		int k = new AccountDao().createAccount(ub);
		if(k>0)
		{
			request.setAttribute("msg", "Account Created Successfully");
			request.getRequestDispatcher("account_create_success.jsp").include(request, response);
		}
		else {
			request.setAttribute("msg", "Account Creation Failed");
			request.getRequestDispatcher("account_create_failed.jsp").include(request, response);
		}
	}

}
