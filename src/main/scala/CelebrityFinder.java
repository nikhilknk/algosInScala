/**
 * 
 */

/**
 * @author Swetha
 *
 */
public class CelebrityFinder {
	static int[][]  MATRIX = {{0, 0, 1, 0},
							  {0, 0, 1, 0},
							  {0, 0, 0, 0},
							  {0, 0, 1, 0}
		};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int n = 4;
		    int id = findCelebrity(n);
		    if(id == -1) System.out.println( "No celebrity"); else System.out.println("Celebrity ID ::"+id);
	}

	private static int findCelebrity(int n) {
		
		int i =0; int j = n-1;
		
		while(i<j){
			if(know(i,j)) i++; else j--;
		}
		
		for(int k = 0; k < n; k++){
			if((k != i) && (know(i,k) || !know(k,i))) 
				return -1;
		} 
		return i;
	}

	private static boolean know(int i, int j) {
		boolean status = MATRIX[i][j] != 0;
		return status;
	}

}
