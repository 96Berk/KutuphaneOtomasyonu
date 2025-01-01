package kutuphaneOtomasyonu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VeriTabaniBaglantisi {
	
	static Connection myConn;
	static Statement myState;
	
	
	static ResultSet yap() {
		ResultSet myRs=null;
		try {
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kutuphaneotomasyonu", "root", "");
			myState = myConn.createStatement();
			myRs = myState.executeQuery("select * from kullanicilar");
			System.out.println("baglanti basarili... 1");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Baglanti basarisiz... 1");
		}
		
		return myRs;
	}
	
	
	static void ekle (String sql_sorgu) {
		
		try {
			myState.executeUpdate(sql_sorgu);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void update(String sql_sorgu) {
		try {
			myState.executeUpdate(sql_sorgu);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void delete(String sql_sorgu) {
		try {
			myState.executeUpdate(sql_sorgu);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	static ResultSet bul(String sql) {
		ResultSet myRs=null;
		
		try {
			myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/kutuphaneotomasyonu", "root", "");
			myState = myConn.createStatement();
			myRs = myState.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,"Bulunamadı!", "Hata1", JOptionPane.ERROR_MESSAGE);
		}
		return myRs;
	}
	
	

}
