package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.User;
import com.util.MakeConnection;

public class UserDao {

	Connection cn;

	public UserDao() {
		MakeConnection mkcon = new MakeConnection();
		cn = mkcon.mkConnection();
	}

	public boolean loginCheck(User u) {
		boolean b = false;
		try {
			// get data from database
			PreparedStatement ps = cn.prepareStatement("select * from user where uname=? and password=?");
			ps.setString(1, u.getUname());
			ps.setString(2, u.getPassword());
			ResultSet resultSet = ps.executeQuery();
			if (resultSet.next()) {
				b = true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
}
