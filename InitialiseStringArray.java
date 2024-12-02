public class InitialiseStringArray {
  public static void main(String[] args) {
    // Declare and populate an array
    String[] shoppingList = 
    {
      "Coke","Mint icecream","Chocolate",
        "Pizza","Chips","Burgers",
        "Muffins","Milk"
    };

    //Edit the last item in the list
    //replace "Milk" with "Cake"
    
    
    //Output the shopping list 
    for (String item : shoppingList)
    {
        System.out.println(item);
    } //end for loop

    //Output the first character 
    //of each string in the list
    //on the same line
    //separated by a space
    for (int i=0; i<shoppingList.length;i++)
    {
        System.out.print(
                shoppingList[i].charAt(0)+ " ");
    } //end for

    System.out.println("\n");

    
    //Output the second last character 
    //of each string in the list
    //on the same line

    //For each item in the list
    for (int i=0; i<shoppingList.length;i++)
    {
        //Output the second last character 
        //of the current list item
        System.out.print(shoppingList[i]
                .charAt(shoppingList[i].length()-2));
    } //end for


    
    //Output each item in the list
    //that has 4 or more characters
    //on a separate line


     
    //Find and output the index position of 
    //"Chips" in the array


    //Count the number of list items
    //that end with the letter 's'
    
    
  } //end main

} //end class
