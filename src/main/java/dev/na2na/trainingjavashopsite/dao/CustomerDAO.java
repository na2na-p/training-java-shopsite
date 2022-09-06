package dev.na2na.trainingjavashopsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dev.na2na.trainingjavashopsite.bean.CustomerBean;

public class CustomerDAO extends DAO {
	public CustomerBean search(String login, String password)
		throws Exception {
		CustomerBean customer=null;

		Connection con=getConnection();

		PreparedStatement st;
		st=con.prepareStatement(
			"select * from customer where login=? and password=?");
		st.setString(1, login);
		st.setString(2, password);
		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			customer=new CustomerBean();
			customer.setId(rs.getInt("id"));
			customer.setLogin(rs.getString("login"));
			customer.setPassword(rs.getString("password"));
		}

		st.close();
		con.close();
		return customer;
	}
}
