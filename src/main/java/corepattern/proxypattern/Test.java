package corepattern.proxypattern;

public class Test {
public static void main(String[] args) {
	Customer cust = new CustomerProxyImpl();
	System.out.println(cust.getId());
	System.out.println(cust.getOrders());
}
}
