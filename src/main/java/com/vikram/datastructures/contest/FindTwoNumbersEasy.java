/**
 * 
 */
package com.vikram.datastructures.contest;

/**
 * @author Remoz World
 *
 */
public class FindTwoNumbersEasy {
	public int[] getNoZeroIntegers(int n) {
        for(int i = 1; i <= n / 2; i ++)
            if(noZero(i) && noZero(n - i))
                return new int[]{i, n - i};
        return new int[2];
    }
    boolean noZero(int i)
    {
        if(i < 10) return true;
        if(i % 10 == 0) return false;
        return noZero(i / 10);
    }
}
