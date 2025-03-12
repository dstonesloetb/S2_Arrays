public class StringDigitCheck {

    // Function to check if the last character of the string is a digit
    public static boolean endsWithDigit(String str) {
        // Check if the string is not empty and the last character is a digit
        return str.length() > 0 && Character.isDigit(str.charAt(str.length() - 1));
    }

    public static void main(String[] args) {
        // Create an array of strings
        String[] stringArray = {
            "apple123",
            "banana",
            "grape456",
            "cherry",
            "mango789"
        };

        // Output the result
        System.out.println("Strings that end with a digit:");

        // Loop through each string in the array and check if it ends with a digit
        for (String str : stringArray) {
            if (endsWithDigit(str)) {
                System.out.println(str);
            }
        }
    }
}
