package snackPack;

/*
 * Author: Andrew Roney
 * 
 */



public class Snack {
	private String id;
	private char size;
	private double price;
	
	private final double PRICE_S = 19.99;
	private final double PRICE_M = 29.99;
	private final double PRICE_L = 39.99;
	
	
//Constructor: 
	public Snack(String id, char size) {
		this.id = id;
		this.size = size;
	}
		
/*SET METHODS*/

public Snack() {
		
	}

//Method: Set the id to the input value.
	public void setId(String id) {
		this.id = id;
	}
	
//Method: Set the size to the input value.
	public void setSize(char size) {
		this.size = size;
	}
	
//Method: Set the price to the input value.
	public void setPrice(double price) {
		this.price = price;
	}
	
	

/*GET METHODS*/
	
//Method: Retrieve the current value of id.
	public String getId() {
		return this.id;
	}

//Method: Retrieve the current value of size.
	public char getSize() {
		return this.size;
	}
	
//Method: Retrieve the current value of price.
	public double getPrice() {
		return this.price;
	}


	
//Method: Start the price calculation from the selected size.
	public void sizePricing() {
		if(this.size == 'S') {
			this.price = PRICE_S;
		}
		else if(this.size == 'M') {
			this.price = PRICE_M;
		}
		
		else if(this.size == 'L') {
			this.price = PRICE_L;
		}
		
	}
	

//Method: String for super class
	@Override
	public String toString() {
		return ", of type = "+ size +", id: "+ id +" ";
	}
}










