public class Series {
    //Sum of Series 1 + 1/2 + 1/3 + 1/4 + 1/5
    public static void main(String[] args) {
        int i;
        double sum=0.0;
        for(i=1;i<=5;i++)
        {
            sum=sum+(1.0/i);
        }
        System.out.print("Sum of series- "+sum);
    }
    
}
