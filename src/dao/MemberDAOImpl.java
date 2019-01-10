package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import domain.MemberBean;
import factory.DatabaseFactory;

public class MemberDAOImpl implements MemberDAO {

	private static MemberDAOImpl instance = new MemberDAOImpl();
	private MemberDAOImpl() {}
	public static MemberDAOImpl getInstance() {return instance;}
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	@Override
	public void insertMember(MemberBean member) {
		try {
			int rs =DatabaseFactory
			.createDatabase("oracle")
			.getConnection()
			.createStatement()
			.executeUpdate(String.format(
					"INSERT INTO member(id,name,pass,ssn) \n"
					+ "VALUES('%s','%s','%s','%s')", 
					member.getId(),member.getName(),member.getPass(),member.getSsn()));
			if(rs ==1) {
				System.out.println("회원가입 성공");
			}else {
				System.out.println("회원가입 실패");
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<MemberBean> selectAllMembers() {
		ArrayList<MemberBean> list = new ArrayList<>();
		try {
			DatabaseFactory.
			createDatabase("oracle")
			.getConnection()
			.createStatement()
			.executeQuery("");
			String sql = String.format("", "");
			while(rs.next()) {
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ArrayList<MemberBean> selectMembersByName(String name) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean selectMemberById(String id) {
		MemberBean member = null;
		try {
			ResultSet rs = DatabaseFactory
				.createDatabase("oracle")
				.getConnection()
				.createStatement()
				.executeQuery(
						String.format("SELECT * FROM member\n" + 
						"WHERE id LIKE '%s'", id));
			while(rs.next()) { //값이 있으면 true
				member = new MemberBean();
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPass(rs.getString("pass"));
				member.setSsn(rs.getString("ssn"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}

	@Override
	public int countMembers() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			int res = stmt.executeUpdate(sql);
			if(res==1) {
			System.out.println();	
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public MemberBean existMember(String id, String pass) {
		MemberBean member = null; 
		try {
			 rs = DatabaseFactory
			.createDatabase("oracle")
			.getConnection()
			.createStatement()
			.executeQuery(String.format("SELECT * FROM member\n" + 
							"WHERE id LIKE '%s' and pass LIKE '%s' ", id,pass));
			 while(rs.next()) {
				 member = new MemberBean();
				 member.setId(rs.getString("id"));
				 member.setPass(rs.getString("pass"));
				 member.setName(rs.getString("name"));
				 member.setSsn(rs.getString("ssn"));
				 
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}
	@Override
	public void updateMember(MemberBean member) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteMember(String id,String pass) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
