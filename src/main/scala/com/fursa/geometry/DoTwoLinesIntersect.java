/**
 * 
 */
package com.fursa.geometry;

import com.fursa.common.Point;

/**
 * @author nkakkireni
 *
 */
public class DoTwoLinesIntersect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point p1 = new Point(10, 0) ;
		Point q1 = new Point(0,10) ;
		Point p2 = new Point(0,0) ;
		Point q2 = new Point(10,10) ;
		boolean isTwoLinesIntersect = checkTwoLinesIntersect(p1,p2,q1,q2);
		if(isTwoLinesIntersect)
			System.out.println("The mentioned lines intersect");
		else 
			System.out.println("The mentioned line doesnt intersect");
	}

	private static boolean checkTwoLinesIntersect(Point p1, Point p2, Point q1,
			Point q2) {
		int o1 = getOrientation(p1,q1,p2);
		int o2 = getOrientation(p1,q1,q2);
		int o3 = getOrientation(p2,q2,p1);
		int o4 = getOrientation(p2,q2,q1);

		if(o1 != o2 && o3 != o4) return true;

		if(o1 == 0 && isOnSameSegment(p1,q1,p2)) return true;
		
		if(o2 == 0 && isOnSameSegment(p1,q1,q2)) return true;
		
		if(o3 == 0 && isOnSameSegment(p2,q2,p1)) return true;
		
		if(o4 == 0 && isOnSameSegment(p2,q2,q1)) return true;
		
		return false;
	}

	private static boolean isOnSameSegment(Point p, Point q, Point r) {
		if(r.getX() <= Math.max(p.getX(),q.getX()) && r.getX() >= Math.min(p.getX(), q.getX()) 
				&& r.getY() <= Math.max(p.getY(), q.getY()) && r.getY() >= Math.min(p.getY(), q.getY())  ) return true;
		return false;
	}

	private static int getOrientation(Point p, Point q, Point r) {
		if(p == null || q == null || r == null){
			System.out.println("Input is wrong ..please check !!!");
			System.exit(-1);
		}else{
			float slope = ((q.getY()-p.getY()))*(r.getX()-q.getX())-(r.getY()-q.getY())*(q.getX()-p.getX());
			if(slope == 0) return 0;
			else if (slope>0) return 1; //Anti clock wise
			else return 2; //clock wise
		}
		return 0;
	}

}
