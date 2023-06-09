package com.highradius.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.highradius.implementation.InvoiceDaoImpl;
import com.highradius.model.Invoice;

@WebServlet("/DataLoadingServlet")
public class DataLoadingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private InvoiceDaoImpl invoiceDaoImpl;
	List<Invoice> invoiceLit;

	public DataLoadingServlet() throws SQLException {
		super();
		System.out.println("DLS Const Called");
		invoiceDaoImpl = new InvoiceDaoImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		invoiceLit = invoiceDaoImpl.getInvoice();
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		Gson gson = new Gson();
		String jsonString = gson.toJson(invoiceLit);
		out.println(jsonString);
		out.close();
	}
}