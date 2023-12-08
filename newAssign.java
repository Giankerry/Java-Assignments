import java.util.*;

public class newAssign {
	static float thirdNum,secondNum,firstNum;
	public float getAverage(float fnum,float sNum,float tNum){
	    float average=(firstNum+secondNum+thirdNum)/3;
		return average;
	}
	
	
	public static void main(float fnum,float snum,float tnum, float average) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Input first number : ");
	    firstNum = input.nextFloat();
	    fnum=firstNum;
	    System.out.print("Input second number : ");
	    secondNum = input.nextFloat();
	    snum = secondNum;
	    System.out.print("Input second number : ");
	    thirdNum = input.nextFloat();
	    tnum = thirdNum;
	    System.out.print("The average value is "+average);
   
	}

}
