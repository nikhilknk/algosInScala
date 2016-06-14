package com.fursa.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class KthNonRepeatingChar {

	public static void main(String[] args) {
		String inputString= args[0];
		int k = Integer.parseInt(args[1]);
		Map<Character,Integer> counterMap = new LinkedHashMap<Character,Integer>();
		char[] charArray = inputString.toCharArray();
		for (int i = 0; i < charArray.length-1; i++) {
			if(counterMap.containsKey(charArray[i]))
			{
				int count = counterMap.get(charArray[i]);
				count += count;
				counterMap.put(charArray[i],count+1);
			}
			else{
				counterMap.put(charArray[i],1);
			}
		}
		
		int presentCount =0;
		char nthLetter=0;
		for (Map.Entry<Character,Integer> entry : counterMap.entrySet())
		{
			
			if(entry.getValue()==1 ) {
				if(presentCount==k-1)
				{
					nthLetter = entry.getKey();
					break;
				} else presentCount++;
			} 
		}
		
		if(nthLetter != 0) System.out.println(nthLetter); else System.out.println("There is no kth Non repeating character");
	}

}
