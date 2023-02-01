import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        int copy=n;
        int c=0;
        int d;
        while(n>0)
        {
            d=n%10;
            c++; n=n/10;
        }
        n=copy;
        int sum=0;
        while(n>0)
        {
            d=n%10;
            sum=(int)(sum+Math.pow(d,c));
            n=n/10;
        }
        if(sum==copy)
        {
            System.out.print("Its a armstrong no.");
        }
        else
        System.out.print("Its not a armstrong no.");

        sc.close();

    }
    
}
