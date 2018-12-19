package JavaLaearning;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution1 {
	
	public int solution2 (ArrayList<Point2D> A){
		
		int linearPointCount =0;
		
		for (int i = 0 ; i<A.size()-2 ; i++){
			
			for (int j = i+1 ; j<A.size()-1 ; j++){
								
				for (int k = j+1; k<A.size(); k++) {
					
					if (((A.get(i).x-A.get(j).x)*(A.get(j).y-A.get(k).y) - (A.get(j).x - A.get(k).x)*(A.get(i).y - A.get(j).y)) == 0)
						linearPointCount++;	
					
					if (linearPointCount > 100000000){
						linearPointCount = -1;
						return linearPointCount;
					}
				}
				
			}
			
			
		}
		
		return linearPointCount;
	}
	
}
