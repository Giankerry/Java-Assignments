import java.util.*;
public class arrayss {
	static boolean isEven(int x) {
		if(x%2==0) {return true;}
		else {return false;}
	}
	public static void main(String[] args) {
		char option;
		do {
		Scanner input = new Scanner(System.in);
		int oddSum=0,evenSum=0,oddCtr=0,evenCtr=0;
		System.out.print("What is the array size? ");
		int size=input.nextInt();
		int[] numbers = new int[size];
		int oddEven[][]=new int[2][20];
		System.out.println("Input the _ array contents:  ");
		for(int i = 0;i < size;i++) {
			numbers[i]=input.nextInt();
		}
		for(int i = 0;i < size;i++) {
			if (isEven(numbers[i])==true) {
				oddEven[0][evenCtr]=numbers[i];
				evenCtr++;
				evenSum+=numbers[i];
			}
			else {
				oddEven[1][oddCtr]=numbers[i];
				oddCtr++;
				oddSum+=numbers[i];
			}
		}
		System.out.print("Even numbers are: ");
		for(int i=0;i<evenCtr;i++) {
			System.out.print(oddEven[0][i]+" ");
		}
		System.out.print("\nOdd numbers are: ");
		for(int i=0;i<oddCtr;i++) {
			System.out.print(oddEven[1][i]+" ");
		}
		System.out.print("\nSum of even numbers: "+evenSum);
		System.out.print("\nSum of odd numbers: "+oddSum);
		System.out.print("\nPress y to run the program again. ");
		option= input.next().charAt(0);

	}while(option=='y'||option=='Y');
}

	
}
