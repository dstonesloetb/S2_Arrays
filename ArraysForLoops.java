class ArraysForLoops {
  public static void main(String[] args) {
    // Declare and initialise a 
    //variable array to store some cars
    String[] myCars = {"Volvo", "Opel", "Mazda"};
        
    //Changing a value in the array
    //Change the Opel to Toyota
    myCars[1] = "Toyota";
                
    //Display the length of list
    System.out.println("Length of Array: "+myCars.length); 
    System.out.println("");
        
        //Display the contents of the list 
//        System.out.println(myCars[0]);
//        System.out.println(myCars[1]);
//        System.out.println(myCars[2]);
        
    //Use a traditional for loop to display the 
    //contents of the array 
    for(int i=0; i<myCars.length; i++)
    {
      System.out.println(myCars[i]);
    } //end for 
          
    System.out.println("");
          
    //Use an for-each loop to display the list
    for (String car : myCars) {
      System.out.println(car);
    }   

  } //end main
    
} //end class 
