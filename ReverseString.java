public class ReverseString {
    // Create a StringBuilder object
    public static void main(String[] args) {
        // The string to be reversed
        String originalString = "Hello, World!";
        System.out.println("Original String: " + originalString);
        // The reversed string
        String reversedString = new StringBuilder(originalString).reverse().toString();
        // Print the reversed string
        System.out.println("Reversed String: " + reversedString);
    }
}

