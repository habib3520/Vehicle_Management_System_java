
package vehicles.management.system;

import java.io.BufferedWriter;
import java.io.File; 
import java.io.FileNotFoundException;  
import java.io.IOException;
import java.util.Scanner; 
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileWriter;
import java.io.PrintWriter;

public class details {
    
  
    // Create file if the file not exists 
    void creat_file(){
    
     try {
      File myObj = new File("Vehicles_info.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("Vehicles_info.txt already exists.\n");
      }
        } 
      catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
                }
    }
    //Write to file named Vehicles_info.txt
    void write_file(){
        System.out.println("File Input Process Start...."); 
    String temp;
    try
    {
     Scanner sc = new Scanner(System.in);
     File file = new File("Vehicles_info.txt");
     FileWriter fr = new FileWriter(file, true);
     BufferedWriter br = new BufferedWriter(fr);
     PrintWriter pr = new PrintWriter(br);
     System.out.println("Enter Vehicles Type: ");
     temp = sc.nextLine();
     pr.println(temp);
     System.out.println("Enter Vehicles Company Name: ");
     temp = sc.nextLine();
     pr.println(temp) ;
     System.out.println("Enter Vehicles Model: ");
     temp = sc.nextLine();
     pr.println(temp);
     System.out.println("Enter Vehicles Brand Origin: ");
     temp = sc.nextLine();
     pr.println(temp) ;
     System.out.println("Enter How Much Seat In This Vehicles : ");
     temp = sc.nextLine();
     pr.println(temp) ;
     System.out.println("Enter Vehicles clour : ");
     temp = sc.nextLine();
     pr.println(temp) ;
     System.out.println("Enter Vehicles Owner Name: ");
     temp = sc.nextLine();
     pr.println(temp) ;
     System.out.println("Enter Vehicles Registration Number: ");
     temp = sc.nextLine();
     pr.println(temp) ;
     System.out.println("Enter vehicles Manufacturer Date: ");
     temp = sc.nextLine();
     pr.println(temp) ;
     System.out.println("Enter vehicles Enigine Number: ");
     temp = sc.nextLine();
     pr.println(temp) ;
     System.out.println("Enter vehicles Chassis Number: ");
     temp = sc.nextLine();
     pr.println(temp) ;
     System.out.println("Enter vehicles Weight: ");
     temp = sc.nextLine();
     pr.println(temp) ;
     System.out.println("Enter vehicles Date Of Registration: ");
     temp = sc.nextLine();
     pr.println(temp) ;
     System.out.println("Enter vehicles Buy From: ");
     temp = sc.nextLine();
     pr.println(temp) ;
     System.out.println("Enter vehicles price: ");
     temp = sc.nextLine();
     pr.println(temp) ;
     
     
    pr.close();
    br.close();
    fr.close();
    }
catch(IOException e) {
		e.printStackTrace();
             
}
    } 
    
//Read All Vehicles_info.txt File Data    
 void read_file(){
 System.out.println("File All Data Showing Process Start....\n");
 
 String type;
 String company;
 String model;
 String origin;
 int seat;
 String clr;
 String name;
 String reg_nmbr;
 String m_date;
 String engine;
 String chassis;
 int weight;
 String r_date;
 String loc;
 int pr;
 
 File myObj ;
 Scanner myReader ;
 try {
      myObj = new File("Vehicles_info.txt");
      myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
          
          type = myReader.nextLine();
          company = myReader.nextLine();
          model = myReader.nextLine();
          origin = myReader.nextLine();
          seat = Integer.parseInt(myReader.nextLine());
          clr =myReader.nextLine();
          name = myReader.nextLine();
          reg_nmbr = myReader.nextLine();
          m_date = myReader.nextLine();
          engine = myReader.nextLine();
          chassis =myReader.nextLine();
          weight = Integer.parseInt(myReader.nextLine());
          r_date = myReader.nextLine();
          loc = myReader.nextLine();
          pr = Integer.parseInt(myReader.nextLine());
        
        System.out.println("(i) Vehicles Type = "+type+"\n(ii) Vehicles Company = "+company+"\n(iii) Vehicles Model = "+
                model+"\n(iv) Vehicles Origin = "+origin+"\n(v) Vehicles Seat = "+seat+"\n(vi)colour = "+clr+"\n(vii) Owner Name = "+name+"\n(viii) Reg. Number = "+reg_nmbr+"\n(ix) Manufacturer Date = "+m_date+
                "\n(x) Engine Number = "+engine+"\n(xi) Chassis Number = "+chassis+"\n(xii) Vehicles Weight = "+weight+"\n(xiii) Reg Date = "+r_date+"\n(xiv) Buy From = "+loc+"\n(xv) Price = "+pr+"\n");
        
        
      }
      myReader.close();
 } 
 catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
 }

 }   
 //Search and update to File 
 void search_and_update_file(){
 System.out.println("Serach By Reg Number And Change Owner Name Process Start ..... " );
 Scanner sc = new Scanner(System.in);
 File myObj ;
 Scanner myReader ;
 
 String type;
 String company;
 String model;
 String origin;
 int seat;
 String clr;
 String name;
 String reg_nmbr;
 String m_date;
 String engine;
 String chassis;
 int weight;
 String r_date;
 String loc;
 int pr;
 
 System.out.println("Enter Vehicles Registration Number : ");
 String n = sc.nextLine();
 System.out.println("Enter New Owner name : ");
 String n_name = sc.nextLine();
 String content;
 try
 { 
     myObj = new File("Vehicles_info.txt");
     myReader = new Scanner(myObj);
     
     StringBuffer buffer = new StringBuffer();
     while (myReader.hasNextLine()) {
         
          type = myReader.nextLine();
          company = myReader.nextLine();
          model = myReader.nextLine();
          origin = myReader.nextLine();
          seat = Integer.parseInt(myReader.nextLine());
          clr = myReader.nextLine();
          name = myReader.nextLine();
          reg_nmbr = myReader.nextLine();
          m_date = myReader.nextLine();
          engine = myReader.nextLine();
          chassis =myReader.nextLine();
          weight = Integer.parseInt(myReader.nextLine());
          r_date = myReader.nextLine();
          loc = myReader.nextLine();
          pr = Integer.parseInt(myReader.nextLine());
          
         
     
        if(reg_nmbr.equalsIgnoreCase(n))
        {
            name = n_name; 
        }
        
        buffer.append(type+System.lineSeparator());
        buffer.append(company+System.lineSeparator());
        buffer.append(model+System.lineSeparator());
        buffer.append(origin+System.lineSeparator());
        buffer.append(String.valueOf(seat)+System.lineSeparator());
        buffer.append(clr+System.lineSeparator());
        buffer.append(name+System.lineSeparator());
        buffer.append(reg_nmbr+System.lineSeparator());
        buffer.append(m_date+System.lineSeparator());
        buffer.append(engine+System.lineSeparator());
        buffer.append(chassis+System.lineSeparator());
        buffer.append(String.valueOf(weight)+System.lineSeparator());
        buffer.append(r_date+System.lineSeparator());
        buffer.append(loc+System.lineSeparator());
        buffer.append(String.valueOf(pr)+System.lineSeparator());
        
     
      }
     content = buffer.toString();
     System.out.println(content);
     FileWriter writer = new FileWriter("Vehicles_info.txt");
         writer.append(content);
         writer.flush();
 }
 catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
 }  
 catch (IOException ex) {
            Logger.getLogger(vehicles.management.system.details.class.getName()).log(Level.SEVERE, null, ex);
 }
 
 }
 //Search and update to File 
 void Cng_clr(){
 System.out.println("Serach By Reg Number And Change Vehicles colour chenge Process Start ..... " );
 Scanner sc = new Scanner(System.in);
 File myObj ;
 Scanner myReader ;
 
 String type;
 String company;
 String model;
 String origin;
 int seat;
 String clr;
 String name;
 String reg_nmbr;
 String m_date;
 String engine;
 String chassis;
 int weight;
 String r_date;
 String loc;
 int pr;
 
 System.out.println("Enter Vehicles Registration Number : ");
 String n = sc.nextLine();
 System.out.println("Enter Vehicles New Color : ");
 String n_color = sc.nextLine();
 String content;
 try
 { 
     myObj = new File("Vehicles_info.txt");
     myReader = new Scanner(myObj);
     
     StringBuffer buffer = new StringBuffer();
     while (myReader.hasNextLine()) {
         
          type = myReader.nextLine();
          company = myReader.nextLine();
          model = myReader.nextLine();
          origin = myReader.nextLine();
          seat = Integer.parseInt(myReader.nextLine());
          clr = myReader.nextLine();
          name = myReader.nextLine();
          reg_nmbr = myReader.nextLine();
          m_date = myReader.nextLine();
          engine = myReader.nextLine();
          chassis =myReader.nextLine();
          weight = Integer.parseInt(myReader.nextLine());
          r_date = myReader.nextLine();
          loc = myReader.nextLine();
          pr = Integer.parseInt(myReader.nextLine());
          
         
     
        if(reg_nmbr.equalsIgnoreCase(n))
        {
            clr = n_color; 
        }
        
        buffer.append(type+System.lineSeparator());
        buffer.append(company+System.lineSeparator());
        buffer.append(model+System.lineSeparator());
        buffer.append(origin+System.lineSeparator());
        buffer.append(String.valueOf(seat)+System.lineSeparator());
        buffer.append(clr+System.lineSeparator());
        buffer.append(name+System.lineSeparator());
        buffer.append(reg_nmbr+System.lineSeparator());
        buffer.append(m_date+System.lineSeparator());
        buffer.append(engine+System.lineSeparator());
        buffer.append(chassis+System.lineSeparator());
        buffer.append(String.valueOf(weight)+System.lineSeparator());
        buffer.append(r_date+System.lineSeparator());
        buffer.append(loc+System.lineSeparator());
        buffer.append(String.valueOf(pr)+System.lineSeparator());
        
     
      }
     content = buffer.toString();
     System.out.println(content);
     FileWriter writer = new FileWriter("Vehicles_info.txt");
         writer.append(content);
         writer.flush();
 }
 catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
 }  
 catch (IOException ex) {
            Logger.getLogger(vehicles.management.system.details.class.getName()).log(Level.SEVERE, null, ex);
 }
 
 }
  //Delete from file
 void delete(){
     
     
 System.out.println("Vehicles Info Delete Process Start....");
 try
 { 
     Scanner in;
     in = new Scanner(System.in);
     File myObj ;
     Scanner myReader ;
     
    String type;
    String company;
    String model;
    String origin;
    int seat;
    String clr;
    String name;
    String reg_nmbr;
    String m_date;
    String engine;
    String chassis;
    int weight;
    String r_date;
    String loc;
    int pr;
     
     
     String content;
     System.out.println("Enter Vehicles Registration Number : ");
     String del_info = in.nextLine();
     content = "";
     myObj = new File("Vehicles_info.txt");
     myReader = new Scanner(myObj);
     
     StringBuffer buffer = new StringBuffer();
     while (myReader.hasNextLine()) {
         
          type = myReader.nextLine();
          company = myReader.nextLine();
          model = myReader.nextLine();
          origin = myReader.nextLine();
          seat = Integer.parseInt(myReader.nextLine());
          clr =  myReader.nextLine();
          name = myReader.nextLine();
          reg_nmbr = myReader.nextLine();
          m_date = myReader.nextLine();
          engine = myReader.nextLine();
          chassis =myReader.nextLine();
          weight = Integer.parseInt(myReader.nextLine());
          r_date = myReader.nextLine();
          loc = myReader.nextLine();
          pr = Integer.parseInt(myReader.nextLine());
         
        
         
        if(!reg_nmbr.equalsIgnoreCase(del_info))
        {
            
        buffer.append(type+System.lineSeparator());
        buffer.append(company+System.lineSeparator());
        buffer.append(model+System.lineSeparator());
        buffer.append(origin+System.lineSeparator());
        buffer.append(String.valueOf(seat)+System.lineSeparator());
        buffer.append(clr+System.lineSeparator());
        buffer.append(name+System.lineSeparator());
        buffer.append(reg_nmbr+System.lineSeparator());
        buffer.append(m_date+System.lineSeparator());
        buffer.append(engine+System.lineSeparator());
        buffer.append(chassis+System.lineSeparator());
        buffer.append(String.valueOf(weight)+System.lineSeparator());
        buffer.append(r_date+System.lineSeparator());
        buffer.append(loc+System.lineSeparator());
        buffer.append(String.valueOf(pr)+System.lineSeparator());
        
            
          
        }
       
      }
    
     content = buffer.toString();
     System.out.println(content);
     FileWriter writer = new FileWriter("Vehicles_info.txt");
     writer.append(content);
     writer.flush();
 }
 catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
 }  
 catch (IOException ex) {
            Logger.getLogger(vehicles.management.system.details.class.getName()).log(Level.SEVERE, null, ex);
 }
 
 
 }
           
}
 
