package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num = 5;
        int result = 1;
        for(int i=1;i<=num;i++)
        {
        	result = result*i;
        }
        System.out.println("The factorial of "+num+" is "+result);
	}

}
