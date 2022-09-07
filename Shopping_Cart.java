/**
	 * An interface that describes the operations of a shopping cart of items.
	 * @author jmoreiraalsina
	 * @version 9/1/2022
	 */
public interface Shopping_Cart<T> {
	/**
	 * 
	 * Creates an empty array of items
	 */
	private T [] item;
	
	/**
	 * Gets the current number of items in this shopping cart
	 * @return the integer number of items currently in the shopping cart
	 */
	public int getCurrentSize();
	
	/**
	 * Check if the shopping cart is empty
	 * @return if the shopping cart is empty
	 */
	public boolean isEmpty();
	
	/**
	 * 
	 * Adds an item to the shopping cart
	 * @return if the the item was successfully added
	 */
	public boolean add( T newItem );
	
	/**
	 * 
	 * Remove the last item placed in the shopping cart
	 * @return the object of T type
	 */
	public T remove();
	
	/**
	 * 
	 * Remove a certain item from the shopping cart
	 * @return if the item was successfully removed
	 * @param item of T type
	 */
	public boolean remove(T anItem);
	
	/**
	 * Clears all the items in the shopping
	 * 
	 */
	public void clear();
	
	/**
	 * 
	 * Count the amount of times one item is repeated
	 * @return integer 
	 * @param Item of T type
	 */
	public int getFrequencyOf(T anItem);
	
	/**
	 * 
	 *
	 * @return
	 * @param Item of T type
	 */
	public boolean contains( T anItem);
	
	/**
	 * 
	 * 
	 * @return
	 */
	public T [] toArray();
	
	/**
	 * 
	 * @author jmoreiraalsina
	 * @return
	 */
	public String toString();
	
	/**
	 * Calculates the total price of all the items in the shopping cart
	 * 
	 * @return 
	 */
	public double getTotalPrice();
	
	/**
	 * Calculates the total price of a same type of item 
	 * @return Total price of the same items
	 * @param int Item 
	 */
	public int getTotalPrice(int anItem);
	
	
}
