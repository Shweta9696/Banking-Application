package com.DAo;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.common.DBConnection;
import com.common.UserBean;

public class AccountDao {

	int k=0;
	public int createAccount(UserBean ub)
	{
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("insert into bankaccount values(?,?,?,?,?,?,?)");
		    ps.setString(2, ub.getuName());
		    ps.setString(3, ub.getpWord());
		    ps.setString(4, ub.getRePWord());
		    ps.setDouble(5,ub.getAmount());
		    ps.setString(6, ub.getAddress());
		    ps.setLong(7, ub.getPhNo());
		    ps.setLong(1, ub.getAccNo());
		    k = ps.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}
