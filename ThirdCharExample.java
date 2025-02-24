package com.mycompany.arrayexamples;

public class ThirdCharExample {

    public static void main(String[] args) {
     
        //Declare a String array
        String[] inputs = 
        {
          "Portlaoise", " is", " a",
            " wonderful", " metropolis."
        };
        
        //Output the string array all on the one line
        for (String word : inputs)
        {
            System.out.print(word);
        }
        
        //Create a results string
        String result="";
        
        //Look at each string in 
        //the array one by one 
        for (int i=0; i<inputs.length;i++)
        {
            if (inputs[i].length()>=3){
                //append the third
                //character from the current
                //string to the results variable
                result += inputs[i].charAt(2);
            } //end if
            
        } //end result
        
        //Output the result
        System.out.println("\n"+result);
        
        
        
    } //end main 
    
} //end class 
