package com.techaspect.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import javax.sql.DataSource;

import com.techaspect.entity.Address;
import com.techaspect.entity.Customer;

import org.apache.log4j.Logger;

public class CustomerDao extends Dao {
	private final static Logger LOGGER = Logger.getLogger(CustomerDao.class);
	public boolean insertCustomer(Customer customer) {
		boolean status = false;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement pStmt=null;
		PreparedStatement pStmt2=null;
		try {
			LOGGER.debug(" insertCustomer execution started");
			DataSource dataSource = getDataSource();
			con = dataSource.getConnection();
			
			
			String sqlDuplicateCheck = "SELECT cust_email FROM customer_information WHERE cust_email=?";
			pStmt = openPreparedStatement(con,sqlDuplicateCheck);
			
			pStmt.setString(1, customer.getEmail());
			
			rs = pStmt.executeQuery();
			if(rs.next()) {
				status=false;
			}else {
				//String sql = "INSERT INTO customer_information(cust_fname,cust_lname,cust_email,cust_password) VALUES('"+customer.getFirstName()+"','"+customer.getLastName()+"','"+customer.getEmail()+"','"+customer.getPassword()+"')";
				String sql = "INSERT INTO customer_information(cust_fname,cust_lname,cust_email,cust_password) VALUES(?,?,?,?)";
				pStmt2 = openPreparedStatement(con,sql);
				pStmt2.setString(1,customer.getFirstName());
				pStmt2.setString(2,customer.getLastName());
				pStmt2.setString(3,customer.getEmail());
				pStmt2.setString(4,customer.getPassword());
				int rows = pStmt2.executeUpdate();
				if(rows != 0) {
					status = true;
				}
			}
		}catch(SQLException sqle) {
			//sqle.printStackTrace();
			LOGGER.error("Exception Occured.", sqle);
		} finally {
			closePreparedStatement(pStmt2);
			closePreparedStatement(pStmt);
			closeStatement(stmt);
			closeStatement(stmt);
			closeConnection(con);
		}
		LOGGER.debug("insertCustomer execution ending");
		return status;
	}
	
	public boolean loginCustomer(Customer customer,Address address) {
		LOGGER.debug("loginCustomer function started");
		boolean status = false;
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs=null;
		ResultSet rs2 = null;
		PreparedStatement pStmt=null;
		try {
			DataSource dataSource = getDataSource();
			con = dataSource.getConnection();
	
			//String sql = "SELECT * FROM customer_information WHERE cust_email = '" + customer.getEmail() + "' AND cust_password='" + customer.getPassword() + "'";
			String sql = "select * from customer_information where cust_email = ? AND cust_password = ?";
			pStmt = openPreparedStatement(con,sql);

			pStmt.setString(1, customer.getEmail());
			pStmt.setString(2, customer.getPassword());
			rs = pStmt.executeQuery();
			stmt = con.createStatement();
			if(rs.next()) {
				status = true;
				customer.setId(rs.getInt("cust_id"));
				customer.setFirstName(rs.getString("cust_fname"));
				customer.setLastName(rs.getString("cust_lname"));
				customer.setEmail(rs.getString("cust_email"));
				customer.setPassword(rs.getString("cust_password"));
				customer.setContact(rs.getString("cust_contact"));
				customer.setGender(rs.getString("cust_gender"));
				
				String sqlFetchAddress = "SELECT * FROM address_information WHERE cust_id="+customer.getId();
				rs2=stmt.executeQuery(sqlFetchAddress);
				
				if(rs2.next()) {
					
					address.setId(rs2.getInt("add_id"));
					address.setCust_id(rs2.getInt("cust_id"));
					address.setAddress(rs2.getString("add_address"));
					address.setCity(rs2.getString("add_city"));
					address.setZip(rs2.getString("add_zip"));
					address.setState(rs2.getString("add_state"));
					address.setCountry(rs2.getString("add_country"));
					
				}
			}
			
			
		} catch(SQLException sqle) {
			//sqle.printStackTrace();
			LOGGER.error("Exception Occured.", sqle);
		} finally {
			closePreparedStatement(pStmt);
			closeResultSet(rs2);
			closeResultSet(rs);
			closeStatement(stmt);
			closeConnection(con);
		}
		LOGGER.debug("loginCustomer function ended");
		return status;
		
	}
	
	public boolean changePassword(Customer customer,String newPassword,String oldPassword) {
		LOGGER.debug(" changePassword execution started");
		boolean status = false;
		Connection con = null;
		Statement stmt = null;
		try {
			DataSource dataSource = getDataSource();
			con = dataSource.getConnection();

			String custOldPassword = customer.getPassword();
			stmt = con.createStatement();
			if(custOldPassword.equals(oldPassword)) {
				String sqlUpdatePassword = "UPDATE customer_information SET cust_password='"+newPassword+"'WHERE cust_id='"+customer.getId()+"'";
				int row = stmt.executeUpdate(sqlUpdatePassword);
				if(row != 0) {
					status = true;
					customer.setPassword(newPassword);
				}else {
					status = false;
				}
				
			}else {
				status = false;
			}
			
		}catch(SQLException sqle) {
			//sqle.printStackTrace();
			LOGGER.error("Exception Occured.", sqle);
		} finally {
			closeStatement(stmt);
			closeConnection(con);
		}
		LOGGER.debug(" changePassword execution ended");
		return status;
	}


public boolean updateAccount(Customer customer,Address address, Address addressData) {
	LOGGER.debug(" updateAccount execution started");
	boolean status = false;
	Connection con = null;
	Statement stmt = null;
	ResultSet rs=null;
	PreparedStatement pStmt=null;
	PreparedStatement pStmt2=null;
	PreparedStatement pStmt3=null;
	
	//String addressValue = address.getAddress();
	try {
		DataSource dataSource = getDataSource();
		con = dataSource.getConnection();
		
		if(addressData.getAddress() == null){
			//String sqlAddAddress = "INSERT into address_information(cust_id,add_address,add_zip,add_city,add_state,add_country) VALUES('"+customer.getId()+"','"+address.getAddress()+"','"+address.getZip()+"','"+address.getCity()+"','"+address.getState()+"','"+address.getCountry()+"')";
			String sqlAddAddress = "INSERT into address_information(cust_id,add_address,add_zip,add_city,add_state,add_country) VALUES(?,?,?,?,?,?)";
			pStmt2 = openPreparedStatement(con,sqlAddAddress);
			pStmt2.setInt(1, customer.getId());
			pStmt2.setString(2, address.getAddress());
			pStmt2.setString(3, address.getZip());
			pStmt2.setString(4, address.getCity());
			pStmt2.setString(5,address.getState());
			pStmt2.setString(6,address.getCountry());
			int rowAddress = pStmt2.executeUpdate();
			if(rowAddress !=0) {
				status = true;
			}
		}else {
			//String sqlUpdateAddress = "UPDATE address_information SET add_address = '"+address.getAddress()+"',add_zip='"+address.getZip()+"',add_city='"+address.getCity()+"',add_state='"+address.getState()+"',add_country='"+address.getCountry()+"'WHERE cust_id="+customer.getId();
			String sqlUpdateAddress = "UPDATE address_information SET add_address = ?,add_zip=?,add_city=?,add_state=?,add_country=? WHERE cust_id=?";
			pStmt3 = openPreparedStatement(con,sqlUpdateAddress);
			pStmt3.setString(1, address.getAddress());
			pStmt3.setString(2,address.getZip());
			pStmt3.setString(3, address.getCity());
			pStmt3.setString(4, address.getState());
			pStmt3.setString(5,address.getCountry());
			pStmt3.setInt(6, customer.getId());
			int rowsAddressUpdate = pStmt3.executeUpdate();
			   if(rowsAddressUpdate !=0) {
				   status = true;
			   }
		}
		
			//String sqlCustomer = "UPDATE customer_information SET cust_fname='"+customer.getFirstName()+"',cust_lname='"+customer.getLastName()+"',cust_email='"+customer.getEmail()+"',cust_contact='"+customer.getContact()+"',cust_gender='"+customer.getGender()+"'WHERE cust_id="+customer.getId();
			String sqlCustomer = "UPDATE customer_information SET cust_fname=?,cust_lname=?,cust_email=?,cust_contact=?,cust_gender=? WHERE cust_id=?";
			pStmt = openPreparedStatement(con,sqlCustomer);
			pStmt.setString(1,customer.getFirstName());
			pStmt.setString(2,customer.getLastName());
			pStmt.setString(3,customer.getEmail());
			pStmt.setString(4,customer.getContact());
			pStmt.setString(5, customer.getGender());
			pStmt.setInt(6, customer.getId());
			int rowCustomer = pStmt.executeUpdate();
			if(rowCustomer !=0) {
				status = true;
			}
	
		
		}catch(SQLException sqle) {
			//sqle.printStackTrace();
			LOGGER.error("Exception Occured.", sqle);
		} finally {
			closeStatement(stmt);
			closeConnection(con);
		}
		LOGGER.debug(" updateAccount execution ended");
		return status;
	}

	public boolean contact(String fname,String lname,String email,String subject,String message) {
		boolean status = false;
		Connection con = null;
		Statement stmt = null;
		int rows;
		
		try {
			String sql = "INSERT INTO contact_information(cont_fname,cont_lname,cont_email,cont_subject,cont_message) VALUES('"+fname+"','"+lname+"','"+email+"','"+subject+"','"+message+"')";
			DataSource dataSource = getDataSource();
			con = dataSource.getConnection();
			stmt = con.createStatement();
			rows = stmt.executeUpdate(sql);
			if(rows !=0) {
				status = true;
			}
		} catch(SQLException sqle) {
			//sqle.printStackTrace();
			LOGGER.error("Exception Occured.", sqle);
		} finally {
			closeStatement(stmt);
			closeConnection(con);
		}
		
		return status;
	}
}
