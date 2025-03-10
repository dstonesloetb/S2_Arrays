package com.mycompany.s2arrayexamples;

/**
 * Insert Program Header 
 * Program Name:  xyz
 * Purpose:
 * Student Name: Darren Stones
 * Student Number: 
 * Date:
 */
public class ApproachToLabTest {

    public static void main(String[] args) {
        // Write a program which allows the user to
        //keep entering strings until they enter the string 
        //“end” into an array of strings.
        
        //Create an array to store the input 
        //from the user
        
        String[] input = {
            "this", "essential", "material",
            "issa", "comprehensive","end"
        };
        
        final int MAX_SIZE = 10;
        
        String[] userInput = new String[MAX_SIZE];
        
        

        //Create a results variable
        String result = "";
        
        //Data Entry - while loop
        //keep looping while the input does
        //not equal to "end" 
        
            //Ask the user to input a string 
            //store the string in your array 
            //track the number of inputs 
                    
        //For loop to process the array 
            
        //It then searches through the array and outputs 
        //to the screen the strings with their second 
        //and second last characters being the same. 
        //ensuring that the string is a min of length 4
        
        
        //If there is more than one, then your program should
        //output all of them in one concatenated 
        //string, with each one separated by a space.
        
        //Note – the last word “end” should be ignored when
        //you are searching. The program will be 
        //tested with words that are a minimum of 4 characters in length. 
        
        //Output the result
        System.out.print(result);
        
    } //end main
    
} //end class 
