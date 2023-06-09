package com.highradius.connection;


import com.highradius.model.Invoice;

import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {

    List<Invoice> invoices = new ArrayList<>();

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void addInvoices(Invoice invoice){
        invoices.add(invoice);
    }

}
