public class Electricitybill {
    public static void main(String[] args) {
        
        //Electricity Bill, Based on Given Unit  e.g Upto 199 Units Per unit Charge 
        //@1.20 , 200 to 400 @1.50 Unit 400 to 600 Bill @1.80 , > 600 @2.00 , if bill Exceed Rs 400 Surcharge 15% 

        int units=544; double bill;
        if(units>=1&& units<=199)
        {
            bill=units*1.2;

        }
        else if(units>=200 && units<=399)
        {
            bill=199*1.2 +(units-199)*1.5;
        }
        else if(units>=400 && units<=599)
        {
            bill=199*1.2 + 200*1.5 +(units-399)*1.8;
        }
        else{
            bill=199*1.2 + 200*1.5 + 200*1.8 +(units-599)*2;
        }

        System.out.print(bill);
    }
    
}
