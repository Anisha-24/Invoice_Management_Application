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
//@WebServlet("/Read")
//public class Read extends HttpServlet 
//{
//	private static final long serialVersionUID = 1L;
//	private InvoiceDao invoiceDao;	
//	public void init() 
//    {
//        invoiceDao = new InvoiceDaoImpl();
//    }
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
//	{
//		response.setHeader("Access-Control-Allow-Origin", "*");
//		response.setHeader("Access-Control-Allow-Methods", "GET");
//		response.setHeader("Access-Control-Allow-Headers", "Content-Type");
//		Gson gson = new Gson();
//		List<Invoice> invoices = invoiceDao.getInvoice();	
//		String userJsonString = new String();
//		PrintWriter out = response.getWriter();
//        userJsonString = gson.toJson(invoices);
//        out.println(userJsonString);
//	}
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
//	{		
//		Gson gson = new Gson();
//		int start = Integer.parseInt(request.getParameter("Start"));
//		int end = Integer.parseInt(request.getParameter("End"));
//		ArrayList<Invoice> invoices = invoiceDao.getInvoice(start,end);
//		String userJsonString = new String();
//		userJsonString = gson.toJson(invoices);
//		PrintWriter out = response.getWriter();
//        response.setContentType("application/json");
//        response.setCharacterEncoding("UTF-8");
//        out.print(userJsonString);
//        out.flush();
//	}
//}

package com.highradius.servlets;

import com.highradius.implementation.InvoiceDao;
import com.highradius.implementation.InvoiceDaoImpl;
import com.highradius.model.Invoice;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/data")
public class Read extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private InvoiceDao invoiceDao;

    @Override
    public void init() throws ServletException {
        super.init();
        invoiceDao = new InvoiceDaoImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Get all invoices using the InvoiceDao's getInvoice method
        List<Invoice> invoices = invoiceDao.getInvoices();

        // Set the response type to JSON
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        // Create a JSON response
        Gson gson = new Gson();
        String json = gson.toJson(invoices);

        // Send the JSON response
        PrintWriter out = resp.getWriter();
        out.print(json);
        out.flush();
    }
}