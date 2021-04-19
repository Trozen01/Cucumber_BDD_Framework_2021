package Utilities;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private String productName;
	private int price;
	
	//create constructor for this class for generate list of product and price.
	public Product(String productname, int price) {
		this.productName = productname;
		this.price = price;
		
	}

	public String getProductname() {
		return productName;
	}

	public void setProductname(String productname) {
		this.productName = productname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	//following method is created for give list of product.
		public List<String>  getProductList(){
			List<String> productList = new ArrayList<>();//Creating arraylist     
			productList.add("Dell laptop");//Adding object in arraylist
			productList.add("One laptop");//Adding object in arraylist
			productList.add("Second laptop");//Adding object in arraylist
			return productList;
}
}
