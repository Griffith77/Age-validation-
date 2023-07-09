package com.agevalidation;
import java.util.Scanner;
public class AgeValidation {

  public static void main(String[] args) {
  final int ya, oa;
//ya: younger age
//oa: old age

   System.out.println("enter your age");
   Scanner in = new Scanner(System.in);
   int age = in.nextInt();
   ya = 17;
   oa = 60;
   
   //conditional statements
if (age <= ya){
  System.out.println("you are young");
}else{
  if(age >= oa){
    System.out.println("you are old");
  }else{
    if((age > ya)&&(age < oa)){
      System.out.println("you are at a media age ");
    
      }
    }
    }
  }
}
  

