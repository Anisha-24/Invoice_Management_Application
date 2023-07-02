//package com.highradius.servlets;
//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import com.highradius.implementation.InvoiceDao;
//import com.highradius.implementation.InvoiceDaoImpl;
//import com.google.gson.Gson;
//@WebServlet("/Delete")
//public class Delete extends HttpServlet 
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
//		int status=0;
//		int sl_no = Integer.parseInt(request.getParameter("Sl_no"));
//		status = invoiceDao.deleteInvoice(sl_no);	
//		String userJsonString = new String();
//		PrintWriter out = response.getWriter();
//        response.setContentType("application/json");
//        response.setCharacterEncoding("UTF-8");
//		if(status>0) 
//		{
//			userJsonString = gson.toJson("Record Deleted successfully!");
//			out.print(userJsonString);
//		}
//		else 
//		{
//			userJsonString = gson.toJson("Sorry! unable to delete record");
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

@WebServlet("/delete")
public class Delete extends HttpServlet {
    /**
	 * 
	 */
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

        databaseConnection.deleteInvoice(slNo);

        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write("{\"message\": \"Invoice deleted successfully\"}");
    }
}