import java.util.Scanner;

public class FunctionVersionOfArrayLabTest {
  public static void main(String[] args) {
    //Declare an instance of the Scanner class
    Scanner scanner = new Scanner(System.in);

    // Initialize variables
    int arraySize = 10; // You can change the size as needed

    //Declare an array to store the string input
    String[] inputArray = new String[arraySize];
    int count = 0;   //index for array
    String str = ""; //process current string in array
    String result= "";  //store result to be outputted

    // Data entry using a while loop
    while (true) {
      System.out.print("Enter String " + count + ": ");
      String input = scanner.nextLine();

      if (input.equals("end")) {
         break;
      } //end if

      //add string to array
      inputArray[count] = input;
      count++;  //update array index
    } //end while

            
    // Search for and output strings with second and 
    // second last characters being the same
    System.out.print("The Strings with second and second last chars being the same are ");

    //Process all the Strings stored in the array
    for (int i = 0; i < count - 1; i++) {

      str = inputArray[i];  //store current string

       //if both second and second last chars
      //of the current string match
      if (compare(str))   //compare(inputArray[i])}
      {
        result = result + str + " ";  //add string to results list
      }
      

    } //end for

    //Output result to console
     System.out.print("'" + result + "' ");

    scanner.close();
  } //end main

  // *************************************

  
  public static boolean compare(String str)
  {
    //Compare the second and second last
    //characters in the parameter variable
    //and determine if they are the same 

    //Assume the characters are not the same
    //until we determine otherwise 
    boolean match = false;
    
    //check length criteria
    if (str.length() >= 4) {

      //check character criteria
      char secondChar = str.charAt(1);
      char secondLastChar = str.charAt(str.length() - 2);

      if (secondChar == secondLastChar)
      {  
         match = true;
      } //end if
      else{
         match = false;
      }

    } //end if 

    //return the result of the comparison
    return match;
    
  }

  // *********************************
  
} //end class
