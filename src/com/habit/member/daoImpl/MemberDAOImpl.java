package com.habit.member.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.habit.member.dao.MemberDAO;
import com.hanbit.member.constants.Database;
import com.hanbit.member.domain.MemberBean;

public class MemberDAOImpl implements MemberDAO{
	
	@Override
	public void insert(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberBean[] selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean[] selectByName(String name) {
		
		return null;
	}

	@Override
	public MemberBean selectById(String id) {
		MemberBean member = new MemberBean();
		
		try {
			Class.forName(Database.DRIVER);
			Connection conn = DriverManager.getConnection(Database.URL, Database.USERID, Database.PASSWORD);
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FroM Member WHERE id='"+id+"'";
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()){
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPassword(rs.getString("password"));
				member.setSNN(rs.getString("ssn"));
				System.out.println(member);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return member;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
