/**
 * 
 */
package com.fursa.strings;

/**
 * @author Swetha
 *
 */
public class LongestSubSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "abcedg";
		String str2 = "abfcdtttg";
		int[][] T = new int[str1.length()+1][str2.length()+1];
		String[][] solution = new String[str1.length() + 1][str2.length() + 1];
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();

		for(int i=0;i<charArray2.length;i++){
			T[0][i]=0;
			solution[0][i] = "0";
		}
		for(int i=0;i<charArray1.length;i++){
			T[i][0]=0;
			solution[i][0] = "0";
		}


		for(int i=0;i<str1.length();i++){
			for(int j=0;j<str2.length();j++){
				if(charArray1[i] == charArray2[j]){
					T[i+1][j+1] = T[i][j]+1;
					solution[i+1][j+1] = "diagonal";
				}
				else{
					T[i+1][j+1] = Math.max(T[i+1][j], T[i][j+1]);
					if (T[i+1][j+1] == T[i][j+1]) {
						solution[i+1][j+1] = "top";
					} else {
						solution[i+1][j+1] = "left";
					}
				}
			}
		}
		String x = solution[str1.length()][str2.length()];
		int a = str1.length();
		int b = str2.length();
		String answer = "";
		while(x  != "0"){
			if(solution[a][b].equals("diagonal")){
				answer = charArray1[a-1] + answer;
				a--;b--;
			}else if(solution[a][b].equals("top")){
				a--;
			}else if(solution[a][b].equals("left")){
				b--;
			}
			x = solution[a][b];
	}
	System.out.println("Length of longest Sub Sequence::"+T[str1.length()][str2.length()]+"::String is ::"+answer);
}

}
