//package com.highradius.implementation;
//import  com.highradius.connection.*;
//import com.highradius.model.Invoice;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.*;
//public class InvoiceDaoImpl implements InvoiceDao
//{
//	public DatabaseConnection databaseConnection;
//	public void init() 
//	{
//		this.databaseConnection = new DatabaseConnection();
//	}
//	@Override
//	public List<Invoice> getInvoice() 
//	{
//		String query = "Select * from hrc_data.h2h_oap;";
//		List<Invoice> customers = new ArrayList<>();
//		try 
//		{
//			Connection con = DatabaseConnection.connect();
//			Statement stmt = con.createStatement();  	
//			ResultSet rs = stmt.executeQuery(query);
//			while(rs.next()) 
//			{
//				int Sl_no = rs.getInt("Sl_no");
//				int CUSTOMER_ORDER_ID = rs.getInt("CUSTOMER_ORDER_ID");
//				int SALES_ORG = rs.getInt("SALES_ORG");
//				String DISTRIBUTION_CHANNEL= rs.getString("DISTRIBUTION_CHANNEL"); 
//				String DIVISION = rs.getString("DIVISION"); 
//				double RELEASED_CREDIT_VALUE = rs.getDouble("RELEASED_CREDIT_VALUE"); 
//				String PURCHASE_ORDER_TYPE = rs.getString("PURCHASE_ORDER_TYPE");
//				int COMPANY_CODE = rs.getInt("COMPANY_CODE"); 
//				String ORDER_CREATION_DATE = rs.getString("ORDER_CREATION_DATE"); 
//				String ORDER_CREATION_TIME = rs.getString("ORDER_CREATION_TIME");  
//				String CREDIT_CONTROL_AREA = rs.getString("CREDIT_CONTROL_AREA"); 
//				int SOLD_TO_PARTY = rs.getInt("SOLD_TO_PARTY");
//				double ORDER_AMOUNT = rs.getDouble("ORDER_AMOUNT"); 
//				String REQUESTED_DELIVERY_DATE = rs.getString("REQUESTED_DELIVERY_DATE"); 
//				String ORDER_CURRENCY = rs.getString("ORDER_CURRENCY"); 
//				String CREDIT_STATUS = rs.getString("CREDIT_STATUS"); 
//				int CUSTOMER_NUMBER = rs.getInt("CUSTOMER_NUMBER"); 
//				double AMOUNT_IN_USD = rs.getDouble("AMOUNT_IN_USD"); 
//				double UNIQUE_CUST_ID = rs.getDouble("UNIQUE_CUST_ID");
//				customers.add(new Invoice(Sl_no,
//							CUSTOMER_ORDER_ID,
//							SALES_ORG,
//							DISTRIBUTION_CHANNEL,
//							DIVISION,
//							RELEASED_CREDIT_VALUE,
//							PURCHASE_ORDER_TYPE,
//							COMPANY_CODE,
//							ORDER_CREATION_DATE,
//							ORDER_CREATION_TIME,
//							CREDIT_CONTROL_AREA,
//							SOLD_TO_PARTY,
//							ORDER_AMOUNT,
//							REQUESTED_DELIVERY_DATE,
//							ORDER_CURRENCY,
//							CREDIT_STATUS,
//							CUSTOMER_NUMBER,
//							AMOUNT_IN_USD,
//							UNIQUE_CUST_ID));
//			}
//			con.close();
//		} 
//		  catch (ClassNotFoundException e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		catch (SQLException e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return customers;
//	}
//	@Override
//	public ArrayList<Invoice> getInvoice(int start, int end) 
//	{
//		// TODO Auto-generated method stub
//		String query = "Select * from hrc_data.h2h_oap limit ?,?;";
//		DatabaseConnection databaseConnection = new DatabaseConnection();
//		try 
//		{
//			Connection con = DatabaseConnection.connect();	 
//			PreparedStatement p  = con.prepareStatement(query);
//			p.setInt(1,start);
//			p.setInt(2,end);
//			ResultSet rs = p.executeQuery();
//			while(rs.next()) 
//			{	
//				int Sl_no = rs.getInt("Sl_no");
//				int CUSTOMER_ORDER_ID = rs.getInt("CUSTOMER_ORDER_ID");
//				int SALES_ORG = rs.getInt("SALES_ORG");
//				String DISTRIBUTION_CHANNEL= rs.getString("DISTRIBUTION_CHANNEL"); 
//				String DIVISION = rs.getString("DIVISION"); 
//				double RELEASED_CREDIT_VALUE = rs.getDouble("RELEASED_CREDIT_VALUE"); 
//				String PURCHASE_ORDER_TYPE = rs.getString("PURCHASE_ORDER_TYPE");
//				int COMPANY_CODE = rs.getInt("COMPANY_CODE"); 
//				String ORDER_CREATION_DATE = rs.getString("ORDER_CREATION_DATE"); 
//				String ORDER_CREATION_TIME = rs.getString("ORDER_CREATION_TIME");  
//				String CREDIT_CONTROL_AREA = rs.getString("CREDIT_CONTROL_AREA"); 
//				int SOLD_TO_PARTY = rs.getInt("SOLD_TO_PARTY");
//				double ORDER_AMOUNT = rs.getDouble("ORDER_AMOUNT"); 
//				String REQUESTED_DELIVERY_DATE = rs.getString("REQUESTED_DELIVERY_DATE"); 
//				String ORDER_CURRENCY = rs.getString("ORDER_CURRENCY"); 
//				String CREDIT_STATUS = rs.getString("CREDIT_STATUS"); 
//				int CUSTOMER_NUMBER = rs.getInt("CUSTOMER_NUMBER"); 
//				double AMOUNT_IN_USD = rs.getDouble("AMOUNT_IN_USD"); 
//				double UNIQUE_CUST_ID = rs.getDouble("UNIQUE_CUST_ID");	
//				Invoice i = new Invoice(Sl_no,
//						CUSTOMER_ORDER_ID,
//						SALES_ORG,
//						DISTRIBUTION_CHANNEL,
//						DIVISION,
//						RELEASED_CREDIT_VALUE,
//						PURCHASE_ORDER_TYPE,
//						COMPANY_CODE,
//						ORDER_CREATION_DATE,
//						ORDER_CREATION_TIME,
//						CREDIT_CONTROL_AREA,
//						SOLD_TO_PARTY,
//						ORDER_AMOUNT,
//						REQUESTED_DELIVERY_DATE,
//						ORDER_CURRENCY,
//						CREDIT_STATUS,
//						CUSTOMER_NUMBER,
//						AMOUNT_IN_USD,
//						UNIQUE_CUST_ID
//						);
//				databaseConnection.addInvoice(i);
//			}
//			con.close();
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		} 
//		return databaseConnection.getInvoices();
//}		
//	@Override
//	public int insertInvoice(Invoice i) 
//	{	
//		int status=0;
//		String query = "insert into hrc_data.h2h_oap(CUSTOMER_ORDER_ID,\r\n"
//				+ "						SALES_ORG,\r\n"
//				+ "						DISTRIBUTION_CHANNEL,\r\n"
//				+ "						DIVISION,\r\n"
//				+ "						RELEASED_CREDIT_VALUE,\r\n"
//				+ "						PURCHASE_ORDER_TYPE,\r\n"
//				+ "						COMPANY_CODE,\r\n"
//				+ "						ORDER_CREATION_DATE,\r\n"
//				+ "						ORDER_CREATION_TIME,\r\n"
//				+ "						CREDIT_CONTROL_AREA,\r\n"
//				+ "						SOLD_TO_PARTY,\r\n"
//				+ "						ORDER_AMOUNT,\r\n"
//				+ "						REQUESTED_DELIVERY_DATE,\r\n"
//				+ "						ORDER_CURRENCY,\r\n"
//				+ "						CREDIT_STATUS,\r\n"
//				+ "						CUSTOMER_NUMBER,\r\n"
//				+ "						AMOUNT_IN_USD,\r\n"
//				+ "						UNIQUE_CUST_ID) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//		DatabaseConnection databaseConnection = new DatabaseConnection();
//		databaseConnection.addInvoice(i);
//		try 
//		{
//			Connection con = DatabaseConnection.connect();
//			PreparedStatement p  = con.prepareStatement(query);
//			p.setInt(1,i.getCUSTOMER_ORDER_ID());
//			p.setInt(2,i.getSALES_ORG());
//			p.setString(3,i.getDISTRIBUTION_CHANNEL());
//			p.setString(4,i.getDIVISION());
//			p.setDouble(5,i.getRELEASED_CREDIT_VALUE());
//			p.setString(6,i.getPURCHASE_ORDER_TYPE());
//			p.setInt(7,i.getCOMPANY_CODE());
//			p.setString(8,i.getORDER_CREATION_DATE());
//			p.setString(9,i.getORDER_CREATION_TIME());
//			p.setString(10,i.getCREDIT_CONTROL_AREA());
//			p.setInt(11,i.getSOLD_TO_PARTY());
//			p.setDouble(12,i.getORDER_AMOUNT());
//			p.setString(13,i.getREQUESTED_DELIVERY_DATE());
//			p.setString(14,i.getORDER_CURRENCY());
//			p.setString(15,i.getCREDIT_STATUS());
//			p.setInt(16,i.getCUSTOMER_NUMBER());
//			p.setDouble(17,i.getAMOUNT_IN_USD());
//			p.setDouble(18,i.getUNIQUE_CUST_ID());
//			status=p.executeUpdate();
//			con.close();
//		} 
//		catch (ClassNotFoundException e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		catch (SQLException e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return status;
//	}
//	@Override
//	public int updateInvoice(int Sl_no, Invoice i) 
//	{
//		int status =0;
//		String query = "update hrc_data.h2h_oap set CUSTOMER_ORDER_ID=?,DISTRIBUTION_CHANNEL=? where Sl_no=?";	
//		try 
//		{
//			Connection con = DatabaseConnection.connect();
//			PreparedStatement p = con.prepareStatement(query);
//			p.setInt(1,i.getCUSTOMER_ORDER_ID());
//			p.setString(2,i.getDISTRIBUTION_CHANNEL());
//			p.setInt(3,Sl_no);	
//			status = p.executeUpdate();
//			con.close();
//		} 
//		catch (ClassNotFoundException e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		catch (SQLException e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return status;
//	}
//	@Override
//	public int deleteInvoice(int Sl_no) 
//	{
//		int status = 0;
//		String query = "delete from hrc_data.h2h_oap where Sl_no=?;";
//		try 
//		{
//			Connection con = DatabaseConnection.connect();
//			PreparedStatement p = con.prepareStatement(query);	
//			p.setInt(1,Sl_no);
//			status = p.executeUpdate();
//			con.close();
//		} 
//		catch (ClassNotFoundException e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		catch (SQLException e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return status;
//	}
//}

package com.highradius.implementation;

import com.highradius.connection.DatabaseConnection;
import com.highradius.model.Invoice;

import java.util.List;

public class InvoiceDaoImpl implements InvoiceDao {
    private DatabaseConnection databaseConnection;

    public InvoiceDaoImpl() {
        databaseConnection = new DatabaseConnection();
    }

    @Override
    public List<Invoice> getInvoices() {
        return databaseConnection.getInvoices();
    }

    @Override
    public void insertInvoice(Invoice invoice) {
        databaseConnection.addInvoice(invoice);
    }

    @Override
    public void updateInvoice(Invoice invoice) {
        // implementation for updating the invoice with the given invoiceNumber

    	
    }

    @Override
    public void deleteInvoice() {
        // implementation for deleting the invoice with the given invoiceNumber
    }
}
