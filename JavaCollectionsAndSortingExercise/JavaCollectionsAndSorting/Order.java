package JavaCollectionsAndSorting;

import java.time.LocalDate;
import java.util.List;

public class Order {
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private String status;
	private long customerId;
	private List<Product> products;
	public Order() {
		super();
		
	}
	public Order(long id, LocalDate orderDate, LocalDate deliveryDate, String status, long customerId) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.status = status;
		this.customerId = customerId;
	}
	private long id;
	public long getId() {
		return id;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public String getStatus() {
		return status;
	}
	public long getCustomerId() {
		return customerId;
	}
	@Override
	public String toString() {
		return "Order [orderDate=" + orderDate + ", deliveryDate=" + deliveryDate + ", status=" + status
				+ ", customerId=" + customerId + ", id=" + id + "]";
	}
	

	
	

}
