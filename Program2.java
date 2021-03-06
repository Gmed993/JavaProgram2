//***************************************************************
//
//  Developer:         Glen Medford
//
//  Program #:         Program 2
//
//  File Name:         Program2.java
//
//  Course:            ITSE 2321 Object-Oriented Programming - Java
//
//  Due Date:          9/14
//
//  Instructor:        Prof. Fred Kumi
//
//  Chapter:           Chapter 2
//
//  Description:
//     This program calculates the total cost after tax and tip from a $44.50 meal
//
//***************************************************************
public class Program2
{
   //***************************************************************
   //
   //  Method:       main
   //
   //  Description:  The main method of the program
   //
   //  Parameters:   String array
   //
   //  Returns:      N/A
   //
   //**************************************************************
   public static void main(String[] args) {

      // declare variables here
      double mealCost = 44.50;
      double taxAmount = mealCost * .0825;
      double tipAmount = (mealCost + taxAmount) * .15;
      double totalAmount = mealCost + taxAmount + tipAmount;


      developerInfo();

      // Enter more statements here

      System.out.println("Meal cost:            " + mealCost);
      System.out.println("Tax Amount(8.25%):    " + taxAmount);
      System.out.println("Tip Amount(15%):      " + tipAmount);
      System.out.println("Total Amount:         " + totalAmount);
   }

   //***************************************************************
   //
   //  Method:       developerInfo
   //
   //  Description:  The developer information method of the program
   //
   //  Parameters:   None
   //
   //  Returns:      N/A
   //
   //**************************************************************
   public static void developerInfo()
   {
      System.out.println("Name: Glen Medford");
      System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
      System.out.println("Program: Two \n");

   }  // End of developerInfo
}

