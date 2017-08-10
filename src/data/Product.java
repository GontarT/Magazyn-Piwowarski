package data;


public  class Product {

	private String productType;
	private String producer;
	private Double weight;
	
	public Product(String productType, String producer, Double weight) {
		
		this.productType = productType;
		this.producer = producer;
		this.weight = weight;
	}
	
	public String toString(){
		
		return "Typ produktu: " + productType + " Producent: " + producer+ " Waga: " +weight + "kg";
	}
	
	

}
