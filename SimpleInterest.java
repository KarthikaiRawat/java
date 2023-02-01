import java.util.*;
class SimpleInterest
{
    Scanner sc=new Scanner(System.in);
    String name,bname,desg,dep;
    int emp,acc;
    
   
         double ns,bs,HRA,TA,MA,gs,PF,tax;
    void info(){
        System.out.println("Enter Principal amount");
        double pa=sc.nextDouble();
         System.out.println("Enter time");
         float t=sc.nextFloat(); 
         System.out.println("Enter rate");
         float r=sc.nextFloat(); 
         double si=(pa*r*t)/100.0;
         System.out.println("SimpleInterest="+si);
        System.out.print("Enter name");
     name=sc.nextLine();
     System.out.print("Enter bank name");
     bname=sc.nextLine();
     System.out.print("Enter emp no");
      emp=sc.nextInt();
      System.out.print("Enter designation");
      desg=sc.nextLine();
      System.out.print("Enter department");
      dep=sc.nextLine();
      System.out.print("Enter account no");
      acc=sc.nextInt();

    }
    void earn(){

        System.out.println("Enter Basic salary");
         bs=sc.nextDouble();
        HRA=bs*(50.0/100.0);
          TA=bs*(30.0/100.0);
          MA=bs*(25.0/100.0);
         
          gs=bs+HRA+TA+MA;

    }
    void deduc(){
        PF=bs*(10.0/100.0);
        tax=(10.0/100.0)*gs;
    }
    void display(){
        // System.out.print(" name:"+name+"                                       "+" Bank name:"+bname);
      
        // System.out.print(" Emp no:"+emp+"                                      "+" Designation"+desg);
     
        // System.out.print(" department:"+dep+"                                   "+" account no."+acc);
      
        // ns=gs-tax-PF;
        // System.out.print(" Net Salary"+ns);
        
             System.out.println("---------------------Company Name----------------------------");        
             System.out.println("----------------Salary slip for Oct 2022---------------------"); 
             System.out.println("Name      "+name+"                            Department  "+dep); 
             System.out.println("Emp. No   "+emp+"                             Bank Name"+bname); 
             System.out.println("Designation"+desg+"                           A/c No."+acc); 
             System.out.println(""); 
             System.out.println("---------------Earnings---------|----Deductions----------------"); 
             System.out.println("Basic Salary           25200    | EPF                    1800"); 
             System.out.println("House Rent Allownances  9408    | Health Insurance        500"); 
             System.out.println("Conveyance Allownances  1493    | Professional Tax        200"); 
             System.out.println("Medical Allownances     1167    | TDS                        "); 
             System.out.println("Special  Allownances    18732   |                             "); 
             System.out.println("Gross Salary            56000   | Total Deductions        2500"); 
              
             System.out.println("           Net Pay              |        "+ns); 
             System.out.println("---------------------------------------------------------");
            
    
    }
     public static void main(String[] args) 
     {
        //Scanner sc=new Scanner(System.in);
         SimpleInterest s =new SimpleInterest();
        s.info();
        s.earn();
        s.deduc();
        s.display();
      
        
    
         

        
    }
}