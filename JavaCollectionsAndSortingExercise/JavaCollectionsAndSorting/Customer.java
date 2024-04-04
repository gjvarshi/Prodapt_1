package JavaCollectionsAndSorting;

public class Customer {
	private Long customerid;
	private String name;
	private int tier;
	public Customer(Long customerid, String name, int tier) {
		super();
		this.customerid = customerid;
		this.name = name;
		this.tier = tier;
	}

	public Long getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTier() {
		return tier;
	}
	public void setTier(int tier) {
		this.tier = tier;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", name=" + name + ", tier=" + tier + "]";
	}
	
	

}
