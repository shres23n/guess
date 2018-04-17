/*
 * A program to exercise "Guess My Number" game.
 * Homework 2
 * Exercise 3.4
 * 
 * Author: Nista Shrestha
 * Date: 2/13/2018
 */

//Importing Scanner and Random class from java library
import java.util.Scanner;
import java.util.Random;

public class Guess{
  public static void main(String[] args){
    
    System.out.println ("I'm thinking of a number between 1 and 100\n(including both). Can you guess what it is?");
    
    Scanner enterIp = new Scanner(System.in); //Creating a new scanner that takes in new input   
    
    System.out.println("Type a number: "); //Ask user to input data
    int guessNum = enterIp.nextInt(); //Reads the input and stores in a "guessNum" variable
    
    System.out.println("Your guess is: " + guessNum);
    
    Random ranNum = new Random(); //Using a new random operator to generate random number 
    int number = ranNum.nextInt(100)+1; //generating a random number between 1 and 100 and storing in variable "number"
    
    System.out.println("The number I was thinking of is: " + number);
    
    int offBy = Math.abs(guessNum - number); //Using Math class to generate absolute difference between guess and random number
    System.out.println ("You were off by: " + offBy);             
  }
}
