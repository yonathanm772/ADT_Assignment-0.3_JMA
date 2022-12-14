/**
	 * An interface that describes the operations of an item.
	 * @author jmoreiraalsina
	 * @version 9/7/2022
	 */

public interface Item {
	
	String name="";
	double price=0.0;
	String description="";
	
	/**
	 * Changes  the name of an item as a string
	 */
	public String setName();
	
	/**
	 * Changes  the price of an item as a double
	 */
	public double setPrice();
	
	/**
	 * Changes  the description of an item as a string
	 */
	public String setDescription();
	
	/**
	 * Returns the name of an item as a string
	 * @return the current name of an item as a string
	 */
	public String getName();
	
	/**
	 * Gets the price of an item as double 
	 * @return the current price of an item as a double 
	 */
	public double getPrice();
	
	/**
	 * Gets the description of an item as a string 
	 * @return the current description of an item as a string
	 */
	public String getDescription();
	

}
