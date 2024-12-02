public class InitialiserSolutions {
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
    //Length of the list is 8
    //Index goes from 0-7
    //shoppingList[7] is "Milk"
    shoppingList[shoppingList.length-1] = "Cake";



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

        System.out.println("\n");

    //Output each item in the list
    //that has 5 or more characters
    //on a separate line
        //For each item in the list
    for (int i=0; i<shoppingList.length;i++)
    {
        if(shoppingList[i].length()>=5)
        {
            System.out.println(shoppingList[i]);
        } //end if
    } //end for


    //Find and output the index position of 
    //"Chips" in the array
    for (int i=0; i<shoppingList.length;i++)
    {
        if(shoppingList[i].
                equalsIgnoreCase("Chips"))
        {
            //Ouput index value of "Chips"
            //Assume "Chips" is present
            System.out.println("Chips Found");
            System.out.println("Index :"+i);
        } //end if
    } //end for


    //count the number of
    //strings that end with an 's'
    int count =0;

    //Count the number of list items
    //that end with the letter 's'
    for (int i=0; i<shoppingList.length;i++)
    {
        if(shoppingList[i]
                .charAt(shoppingList[i].length()-1)=='s')
        {
            count++;
        } //end if

    } //end for

    System.out.println("Num of strings ending in an s: "+count);



  } //end main

} //end class
