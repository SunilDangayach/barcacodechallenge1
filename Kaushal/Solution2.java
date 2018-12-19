package JavaLaearning;

public class Solution2 {

	public int solution (int[] A, int X, int Y, int Z){
		int totalTime = 0;
		
		int[][] dispenserAllocation = {{X,0},{Y,0},{Z,0}};
				
		for (int carNumber = 0;carNumber < A.length ; totalTime++){
			
				
			boolean dispenserAvailable = true;	
			while (dispenserAvailable == true && carNumber < A.length){
					int dispenser =  dispenserAvailable(A[carNumber], dispenserAllocation);
					if (dispenser != -1){
						dispenserAllocation[dispenser][1] = A[carNumber];
						carNumber = carNumber +1;
						
					}else {
						
						dispenserAvailable = false;
					}
					
			}
			
			 if (!fuleFillingPossible(dispenserAllocation)){
				 	totalTime = -1;			
					return totalTime;
				}		
					
			}
			
		return totalTime -1;
	}
	
	public int dispenserAvailable(int carFuel, int[][] dispenserAllocation ){
		
		int dispenserAvailable = -1;
		
		for ( int i = 0 ; i < dispenserAllocation.length  ; i ++){
			
			if (dispenserAllocation[i][1] == 0  && dispenserAllocation[i][0] >= carFuel){
				 dispenserAvailable = i;
				break;
			}
		}
		
		return dispenserAvailable;
	}
	
	
	public boolean fuleFillingPossible( int[][] dispenserAllocation){
		
		boolean fuelFillingPossible = false;
		for ( int i = 0 ; i <dispenserAllocation.length  ; i ++){
			if (dispenserAllocation[i][1] > 0){
				dispenserAllocation[i][0] = dispenserAllocation[i][0]-1;
				dispenserAllocation[i][1] = dispenserAllocation[i][1]-1;		
				fuelFillingPossible = true;
			}
		}
		
		return fuelFillingPossible;
	}
	
}
