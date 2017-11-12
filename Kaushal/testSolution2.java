package JavaLaearning;

import java.util.ArrayList;

public class testSolution2 {
	
public static void main (String args[]){
		
		ArrayList<Point2D> A = new ArrayList();
		
		int[][] points = {{0,0},{1,1},{2,2},{3,3},{3,2},{4,2},{5,1}};

		for (int i=0; i<points.length; i++){
			
			Point2D point = new Point2D();
			point.x = points[i][0];
			point.y = points[i][1];
			
			A.add(point);
		}
		 
	
		int i = new Solution1().solution2(A);
		
		System.out.println(i);
		
		
			
			int[] A1 = {2,8 ,2,3,3};
			int X = 7;
			int Y = 11;
			int Z= 3;
		
			int time = new Solution2().solution( A1, X,Y,Z);
			
			System.out.println(time);
	
	}

}
