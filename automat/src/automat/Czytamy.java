package automat;

import java.io.*;

import java.util.ArrayList;

import java.util.*;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

 

 

public class Czytamy {


 

  public static void ReadFile() throws Exception {

 

       File file = new File("c:\\Users\\F93ME6X\\Desktop\\PROJEKTY-TESTY\\Automatyzacja\\Eclipse\\Czytamy.txt");

 

       ArrayList<String> arr = new ArrayList<>();

       ArrayList<String> arr2 = new ArrayList<>();

       BufferedWriter writer = null;

       BufferedReader br = new BufferedReader(new FileReader(file));

 

       File file2 = new File("c:\\Users\\F93ME6X\\Desktop\\PROJEKTY-TESTY\\Automatyzacja\\Eclipse\\Piszemy.txt");

 

       writer = new BufferedWriter(new FileWriter(file2));

 

       String st;

       String msgFiid ;

       String rest;

      

        while((st = br.readLine()) != null) {

 

              arr.add(st);

 

        }

 

        String wart = arr.get(3).substring (7,17);

        String wart2 ="20181205";

        String[] wart3 = new String[60];

       

         

        for (int u =0;u <arr.size(); u++) {              

        msgFiid = arr.get(u).substring (7,17) ;  

       

        

        if(msgFiid==wart2) {

             System.out.print(" cos nie tak");

        continue;

        }

        else

             arr2.add(msgFiid);

        }

 

      Collections.sort(arr2);

          

      for (int l =0;l <arr2.size(); l++) {  

   

       writer.write( "\n");

       rest = arr2.get(l);

     writer.write(rest);

    

     }

     

      writer.close();

           

      Pattern regexp = Pattern.compile("^20181205$");

      Matcher matcher = regexp.matcher("");

      int count =0;

     

      BufferedReader br2 = new BufferedReader(new FileReader(file2));

      String line = null;

      while ((line = br2.readLine()) != null) {

         matcher.reset(line); //reset the input

          if (matcher.find()) {

               System.out.println("wyszlo     "+line);

               count++;

          }

               

      }

      System.out.println(regexp + "   wyszlo tyle:    "+ count);

     

     

      String number;

      int sum =0;

      String srednik = Character.toString ((char) 59 ) ;

     

      for (int k =0;k <arr2.size(); k++) { 

         number = arr2.get(k).substring (0,1) ;

         

         int suma = Integer.parseInt(number);

         System.out.println(suma);

         sum += suma;

                

      }

     

      System.out.println("To jest ta slyna suma o ktorej byla mowa   " + sum);

      System.out.println("Komentarz testuajacy gita   " );

     

      String str = "GeeksforGeeks:A Computer Science Portal";

      String[] arrOfStr = str.split(":");

 

      for (String a : arrOfStr)

          System.out.println(a);  

   

  }

  

       public static void main(String[] args) throws Exception {

 

       ReadFile();

       }
       
}