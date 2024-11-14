package com.DAo;


	import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

	@WebServlet("/CheckBalanceServlet")
	public class Balnce  extends HttpServlet {
	    private static final long serialVersionUID = 1L;

	    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	            throws ServletException, IOException {
	        // Get the account number from the form
	        String accountNumber = request.getParameter("accno");

	        // Simulate fetching the balance (replace this with database logic in real applications)
	        double balance = getAccountBalance(accountNumber);

	        // Set response content type
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        
	        // Display balance information
	        out.println("<html><head><title>Account Balance</title></head><body>");
	        out.println("<h2>Account Balance</h2>");
	        out.println("<p>Account Number: " + accountNumber + "</p>");
	        out.println("<p>Current Balance: $" + balance + "</p>");
	        out.println("<a href='check_balance.html'>Check Another Balance</a>");
	        out.println("</body></html>");
	    }

	    // Simulated balance lookup - replace with actual database lookup
	    private double getAccountBalance(String accountNumber) {
	        // For the example, return a fixed amount or create a simple lookup
	        if ("123456".equals(accountNumber)) {
	            return 2500.00; // Example account balance
	        } else {
	            return 0.00; // Account not found or balance 0 for simplicity
	        }
	    }
	}



