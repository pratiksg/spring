package com.capgemini.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.model.BankAccount;
//import com.capgemini.bankapp.util.DbUtil;
import javax.sql.DataSource;

public class BankAccountDaoImpl implements BankAccountDao {


	public JdbcTemplate jdbcTemplate;

	public BankAccountDaoImpl(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate=jdbcTemplate;
	}

	

	@Override
	public boolean addNewBankAccount(BankAccount account) {
		
		int result=jdbcTemplate.update("INSERT INTO bankappaccount (customer_name,account_type,account_balance) VALUES(?,?,?)",new Object[]{account.getAccountHolderName(),account. getAccountType(),account.getAccountBalance()}); 

		if(result==1)
			return true;
		else
			return false;

	}
	

	@Override
	public boolean deleteBankAccount(long accountId) {
		String query = "DELETE FROM bankappaccount WHERE account_id="+accountId;
		int result=jdbcTemplate.update(query);
		if(result>0){
			return true;
		}else{
			return false;
		}
	}


	@Override
	public BankAccount searchAccount(long accountId) 
	{
		String query = "SELECT * FROM bankappaccount WHERE account_id=" +accountId;
		BankAccount account=jdbcTemplate.queryForObject(query,(resultSet,row)->{
		BankAccount accounts= new BankAccount(resultSet.getLong(1),resultSet.getString(2),resultSet.getString(3),resultSet.getDouble(4));
			
			return accounts;});
			return account;
			
		
	}
	@Override
	public double getBalance(long accountId) {
		String query = "SELECT account_balance FROM bankappaccount WHERE account_id=?";
		double balance = -1;

			balance=jdbcTemplate.queryForObject(query, new Object[]{accountId},Double.class);
			
		return balance;
	}
	@Override
	public List<BankAccount>findAllBankAccounts() 
	{
 		String query1 = "SELECT * FROM bankappaccount";
 		List<BankAccount> accounts = jdbcTemplate.query(query1,(resultSet,row)->{
     		BankAccount account= new BankAccount(resultSet.getLong(1), 
     		resultSet.getString(2), resultSet.getString(3),resultSet.getDouble(4));
     		return account;
  		});

 		return accounts;
	}
 	
	@Override
	public boolean updateAccountDetails(long accountId, String accountHolderName, String accountType) 
	{

 		String query = "UPDATE bankappaccount SET customer_name= '"+ accountHolderName +"' ,account_type= '"+ accountType+"'  WHERE account_id= '"+ accountId+"' ";
 		int result = jdbcTemplate.update(query);

 		if(result > 0)
  		return true;
 		else
  		return false;
	
	}
	/*
	@Override
	public void updateBalance(long accountId, double newBalance) {
		String query = "UPDATE bankappaccount SET account_balance='"+newBalance+"' WHERE account_id='"+accountId+"' ";
		jdbcTemplate.update(query);
		
	}*/
}
