public class DigitCounter {
    public static void main(String[] args) {
        String input = "Hello1234World567";
        int digitCount = countDigits(input);
        System.out.println("Number of digits: " + digitCount);
    }

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
