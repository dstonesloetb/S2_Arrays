import java.util.Scanner;

// SampleWeek9Q1 Version 2


public class SampleSolutionV2 {

    public static void main(String[] args) {
        /*Skip data entry Version 1 
          and use placeholder array if need be

        //Declare a String array 
        String[] items = 
        {
           "this", "essential",
            "material","issa", 
            "comprehensive","end" 
        };

        */        


        //Declare an instance of the Scanner class
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        final int ARRAY_SIZE = 10; // You can change the size as needed

        //Declare an array to store the string input
        String[] items = new String[ARRAY_SIZE];
        int count = 0;   //index for array


        // Data entry using a while loop
        while (true) {
          System.out.print("Enter String " + count + ": ");
          String input = scanner.nextLine();

          if (input.equalsIgnoreCase("end")) {
             break;
          } //end if

          //add user inputted string to the array
          items[count] = input;
          count++;  //update array index
        } //end while

      /*
      //test code
      for (String input : items)
      {
        System.out.println(input);
      }
    */

        //process current string in array
        String str ="";


        //Store result
        String result=
        "The Strings with second and second last chars being the same are: ";;

        //search list for strings
        //whose second and second last characters are the same
        for (int i=0; i<count;i++)
        {
            str = items[i]; //store current array item

            //ignore "end" string
            //and check that string has at least 4 characters
            if (!str.equals("end") && str.length()>=4) {

                //check if second and second last chars are the same 
                if (    str.charAt(1)==
                        str.charAt(str.length()-2)){

                    //add to result string with
                    //space if there is a match
                   //could replace items[i] with str
                    result += items[i] + " ";   
                } //end if
            }//end if     
        } //end for

        //Output result
        System.out.println(result);

    } //end main

}//end class
