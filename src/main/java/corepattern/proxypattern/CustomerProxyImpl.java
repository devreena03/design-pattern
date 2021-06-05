package corepattern.proxypattern;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer {
	
	CustomerImpl cust = new CustomerImpl();

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return cust.getId();
	}

	@Override
	public List<Order> getOrders() {
		List<Order> orders = new ArrayList<>();
		orders.add(createOrder(1,"Iphone",100));
		orders.add(createOrder(2,"Laptop",200));
		return orders;
	}

	private Order createOrder(int id, String name, int qua) {
		Order order = new Order();
		order.setId(id);
		order.setProductName(name);
		order.setQuantity(qua);
		return order;
	}

}
