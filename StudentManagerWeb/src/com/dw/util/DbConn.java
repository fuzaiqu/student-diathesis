package com.dw.util;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

public class DbConn {
	/**
	 获取连接方法
	  **/

	
	public static Connection getConn() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?useUnicode=true&characterEncoding=UTF-8", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void main(String[] args) {
		try {
			DbConn.getConn();
			System.out.println("测试");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
