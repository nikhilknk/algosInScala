import java.awt.List;
import java.util.ArrayList;


public class NumberToXPowerOfY {
	public static void main(String[] args) {
		int n = 1024000000;

		System.out.println("Answer is "+numberTopwer(n));

	}

	private static boolean numberTopwer(int n) {
		if(n<=1 ) return true;
		java.util.List<Integer> factoryList = getFactorListArray(n);
		for(int i : factoryList){

			int p = i;
			while(p<=n){
				if(p==n)
					return true;
				p = p*i;
			}

		}


		return false;
	}

	public static java.util.List<Integer> getFactorListArray(int n){
		java.util.List<Integer> factoryArray = new ArrayList<Integer>();
		int factorNumber = 1;

		while(factorNumber <= n){
			if(n % factorNumber == 0){
				factoryArray.add(factorNumber);
			}
			factorNumber ++;
		}
		return factoryArray;
	}
}
