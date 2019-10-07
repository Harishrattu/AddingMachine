/*
 * Name: Harish Rattu
 * Date: 10/06/19
 * URL: https://github.com/Harishrattu/AddingMachine.git
 */

package cse360assign2;

public class AddingMachine {

	private int total;
	private String output;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/*
	 * @return the current total
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/*
	 * adds the parameter to the total value
	 * @param value any new int value
	 */
	public void add (int value)
	{
		total = total + value;
		output = output + " + " + value;
	}
	
	/*
	 * subtracts the parameter to the total value
	 * @param value any new int value
	 */
	public void subtract (int value) 
	{
		total = total - value;
		output = output + " - " + value;
	}
		
	/*
	 * prints the history of transactions
	 */
	public String toString () 
	{
		return "0" + output;
	}

	public void clear() {
	
	}
}
