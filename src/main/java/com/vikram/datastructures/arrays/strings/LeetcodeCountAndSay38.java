/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *
 */
public class LeetcodeCountAndSay38 {
	public String countAndSay(int input) {

		if (input == 1)
			return "1";

		if (input == 2)
			return "11";

		StringBuffer sb = new StringBuffer();
		int count = 1;
		boolean flag = false;
		String prevOutput = countAndSay(input - 1);

		// 1211 111221
		for (int i = 0; i < prevOutput.length() - 1; i++) {
			if (Character.isDigit(prevOutput.charAt(i)) && prevOutput.charAt(i) == prevOutput.charAt(i + 1)) {
				count++;
			} else {
				flag = true;
			}

			if (flag) {
				sb.append(count).append(prevOutput.charAt(i));
				count = 1;
				flag = false;
			}
		}

		sb.append(count).append(prevOutput.charAt(prevOutput.length() - 1));
		return sb.toString();
	}
}
