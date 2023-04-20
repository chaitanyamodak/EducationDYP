package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.model.RegistrationModel;

public class RegistrationDao {
	RegistrationModel rModel;
	Connection con=null;
	MyConnection m=new MyConnection();
	PreparedStatement pstate;
	
	public int createAccount(RegistrationModel rModel) {
		con=m.getConnection();
		int i=0;
			try {
				pstate=con.prepareStatement("insert into StudTable values(?,?,?,?,?,?)");
				pstate.setString(1, rModel.getEmail());
				pstate.setString(2, rModel.getName());
				pstate.setString(3, rModel.getYear());
				pstate.setString(4, rModel.getCity());
				pstate.setString(5, rModel.getMobNo());
				pstate.setString(6, rModel.getPass());
				i=pstate.executeUpdate();
				
				if(i>0)
				{
					System.out.println("Account created");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		return i;
	}
	
	
	public int checkUser(String userName, String pass) {
		con=m.getConnection();
		int i=0;
			try {
				pstate=con.prepareStatement("select * from StudTable where email = (?) and pass = (?)");
				pstate.setString(1, userName);
				pstate.setString(2, pass);
				ResultSet rs=pstate.executeQuery();
				
				if(rs.next())
				{
					System.out.println("Login successfull");
					i++;
				}
				else {
					System.out
							.println("Username/Pass doesn't match");
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		return i;
	}
	

}
