/**
 * 
 */
package com.vikram.ms;

/**
 * @author Remoz World
 *
 */
public class DebugQuestion {
	public static void MakeTheNumbersMatch(int a, int b, int x, int y)
	{	
		//The following program increases/decreases 
		//the value of A and B until A is equal to X and B is equal to Y. Find the bug:
		while(a!=x || b!=y)
		{
			if(a> x) {
				a--;
			}else if(a<x) {
				a++;
			}
			
			if(b>y){
				b--;
			}
			else if (b<y)
			{
				b++;
			}
		}
		
		System.out.println("A: "+ a + " B: " + b);
	}
}
