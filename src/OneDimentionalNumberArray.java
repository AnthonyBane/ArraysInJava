import java.util.Scanner;

public class OneDimentionalNumberArray {
	
	
	
	public static void main (String[] args) {
		int [] intArr = new int [4];
		
		for(int i = 0; i<intArr.length; i++){
			intArr[i] = getInput();
		}
		
		System.out.printf("Before sorting\n\n");
		
		for(int location : intArr){
			System.out.printf("Number: %d\n", location);
		}
		
		swap(intArr);
		
		System.out.printf("\nAfter sorting\n\n");
		
		for(int location : intArr){
			System.out.printf("Number: %d\n", location);
		}
		
	}
	
	private static void swap (int[] intArr) {
		
		int lowestNum = getMinimum(intArr);
		
		if (lowestNum == intArr[0]){
			System.out.println("No swap");
		}else{
			int temp = intArr[lowestNum];
			intArr[lowestNum] = intArr[0];
			intArr[0] = temp;
		}
	}
	
	private static int getMinimum(int[] intArray){
		int min = intArray[0];
		int smallestPosition = 0;

			for(int x = 1; x<intArray.length; x++){
				if (min>intArray[x]){
					smallestPosition = x;
				}
			}
		return smallestPosition;
	}
	
	private static int getInput(){
		int number;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		
		number = reader.nextInt();
		
		return number;
	}
	
	
}
