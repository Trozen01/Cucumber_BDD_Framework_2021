package Utilities;

public class Search {
	
	public String dispalyProduct(Product prodt){
		
		if(prodt.getProductList().contains(prodt.getProductname())){
			return prodt.getProductname();
		}
		return null;
	}

}
