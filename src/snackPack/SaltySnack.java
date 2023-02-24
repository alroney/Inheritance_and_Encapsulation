package snackPack;

/**
 * 
 * @author Andrew
 *
 */


public class SaltySnack extends Snack {
	private boolean isNutSnack;
	private final double NUT_PRICE = 4.50;
	
	
	
	
//Constructor
	public SaltySnack(String id, char size, boolean isNutSnack) {
		super(id, size);
		this.isNutSnack = isNutSnack;
	}
	
	
/*SET METHODS*/

//Method: Set the condition of the boolean to the given input.
	public void setIsNutSnack(boolean isNutSnack) {
		this.isNutSnack = isNutSnack;
	}
	
	

/*GET METHODS*/
	
//Method: Retrieve the current condition of the boolean.
	public boolean getIsNutSnack() {
		return this.isNutSnack;
	}

	
	
//Method: Add additional nut cost if valid.
	public void addonPriceAdditionNS() {
		if(this.isNutSnack) {
			super.setPrice(super.getPrice() + NUT_PRICE);//set price to current price plus nut price.
		}
	}
	
//Method: Override the toString method of the superclass. Then add the superclass toString into this toString method along with the price and additions.
	@Override
	public String toString() {
		return super.toString() +" and price = $"+ String.format("%.2f", super.getPrice());
	}
	
}


