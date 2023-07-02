//package com.highradius.servlets;
//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import com.google.gson.Gson;
//import com.highradius.model.*;
//import com.highradius.implementation.*;
//import java.util.*;
//@WebServlet("/Edit")
//public class Edit extends HttpServlet 
//{
//	private static final long serialVersionUID = 1L;
//	private InvoiceDao invoiceDao;	
//	public void init() 
//    {
//        invoiceDao = new InvoiceDaoImpl();
//    }
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
//	{	
//		Gson gson = new Gson();
//		int status = 0;
//		List<Invoice> invoices = invoiceDao.getInvoice();	
//		int sl_no = Integer.parseInt(request.getParameter("Sl_no"));
//		int cust_order_id = Integer.parseInt(request.getParameter("CUSTOMER_ORDER_ID"));
//		String dist = request.getParameter("DISTRIBUTION_CHANNEL");
//		invoices.get(sl_no-1).setCUSTOMER_ORDER_ID(cust_order_id);
//		invoices.get(sl_no-1).setDISTRIBUTION_CHANNEL(dist);
//		status = invoiceDao.updateInvoice(sl_no,invoices.get(sl_no-1));
//		String userJsonString = new String();
//		PrintWriter out = response.getWriter();
//        response.setContentType("application/json");
//        response.setCharacterEncoding("UTF-8");
//		if(status>0) 
//		{
//			userJsonString = gson.toJson("Record Updated successfully!");
//			out.print(userJsonString);
//		}
//		else 
//		{
//			userJsonString = gson.toJson("Sorry! unable to update record");
//			out.print(userJsonString);
//		}
//		out.close();
//	}
//}

package com.highradius.servlets;

import com.highradius.connection.DatabaseConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateInvoice")
public class Edit extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private DatabaseConnection databaseConnection;

    @Override
    public void init() throws ServletException {
        super.init();
        databaseConnection = new DatabaseConnection();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int slNo = Integer.parseInt(req.getParameter("slNo"));

        // Delete existing invoice data
        databaseConnection.deleteInvoice(slNo);

        // Redirect to the AddInvoice.html page with pre-filled slNo parameter
        resp.sendRedirect(req.getContextPath() + "/addInvoice.html?slNo=" + slNo);
    }
}
