 import java.util.*;
 class Calculator {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
      
       double c;
       int s;
       String b;
        System.out.println("Enter 1 ->cube, 2 ->Abs, 3->Power, 4->Decimal to binary, 5->Binary to decimal, 6->Decimal to octal, 7->Decimal to hexadecimal");
        int x=sc.nextInt();
     
        switch(x)
        {
         
            case 1:
            System.out.println("Enter number");
             c=sc.nextDouble();
            System.out.println("cube-"+(c*c*c));
            break;

            case 2:
            System.out.println("Enter number");
             c=sc.nextDouble();
            System.out.println("Abs-"+ Math.abs(c));
            break;
            case 3:
            System.out.println("Enter number");
            c=sc.nextDouble();
           System.out.println("Power-"+ Math.pow(c,c));
           break;
           case 4:
           System.out.println("Enter decimal number");
           s=Integer.parseInt(sc.next());
           System.out.println("Decimal to binary-"+ Integer.toBinaryString(s));
           break;
           case 5:
           System.out.println("Enter binary number");
           int b1=sc.nextInt(2);
           s=Integer.parseInt(Integer.toString(b1));
           System.out.println("Binary to decimal-"+ s);
           break;
           case 6:
           System.out.println("Enter decimal number");
           s=Integer.parseInt(sc.next());
           System.out.println("Decimal to octal-"+ Integer.toOctalString(s));
           break;
           case 7:
           System.out.println("Enter decimal number");
           s=Integer.parseInt(sc.next());
           System.out.println("Decimal to Hexadecimal -"+ Integer.toHexString(s));
           break;
           default:
           System.out.print("wrong choice, Thank you");
           break;




        }
    }
}
