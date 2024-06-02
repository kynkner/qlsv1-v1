package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import context.DBContext;
import qlsv.SV;

public class StudentDAO {
	Connection connection = null;
	PreparedStatement statement = null;
	ResultSet resultSet = null;
	
	public List<SV> getAllStudent() {
		List<SV> list = new ArrayList<>();
		String query = " SELECT * FROM qlsv.sv ";
		try {
			connection = new DBContext().getConnection();
			statement = connection.prepareStatement(query);
			resultSet = statement.executeQuery(); // Bảng kết quả sẽ hiện ra trong DB
			while (resultSet.next()) {
				list.add(new SV(resultSet.getString(1),
						resultSet.getString(2),
						resultSet.getString(3), 
						resultSet.getString(4),
						resultSet.getString(5)
						));
			}
			connection.close();
			statement.close();
			resultSet.close();
		}catch (Exception e) {
			return null;
		}
		
		return list;
	}
	
	public SV insertStudent(String MASV, String TENSV, 
			String HODEM, String TELSV, String EMAILSV) {
		
		String query = "INSERT INTO qlsv.sv"
				+ " values (?,?,?,?,?)";
		SV sv = null;
		try {
			connection = new DBContext().getConnection();
			statement = connection.prepareStatement(query);
			statement.setString(1, MASV);
			statement.setString(2, TENSV);
			statement.setString(3, HODEM);
			statement.setString(4, TELSV);
			statement.setString(5, EMAILSV);
			statement.executeUpdate();
			
			sv = new SV(MASV,TENSV,HODEM,TELSV,EMAILSV);
			
			connection.close();
			statement.close();
			resultSet.close();
		}catch (Exception e) {
			return sv;
		}
		return sv;
	}
	
	public SV updateStudent(String MASV, String TENSV, 
			String HODEM, String TELSV, String EMAILSV) {
		String sql="UPDATE qlsv.sv SET TENSV='"+TENSV+"', HODEM='"+ HODEM +"'";
    	if(EMAILSV!=null && EMAILSV.length()>0) sql=sql+", EMAILSV='"+EMAILSV+"'";
        if(TELSV!=null && TELSV.length()>0) sql=sql+", TELSV='"+TELSV+"'";
        sql=sql+" WHERE MASV ='"+MASV+"';";
		SV sv = null;
		try {
			connection = new DBContext().getConnection();
			statement = connection.prepareStatement(sql);
			statement.executeUpdate();
			
			sv = new SV(MASV,TENSV,HODEM,TELSV,EMAILSV);
			
			connection.close();
			statement.close();
			resultSet.close();
		}catch (Exception e) {
			return sv;
		}
		return sv;
	}
	
	public SV deleteStudent(String MASV) {
		String sql="DELETE FROM qlsv.sv " +
                " WHERE MASV='" + MASV + "';";
		SV sv = null;
		try {
			sv = findStudentById(MASV);
			connection = new DBContext().getConnection();
			statement = connection.prepareStatement(sql);
//			statement.setString(5, MASV);
//			statement.setString(1, TENSV);
//			statement.setString(2, HODEM);
//			statement.setString(3, TELSV);
//			statement.setString(4, EMAILSV);
			statement.executeUpdate();
			
			
			connection.close();
			statement.close();
			resultSet.close();
		}catch (Exception e) {
			return sv;
		}
		return sv;
	}
	
	public SV findStudentById(String MASV) {
		String sql= " SELECT * FROM qlsv.sv WHERE MASV ='"+ MASV +"';";
		SV sv = null;
		try {
			connection = new DBContext().getConnection();
			statement = connection.prepareStatement(sql);
			resultSet = statement.executeQuery(); // Bảng kết quả sẽ hiện ra trong DB
			if (resultSet.next()) {
				sv = new SV(resultSet.getString(1),
						resultSet.getString(2),
						resultSet.getString(3), 
						resultSet.getString(4),
						resultSet.getString(5)
						);
			}
			connection.close();
			statement.close();
			resultSet.close();
		}catch (Exception e) {
			return sv;
		}
		
		return sv;
	}
}
