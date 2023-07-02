//package com.highradius.implementation;
//import com.highradius.model.Invoice;
//import java.util.*;
//public interface InvoiceDao 
//{
//	List<Invoice> getInvoice();
//	ArrayList<Invoice> getInvoice(int start,int end);
//	int insertInvoice(Invoice i);
//	int updateInvoice(int id,Invoice i);
//	int deleteInvoice(int id);
//}

package com.highradius.implementation;

import com.highradius.model.Invoice;

import java.util.List;

public interface InvoiceDao {
    List<Invoice> getInvoices();
    void insertInvoice(Invoice invoice);
    void updateInvoice(Invoice invoice);
    void deleteInvoice();
}