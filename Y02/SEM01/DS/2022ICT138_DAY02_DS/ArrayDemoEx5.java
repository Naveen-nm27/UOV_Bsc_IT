import java.util.*;

// class ArrayOps{
	// public void printArray(int[] arr){
		
	// }
// }
class ArrayDemoEx5{
	public static void main(String args[]){
			int[][]arr2D = {{1,2,5},{3,4,2},{5,6,3}};
			// System.out.println(arr2D.length);
			
			for(int i = 0; i < arr2D.length; i++){
				System.out.println();
				for(int j = 0; j < arr2D.length;j++){
						System.out.print(arr2D[i][j]);
						System.out.print(",");
					}
				}
					
					
			Scanner sc = new Scanner(System.in);
			System.out.println("\nEnter You'r X Dimantion");
			int dimX = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter You'r Y Dimantion");
			int dimY = sc.nextInt();
			sc.nextLine();
			
			int[][]arr2D_2 =  new int[dimX][dimY];
			
			for(int i = 0; i < dimX; i++){
				for(int j = 0; j < dimY; j++){
					System.out.println("Enter the Element: " + i + "x" + j);
					arr2D_2[i][j] = sc.nextInt();
				}
			}
			
			for(int i = 0; i < dimX; i++){
				System.out.println();
				for(int j = 0; j < dimY;j++){
						System.out.print(arr2D_2[i][j]);
						System.out.print(",");
					}
				}
				
				int max  = arr2D_2[0][0];
				
				for(int i = 0; i<dimX;i++){
					for(int j = 0;j <dimY;j++){
						if(arr2D_2[i][j] > max){
							max = arr2D_2[i][j];
						}
					}
				}
				
				System.out.println("\nMaximum Value is :" + max);
				
				
				int min  = arr2D_2[0][0];
				
				for(int i = 0; i<dimX;i++){
					for(int j = 0;j <dimY;j++){
						if(arr2D_2[i][j] > max){
							min = arr2D_2[i][j];
						}
					}
				}
				
				System.out.println("\nMinumum Value is :" + min);
				
				int temp = 0;
				int temp2 = 0;
				
				for(int k =0;k < dimY;k++){
						temp2 += temp;
						temp = 0;
					for(int i = 0; i<dimX;i++){
						for(int j = 0;j <dimY;j++){
							temp += arr2D_2[i][j];
						}
						break;
					}
						System.out.println("row sum for row " + (k + 1) + " " + temp2);
				}
				
				
			
		}
	}