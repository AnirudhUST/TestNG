package ustbatchno3.TestNG;

public class Customer {
	private String c_id;
	private String name;
	private String city;
	private int feet;
	
	public int getFeet() {
		return feet;
	}



	public void setFeet(int feet) {
		this.feet = feet;
	}



	/**
	 * @param c_id
	 * @param name
	 * @param city
	 * @param feet
	 */
	public Customer(String c_id, String name, String city, int feet) {
		super();
		this.c_id = c_id;
		this.name = name;
		this.city = city;
		this.feet = feet;
	}

	

	public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
