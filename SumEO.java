
import java.util.*;

class SumEO {
	static void getSum(int n)
	{
		
		int sumOdd = 0, sumEven = 0, c = 0;

		while (n != 0) {
			if (c % 2 == 0)
				sumEven += n % 10;
			else
				sumOdd += n % 10;
			n /= 10;
			c++;
		}

		System.out.println("Sum odd = " + sumOdd);
		System.out.println("Sum even = " + sumEven);
	}

	
	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int num=sc.nextInt(), reversed = 0;
		getSum(num);
	}
}

