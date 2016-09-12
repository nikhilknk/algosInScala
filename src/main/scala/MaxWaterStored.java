/**
 * 
 */

/**
 * @author Swetha
 *
 */
public class MaxWaterStored {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,5,3,7,2,9,3,7};
		int[] maxLeft = new int[input.length];
		int[] maxRight = new int[input.length];
		maxLeft[0] = 0;
		maxRight[input.length-1] = 0; // highest-left and highest-right
		for (int i = 0; i < input.length; i++) 
			maxLeft[i] = Math.max(input[i], (i!=0)?maxLeft[i-1]:0);
		for (int i = input.length-1; i >= 0; i--) 
			maxRight[i] = Math.max(input[i],i<(input.length-1) ? maxRight[i+1]:0);
		int ans = 0;
		for (int i = 0; i < input.length; i++) 
			ans += Math.min(maxLeft[i], maxRight[i]) - input[i];
		System.out.println(ans);
	}

}
