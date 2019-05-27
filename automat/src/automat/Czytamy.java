package automat;

import java.awt.*;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

 

public class Czytamy{

 

       public static void main(String[] args) throws Exception {

             ReadFile();

       }

 

       public static void ReadFile() throws Exception {

 

             File file = new File("c:\\Users\\F93ME6X\\Desktop\\PROJEKTY-TESTY\\Automatyzacja\\Eclipse\\Czytamy.txt");

             ArrayList<String> arr = new ArrayList<>();
             ArrayList<String> arr2 = new ArrayList<>();
             BufferedWriter writer = null;
             BufferedReader br = new BufferedReader(new FileReader(file));

             File outputFile = new File("c:\\Users\\F93ME6X\\Desktop\\PROJEKTY-TESTY\\Automatyzacja\\Eclipse\\Piszemy.txt");

             writer = new BufferedWriter(new FileWriter(outputFile));

             String st;
             String zmienna;
             String rest;

             while ((st = br.readLine()) != null) {

                    arr.add(st);
 
             }

             String zmienna2;
             String zera = "0;0";
             String data = "201812";
             /* String[] wart3 = new String[60]; */
             String zmienna3;
             int sum =0;

             for (int u = 0; u < arr.size(); u++) {

                    String[] lineData = arr.get(u).split(";");

                    /*
                    * zmienna = arr.get(u).substring(18, 21); zmienna2 = arr.get(u).substring(9,
                    * 17);
                    */
                    zmienna3 = arr.get(u);
                    String c1 = lineData[0];
                    String c2 = lineData[1];
                    String c3 = lineData[2];
                    String c4 = lineData[3];

                    /*
                    * if (zmienna2 != data || zmienna == zera) {
                    * System.out.println(" cos nie tak"); continue; } else { arr2.add(zmienna3); }
                    */
                    if ((c3 + ";" + c4).equals(zera) || !c2.substring(0,6).equals(data)) {
                           System.out.println(" cos nie tak");
                           continue;
                           
                    } else {

                           int suma = Integer.parseInt(c3);
                           sum += suma;
                   
                          arr2.add(zmienna3);
                    }

             }

             System.out.println("To jest ta suma o tkora sie pytano:    " + sum);
          
             //sortowanie
            
             for(int j=0;j<arr2.size();j++){
                                                                    
                                for(int i=j+1;i<arr2.size();i++){
                   
                                /*if(Integer.parseInt(arr2.get(i)) Integer.parseIntarr2.get(j))<0)*/
                                       
                                 if((arr2.get(i)).compareToIgnoreCase(arr2.get(j))<0){
                                                                              
                                        String t = arr2.get(j);
                                       
                                        arr2.set( j, arr2.get(i));

                                        arr2.set( i, t);
                                             
                                    }
                                   
                                }      

                                 writer.write("\n");
                                 rest = arr2.get(j);
                                 writer.write(rest);
                                                                                      
                            System.out.println(arr2.get(j));
                   
                            }

             writer.close();
             //Collections.sort(arr2);
             /*for (int l = 0; l < arr2.size(); l++) {

                    writer.write("\n");

                    rest = arr2.get(l);

                    writer.write(rest);
 
             }

             writer.close();*/           
             //Szukanie wyra¿eniem regularnym

            

       /*     Pattern regexp = Pattern.compile("(0;0)");

             Matcher matcher = regexp.matcher("");

             int count = 0;

             BufferedWriter writer2 = null;

             writer2 = new BufferedWriter(new FileWriter(outputFile));

 

             BufferedReader br2 = new BufferedReader(new FileReader(file));

             String line = null;

             while ((line = br2.readLine()) != null) {
                    matcher.reset(line);

                    if (!matcher.find()) {

                           System.out.println("First Capturing Group: "+matcher.group(0));

                           System.out.println("wyszlo     " + line);

                           count++;

                           writer2.write("\n");

                           writer2.write(line);

                          

                    }

 

             }

             writer2.close();

             System.out.println(regexp + "   wyszlo tyle:    " + count);*/

            

            

            

 

       }

}