import java.util.*;
public class LCM {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 2 numbers");
    int x=sc.nextInt();
    int y=sc.nextInt();
    int s= (x>y)?x:y;
    int i;
    int gcd=0;
    for(i=1;i<=s;i++)
    {
        if(x%i==0 && y%i==0)
           gcd=i;
    }
    double lcm= (x*y)/gcd;
    System.out.println("LCM is "+lcm);
    sc.close();

}    
}
