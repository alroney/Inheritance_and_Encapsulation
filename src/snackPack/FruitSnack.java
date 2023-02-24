package snackPack;

/**
 * 
 * @author Andrew
 *
 */

public class FruitSnack extends Snack {
	private boolean isCitrusFruit;
	private final double CITRUS_PRICE = 5.99;
		
	
//Constructor: Define a default fruit snack.
	public FruitSnack(String id, char size, boolean isCitrusFruit) {
		super(id, size);
		this.isCitrusFruit = isCitrusFruit;
	}
	
	
	

/*SET METHODS*/

//Method: Set the condition of the boolean to the result of the input.
	public void setIsCitrusFruit(boolean isCitrusFruit) {
		this.isCitrusFruit = isCitrusFruit;
	}
	
	

/*GET METHODS*/
	
//Method: Retrieve the current condition of the boolean.
	public boolean getIsCitrusFruit() {
		return this.isCitrusFruit;
	}


	
//Method: Add additional citrus cost if valid.
	public void addonPricingAdditionCF() {
		if(this.isCitrusFruit) {
			super.setPrice(super.getPrice() + CITRUS_PRICE);//set price to current price plus citrus price.
			
		}
	}


//Method: Override the toString method of the superclass. Then add the superclass toString into this toString method along with the price and additions.
	@Override
	public String toString() {
		return super.toString() + "and price = $"+ String.format("%.2f", super.getPrice());
	}
}