/*

		        0
			  0 1
			0 1 0
		  0 1 0 1
		0 1 0 1 0


*/

class SpacePattern2 {
	
	public static void main(String[] args){
		
		for(int row = 1; row <= 5; row++){
			
			int num = 0;
			for(int space = 4; space >= row; space--){
				
				System.out.print("  ");
			}
			for(int col = 1; col <= row ; col++){
				
				System.out.print(num+" ");
				if(num == 1){
				
					num--;
				}else{
				
					num++;
				}
			}
			System.out.println();
				
		}
	}
}