
package vehicles.management.system;

import java.util.Scanner; 

public class main {
    public static void main(String[] args)
    {
    details a;
    a=new details();
        Scanner input = new Scanner(System.in);
        String u;
        String p;
        int i = 1;
//////        
        System.out.println("-----welcome to Khulna BRTA-----\n\n");
        System.out.println("--Vehicles Management System--\n\n");
        System.out.println("Enter Your Username : ");
        u=input.nextLine();
        System.out.println("Enter Your Password : ");
        p=input.nextLine();
        
        
       
        if ("Fatima Tuz Jahura".equalsIgnoreCase(u) || "habibullah".equalsIgnoreCase(u) || "habib".equalsIgnoreCase(u)) {
            
            if("122".equals(p)|| "136".equals(p)|| "1212".equals(p)){
                    
                while(i<2)
     {
     int x;
        System.out.println("-----welcome to Khulna BRTA-----\n\n");
        System.out.println("Press ONE For create .txt file.\n");
        System.out.println("Press Two For Input Vehicles Information\n");
        System.out.println("Press Three For Show All Data From File\n");
        System.out.println("Press Four For Change Vehicles Details\n");
        System.out.println("Press five For Delete vehicles Information\n");
        System.out.println("Press six for EXIT The programme\n");
        
         System.out.println("     Enter your choice (1-6)    ");
         x=input.nextInt();
         if(x==1)
         {
         a.creat_file();
         }
         else if(x==2)
         {
         a.write_file();
         }
         else if (x==3)
         {
         a.read_file();
         } 
         else if (x==4)
         { int t;
             System.out.println("Enter One For Change Owner name \n"
                     + "Enter Two For Change Vehicles Clour\n"
                     + "Press Three For Cancle The process\n"
                     + "Please Enter Your Choice:");
            t=input.nextInt();
             if(t==1)
             {a.search_and_update_file();}
             else if(t==2)
             {a.Cng_clr();}
         
         } 
        
         else if (x==5)
         {
         a.delete();
         } 
         else
         {
             System.out.println("Thank You Very Much For Using Our Programme ");
             break;
         }

     }
                
            
            }
            else {System.out.println("Incorrect password!");}
            
            
        } 
        else
        {
            System.out.println("Incorrect Username!");
            
                    
        }
     
     
    }

}
    
