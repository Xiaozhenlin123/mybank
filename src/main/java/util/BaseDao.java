package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	static Connection conn=null;
	static PreparedStatement pre=null;
	static ResultSet ret=null;
	
	
	

	public static void linkshu(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mybank", "root", "root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static int zsg(String sql,Object...qwe){
		linkshu();
		int r=0;
		try {
			pre=conn.prepareStatement(sql);
			if(qwe!=null){
				for(int i=0;i<qwe.length;i++){
					pre.setObject(i+1,qwe[i]);
				}
			}
			 r=pre.executeUpdate();
			return r; 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bi();
		}
		return r;
	}

	public static ResultSet cha(String sql,Object...qwe){
		linkshu();
		
		try {
			pre=conn.prepareStatement(sql);
			if(qwe!=null){
				for(int i=0;i<qwe.length;i++){
					pre.setObject(i+1,qwe[i]);
				}
			}
			ret=pre.executeQuery();
			return ret;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
		
	} 
	public static ResultSet chacount(String sql,Object...qwe){
		linkshu();
		
		try {
			pre=conn.prepareStatement(sql);
			if(qwe!=null){
				for(int i=0;i<qwe.length;i++){
					pre.setObject(i+1,qwe[i]);
				}
			}
			ret=pre.executeQuery();
			return ret;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
		
	} 

	public static void  bi(){
		try {
			if(ret!=null){
				ret.close();
			}
			if(pre!=null){
				pre.close();
			}
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
	}

}
