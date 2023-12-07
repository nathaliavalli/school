/*
   Name:Nathalia Valli
   Date:10/30/18
   Purpose: magic 8 ball , store answers in array than user will ask something and the program will ramdomly answer with the list 
   Lab #7  question 7 page 488
   */
   
   import java.util.Scanner;
   import java.util.ArrayList;
   import java.util.Random;

      
   public class EightBall
   {
   public static void main (String [] args) 
   {
   // Create an ArrayList to hold the answers.
   ArrayList<String> answerList = new ArrayList<String>();
   //add the answers
   answerList.add("Yes, of course!");
   answerList.add("Without a doubt, yes.");
   answerList.add("You can count on it.");
   answerList.add("For sure!");
   answerList.add("Aks me later.");
   answerList.add("I am not sure");
   answerList.add("I can’t tell you right now.");
   answerList.add("I’ll tell you after my nap.");
   answerList.add("No way!");
   answerList.add("I don’t think so.");
   answerList.add("Without a doubt, no.");
   answerList.add("The answer is clearly NO.");
   
  //create new keybord scanner.
  Scanner input = new Scanner (System.in);
  //prompt user to input file name
  System.out.println(" Type in your question.");
  String filename = input.nextLine();
  
  //random method for the answers
  Random answer = new Random ();
    
  
     int index = answer.nextInt((answerList.size() -1 )+1) ;
         
         System.out.print ( answerList.get(index));
         
               }   
     }  
