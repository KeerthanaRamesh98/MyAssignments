package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8;
		int num1 = 0;
		int num2 = 1;
		System.out.println(num1);
		System.out.println(num2);
	
		for(int i=2;i<range;i++)
		{
			int sum= num1+num2;
			num1=num2;
			num2=sum;
			System.out.println(sum);
		}
		

	}

}
