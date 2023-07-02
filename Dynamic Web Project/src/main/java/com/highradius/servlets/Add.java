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
//import com.highradius.model.Invoice;
//@WebServlet("/Add")
//public class Add extends HttpServlet 
//{
//	private static final long serialVersionUID = 1L;
//	private InvoiceDao invoiceDao;	
//	public void init() 
//    {
//        invoiceDao = new InvoiceDaoImpl();
//    }
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
//	{	
//		final int sl_no=0;
//		Gson gson = new Gson();
//		int cust_order_id = Integer.parseInt(request.getParameter("CUSTOMER_ORDER_ID"));
//		int sales_org = Integer.parseInt(request.getParameter("SALES_ORG"));
//		String dist = request.getParameter("DISTRIBUTION_CHANNEL");
//		String div = request.getParameter("DIVISION");
//		double rel_cred = Double.parseDouble(request.getParameter("RELEASED_CREDIT_VALUE"));
//		String purchase = request.getParameter("PURCHASE_ORDER_TYPE");
//		int comp_code = Integer.parseInt(request.getParameter("COMPANY_CODE"));
//		String date = request.getParameter("ORDER_CREATION_DATE");
//		String time = request.getParameter("ORDER_CREATION_TIME");
//		String cred_control_area = request.getParameter("CREDIT_CONTROL_AREA");
//		int sold_party = Integer.parseInt(request.getParameter("SOLD_TO_PARTY"));
//		double order_amount = Double.parseDouble(request.getParameter("ORDER_AMOUNT"));
//		String req_date = request.getParameter("REQUESTED_DELIVERY_DATE");
//		String order_curr = request.getParameter("ORDER_CURRENCY");
//		String cred_status = request.getParameter("CREDIT_STATUS");
//		int cust_num = Integer.parseInt(request.getParameter("CUSTOMER_NUMBER"));
//		double amount = Double.parseDouble(request.getParameter("AMOUNT_IN_USD"));
//		double uni_cust_id = Double.parseDouble(request.getParameter("UNIQUE_CUST_ID"));	
//		Invoice i = new Invoice(sl_no,cust_order_id,sales_org,dist,div,
//				rel_cred,purchase,comp_code,date,time, 
//				cred_control_area,sold_party,order_amount,req_date, 
//				order_curr, cred_status,cust_num,amount, 
//				uni_cust_id); 
//		int status = invoiceDao.insertInvoice(i);
//		String userJsonString = new String();
//		PrintWriter out = response.getWriter();
//        response.setContentType("application/json");
//        response.setCharacterEncoding("UTF-8");
//		if(status>0) {
//			userJsonString = gson.toJson("Record saved successfully!");
//			out.print(userJsonString);
//		}
//		else 
//		{
//			userJsonString = gson.toJson("Sorry! unable to save record");
//			out.print(userJsonString);
//		}
//		out.close();
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

@WebServlet("/add")
public class Add extends HttpServlet {
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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Retrieve data from the request parameters
    	int slNo = Integer.parseInt(req.getParameter("slNo"));
        int customerOrderID = Integer.parseInt(req.getParameter("customerOrderID"));
        int salesOrg = Integer.parseInt(req.getParameter("salesOrg"));
        String distributionChannel = req.getParameter("distributionChannel");
        int companyCode = Integer.parseInt(req.getParameter("companyCode"));
        String orderCreationDate = req.getParameter("orderCreationDate");
        String orderCurrency = req.getParameter("orderCurrency");
        double amountInUSD = Double.parseDouble(req.getParameter("amountInUSD"));
        double orderAmount = Double.parseDouble(req.getParameter("orderAmount"));
        String division = req.getParameter("division");
        double releasedCreditValue = Double.parseDouble(req.getParameter("releasedCreditValue"));
        String purchaseOrderType = req.getParameter("purchaseOrderType");
        String orderCreationTime = req.getParameter("orderCreationTime");
        String creditControlArea = req.getParameter("creditControlArea");
        int soldToParty = Integer.parseInt(req.getParameter("soldToParty"));
        String requestedDeliveryDate = req.getParameter("requestedDeliveryDate");
        String creditStatus = req.getParameter("creditStatus");
        int customerNumber = Integer.parseInt(req.getParameter("customerNumber"));
        String uniqueCustID = req.getParameter("uniqueCustID");

        // Create an Invoice object with the retrieved data
        Invoice invoice = new Invoice(slNo,customerOrderID, salesOrg, distributionChannel, division, releasedCreditValue,
                purchaseOrderType, companyCode, orderCreationDate, orderCreationTime, creditControlArea,
                soldToParty, orderAmount, requestedDeliveryDate, orderCurrency, creditStatus, customerNumber,
                amountInUSD, uniqueCustID);

        // Add the invoice to the database
        invoiceDao.insertInvoice(invoice);

        // Set the response type to JSON
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        // Create a JSON response
        Gson gson = new Gson();
        String json = gson.toJson("Success");

        // Send the JSON response
        PrintWriter out = resp.getWriter();
        out.print(json);
        out.flush();
    }
}