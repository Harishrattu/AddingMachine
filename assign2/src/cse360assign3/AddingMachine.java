/*
 * Name: Harish Rattu
 * Date: 10/06/19
 * URL: https://github.com/Harishrattu/AddingMachine.git
 */

package cse360assign3;

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
	 * @return the calculations
	 */
	public String toString () 
	{
		return "0" + output;
	}

	/*
	 * set total to 0 and history to empty
	 */
	public void clear() 
	{
		total = 0;
		output = "";
	}
}
