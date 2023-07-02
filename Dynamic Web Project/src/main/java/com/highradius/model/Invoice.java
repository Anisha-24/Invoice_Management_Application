//package com.highradius.model;
//public class Invoice 
//{
//	private int Sl_no;
//	private int CUSTOMER_ORDER_ID;
//	private int SALES_ORG;
//	private String DISTRIBUTION_CHANNEL; 
//	private String DIVISION; 
//	private double RELEASED_CREDIT_VALUE; 
//	private String PURCHASE_ORDER_TYPE;
//	private int COMPANY_CODE; 
//	private String ORDER_CREATION_DATE; 
//	private String ORDER_CREATION_TIME;  
//	private String CREDIT_CONTROL_AREA; 
//	private int SOLD_TO_PARTY; 
//	private double ORDER_AMOUNT; 
//	private String REQUESTED_DELIVERY_DATE; 
//	private String ORDER_CURRENCY; 
//	private String CREDIT_STATUS; 
//	private int CUSTOMER_NUMBER; 
//	private double AMOUNT_IN_USD;  
//	private double UNIQUE_CUST_ID;	
//	public Invoice(int sl_no, int cUSTOMER_ORDER_ID, int sALES_ORG, String dISTRIBUTION_CHANNEL, String dIVISION,
//			double rELEASED_CREDIT_VALUE, String pURCHASE_ORDER_TYPE, int cOMPANY_CODE, String oRDER_CREATION_DATE,
//			String oRDER_CREATION_TIME, String cREDIT_CONTROL_AREA, int sOLD_TO_PARTY, double oRDER_AMOUNT,
//			String rEQUESTED_DELIVERY_DATE, String oRDER_CURRENCY, String cREDIT_STATUS, int cUSTOMER_NUMBER,
//			double aMOUNT_IN_USD, double uNIQUE_CUST_ID) 
//	{
//		super();
//		Sl_no = sl_no;
//		CUSTOMER_ORDER_ID = cUSTOMER_ORDER_ID;
//		SALES_ORG = sALES_ORG;
//		DISTRIBUTION_CHANNEL = dISTRIBUTION_CHANNEL;
//		DIVISION = dIVISION;
//		RELEASED_CREDIT_VALUE = rELEASED_CREDIT_VALUE;
//		PURCHASE_ORDER_TYPE = pURCHASE_ORDER_TYPE;
//		COMPANY_CODE = cOMPANY_CODE;
//		ORDER_CREATION_DATE = oRDER_CREATION_DATE;
//		ORDER_CREATION_TIME = oRDER_CREATION_TIME;
//		CREDIT_CONTROL_AREA = cREDIT_CONTROL_AREA;
//		SOLD_TO_PARTY = sOLD_TO_PARTY;
//		ORDER_AMOUNT = oRDER_AMOUNT;
//		REQUESTED_DELIVERY_DATE = rEQUESTED_DELIVERY_DATE;
//		ORDER_CURRENCY = oRDER_CURRENCY;
//		CREDIT_STATUS = cREDIT_STATUS;
//		CUSTOMER_NUMBER = cUSTOMER_NUMBER;
//		AMOUNT_IN_USD = aMOUNT_IN_USD;
//		UNIQUE_CUST_ID = uNIQUE_CUST_ID;
//	}
//	public int getSl_no() 
//	{
//		return Sl_no;
//	}
//	public void setSl_no(int sl_no) 
//	{
//		Sl_no = sl_no;
//	}
//	public int getCUSTOMER_ORDER_ID() 
//	{
//		return CUSTOMER_ORDER_ID;
//	}
//	public void setCUSTOMER_ORDER_ID(int cUSTOMER_ORDER_ID) 
//	{
//		CUSTOMER_ORDER_ID = cUSTOMER_ORDER_ID;
//	}
//	public int getSALES_ORG() 
//	{
//		return SALES_ORG;
//	}
//	public void setSALES_ORG(int sALES_ORG) 
//	{
//		SALES_ORG = sALES_ORG;
//	}
//	public String getDISTRIBUTION_CHANNEL() 
//	{
//		return DISTRIBUTION_CHANNEL;
//	}
//	public void setDISTRIBUTION_CHANNEL(String dISTRIBUTION_CHANNEL) 
//	{
//		DISTRIBUTION_CHANNEL = dISTRIBUTION_CHANNEL;
//	}
//	public String getDIVISION() 
//	{
//		return DIVISION;
//	}
//	public void setDIVISION(String dIVISION) 
//	{
//		DIVISION = dIVISION;
//	}
//	public double getRELEASED_CREDIT_VALUE() 
//	{
//		return RELEASED_CREDIT_VALUE;
//	}
//	public void setRELEASED_CREDIT_VALUE(double rELEASED_CREDIT_VALUE) 
//	{
//		RELEASED_CREDIT_VALUE = rELEASED_CREDIT_VALUE;
//	}
//	public String getPURCHASE_ORDER_TYPE() 
//	{
//		return PURCHASE_ORDER_TYPE;
//	}
//	public void setPURCHASE_ORDER_TYPE(String pURCHASE_ORDER_TYPE) 
//	{
//		PURCHASE_ORDER_TYPE = pURCHASE_ORDER_TYPE;
//	}
//	public int getCOMPANY_CODE() 
//	{
//		return COMPANY_CODE;
//	}
//	public void setCOMPANY_CODE(int cOMPANY_CODE) 
//	{
//		COMPANY_CODE = cOMPANY_CODE;
//	}
//	public String getORDER_CREATION_DATE() 
//	{
//		return ORDER_CREATION_DATE;
//	}
//	public void setORDER_CREATION_DATE(String oRDER_CREATION_DATE) 
//	{
//		ORDER_CREATION_DATE = oRDER_CREATION_DATE;
//	}
//	public String getORDER_CREATION_TIME() 
//	{
//		return ORDER_CREATION_TIME;
//	}
//	public void setORDER_CREATION_TIME(String oRDER_CREATION_TIME) 
//	{
//		ORDER_CREATION_TIME = oRDER_CREATION_TIME;
//	}
//	public String getCREDIT_CONTROL_AREA() 
//	{
//		return CREDIT_CONTROL_AREA;
//	}
//	public void setCREDIT_CONTROL_AREA(String cREDIT_CONTROL_AREA) 
//	{
//		CREDIT_CONTROL_AREA = cREDIT_CONTROL_AREA;
//	}
//	public int getSOLD_TO_PARTY() 
//	{
//		return SOLD_TO_PARTY;
//	}
//	public void setSOLD_TO_PARTY(int sOLD_TO_PARTY) 
//	{
//		SOLD_TO_PARTY = sOLD_TO_PARTY;
//	}
//	public double getORDER_AMOUNT() 
//	{
//		return ORDER_AMOUNT;
//	}
//	public void setORDER_AMOUNT(double oRDER_AMOUNT) 
//	{
//		ORDER_AMOUNT = oRDER_AMOUNT;
//	}
//	public String getREQUESTED_DELIVERY_DATE() 
//	{
//		return REQUESTED_DELIVERY_DATE;
//	}
//	public void setREQUESTED_DELIVERY_DATE(String rEQUESTED_DELIVERY_DATE) 
//	{
//		REQUESTED_DELIVERY_DATE = rEQUESTED_DELIVERY_DATE;
//	}
//	public String getORDER_CURRENCY() 
//	{
//		return ORDER_CURRENCY;
//	}
//	public void setORDER_CURRENCY(String oRDER_CURRENCY) 
//	{
//		ORDER_CURRENCY = oRDER_CURRENCY;
//	}
//	public String getCREDIT_STATUS() 
//	{
//		return CREDIT_STATUS;
//	}
//	public void setCREDIT_STATUS(String cREDIT_STATUS) 
//	{
//		CREDIT_STATUS = cREDIT_STATUS;
//	}
//	public int getCUSTOMER_NUMBER() 
//	{
//		return CUSTOMER_NUMBER;
//	}
//	public void setCUSTOMER_NUMBER(int cUSTOMER_NUMBER) 
//	{
//		CUSTOMER_NUMBER = cUSTOMER_NUMBER;
//	}
//	public double getAMOUNT_IN_USD() 
//	{
//		return AMOUNT_IN_USD;
//	}
//	public void setAMOUNT_IN_USD(double aMOUNT_IN_USD) 
//	{
//		AMOUNT_IN_USD = aMOUNT_IN_USD;
//	}
//	public double getUNIQUE_CUST_ID() 
//	{
//		return UNIQUE_CUST_ID;
//	}
//	public void setUNIQUE_CUST_ID(double uNIQUE_CUST_ID) 
//	{
//		UNIQUE_CUST_ID = uNIQUE_CUST_ID;
//	}
//}

package com.highradius.model;

public class Invoice {
	private int slNo;
	private int customerOrderID;
    private int salesOrg;
    private String distributionChannel;
    private String division;
    private double releasedCreditValue;
    private String purchaseOrderType;
    private int companyCode;
    private String orderCreationDate;
    private String orderCreationTime;
    private String creditControlArea;
    private int soldToParty;
    private double orderAmount;
    private String requestedDeliveryDate;
    private String orderCurrency;
    private String creditStatus;
    private int customerNumber;
    private double amountInUSD;
    private String uniqueCustID;

    public Invoice(int slNo,int customerOrderID, int salesOrg, String distributionChannel, String division,
                   double releasedCreditValue, String purchaseOrderType, int companyCode, String orderCreationDate,
                   String orderCreationTime, String creditControlArea, int soldToParty, double orderAmount,
                   String requestedDeliveryDate, String orderCurrency, String creditStatus, int customerNumber,
                   double amountInUSD, String uniqueCustID) {
    	this.slNo = slNo;
        this.customerOrderID = customerOrderID;
        this.salesOrg = salesOrg;
        this.distributionChannel = distributionChannel;
        this.division = division;
        this.releasedCreditValue = releasedCreditValue;
        this.purchaseOrderType = purchaseOrderType;
        this.companyCode = companyCode;
        this.orderCreationDate = orderCreationDate;
        this.orderCreationTime = orderCreationTime;
        this.creditControlArea = creditControlArea;
        this.soldToParty = soldToParty;
        this.orderAmount = orderAmount;
        this.requestedDeliveryDate = requestedDeliveryDate;
        this.orderCurrency = orderCurrency;
        this.creditStatus = creditStatus;
        this.customerNumber = customerNumber;
        this.amountInUSD = amountInUSD;
        this.uniqueCustID = uniqueCustID;
    }

    // Getters and Setters for the new columns
    
    public int getSlNo() {
    	return slNo;
	}
    
    public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public double getReleasedCreditValue() {
        return releasedCreditValue;
    }

    public void setReleasedCreditValue(double releasedCreditValue) {
        this.releasedCreditValue = releasedCreditValue;
    }

    public String getPurchaseOrderType() {
        return purchaseOrderType;
    }

    public void setPurchaseOrderType(String purchaseOrderType) {
        this.purchaseOrderType = purchaseOrderType;
    }

    public String getOrderCreationTime() {
        return orderCreationTime;
    }

    public void setOrderCreationTime(String orderCreationTime) {
        this.orderCreationTime = orderCreationTime;
    }

    public String getCreditControlArea() {
        return creditControlArea;
    }

    public void setCreditControlArea(String creditControlArea) {
        this.creditControlArea = creditControlArea;
    }

    public int getSoldToParty() {
        return soldToParty;
    }

    public void setSoldToParty(int soldToParty) {
        this.soldToParty = soldToParty;
    }

    public String getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    public void setRequestedDeliveryDate(String requestedDeliveryDate) {
        this.requestedDeliveryDate = requestedDeliveryDate;
    }

    public String getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public double getAmountInUSD() {
        return amountInUSD;
    }

    public void setAmountInUSD(double amountInUSD) {
        this.amountInUSD = amountInUSD;
    }

    public String getUniqueCustID() {
        return uniqueCustID;
    }

    public void setUniqueCustID(String uniqueCustID) {
        this.uniqueCustID = uniqueCustID;
    }


	public int getCustomerOrderID() {
		return customerOrderID;
	}

	public void setCustomerOrderID(int custOrderID) {
		customerOrderID = custOrderID;
	}

	public int getSalesOrg() {
		return salesOrg;
	}

	public void setSalesOrg(int salesOrg) {
		this.salesOrg = salesOrg;
	}

	public String getDistributionChannel() {
		return distributionChannel;
	}

	public void setDistributionChannel(String distributionChannel) {
		this.distributionChannel = distributionChannel;
	}

	public int getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	public String getOrderCreationDate() {
		return orderCreationDate;
	}

	public void setOrderCreationDate(String orderCreationDate) {
		this.orderCreationDate = orderCreationDate;
	}

	public String getOrderCurrency() {
		return orderCurrency;
	}

	public void setOrderCurrency(String orderCurrency) {
		this.orderCurrency = orderCurrency;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
		
}