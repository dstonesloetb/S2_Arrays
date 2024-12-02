import java.util.Scanner;

// FirstLastCharMatch Example

public class SampleLab2V1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Data entry loop to populate the array
    String[] strings = new String[100]; // Assuming max 100 strings
    int count = 0;
    String input;
    while (true) {
      System.out.print("Enter String " + count + ": ");
      input = scanner.nextLine();
      if (input.equals("end")) {
        break;
      }
      strings[count] = input;
      count++;
    } //end while 

    // Search for the last string with first and last characters being the same
    String result = null;
    int index = -1;
    for (int i = 0; i < count; i++) {
      if (strings[i].charAt(0) == strings[i].charAt(strings[i].length() - 1)) {
        result = strings[i];
        index = i;
      } //end if
    } //end for

    // Output the result
    if (result != null) {
      System.out.println("The last string with first and last chars the same is \"" + result + "\" and is at index position " + index);
    } else 
    {
      System.out.println("No words with their first and last characters the same.");
    }
    
  } //end main
} //end class
