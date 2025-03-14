public class MaxDigitStringFinder {
    public static void main(String[] args) {
        String[] inputArray = {"Hello123", "Test4567", "World12345", "NoDigitsHere", "Another1234"};
        
        String result = findStringWithMostDigits(inputArray);
        System.out.println("String with most digits: " + result);
    }

    // Function to find the string with the most digits
    public static String findStringWithMostDigits(String[] arr) {
        String maxDigitString = "";
        int maxDigitCount = 0;

        for (String str : arr) {
            int digitCount = countDigits(str);
            if (digitCount > maxDigitCount) {
                maxDigitCount = digitCount;
                maxDigitString = str;
            }
        }

        return maxDigitString;
    }

    // Function to count digits in a string
    public static int countDigits(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        return count;
    }
}
