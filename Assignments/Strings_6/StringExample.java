package Strings_6;

public class StringExample {
    public static void main(StringExample[] args) {

// 1. Different ways creating a string
        String str1 = "Hello, World"; // Using string literal
        String str2 = new String("Hello, World"); // Using the String constructor
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray); // From a character array


//        2. Concatenating two strings using + operator
        String str4 = "Hello";
        String str5 = "World";
        String result = str4 + ", " + str5; // Concatenation using the + operator
        System.out.println(result);


//        3. Finding the length of the string
        String str = "This is a sample string";
        int length = str.length();
        System.out.println("Length of the string: " + length);


//        4. Extract a string using Substring
        String str6 = "Hello, World";
        String substring = str6.substring(7); // Extract from index 7 to the end
        System.out.println("Substring: " + substring);


//        5. Searching in strings using indexOf()
        String str7 = "Hello, World";
        int index = str7.indexOf("World");
        System.out.println("Index of 'World': " + index);


//        6. Matching a String Against a Regular Expression With matches()
        String str8 = "12345";
        boolean isMatch = str8.matches("\\d+"); // Checks if the string contains only digits
        System.out.println("Is it a number? " + isMatch);


//        7. Comparing strings using the methods equals(),
        String str9 = "apple";
        String str10 = "Apple";

        boolean isEqual = str9.equals(str10); // Case-sensitive comparison

//        8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
        boolean isEqualIgnoreCase = str9.equalsIgnoreCase(str10); // Case-insensitive comparison
        boolean startsWith = str9.startsWith("app"); // Check if it starts with "app"
        boolean endsWith = str9.endsWith("le"); // Check if it ends with "le"
        int compareResult = str9.compareTo(str10); // Lexicographic comparison
        System.out.println("Equals: " + isEqual);

        System.out.println("EqualsIgnoreCase: " + isEqualIgnoreCase);
        System.out.println("StartsWith: " + startsWith);
        System.out.println("EndsWith: " + endsWith);
        System.out.println("CompareTo: " + compareResult);



//        9. Trimming strings with trim()
        String str11 = "   Trim me!   ";
        String trimmed = str11.trim();
        System.out.println("Trimmed: " + trimmed);


//        10. Replacing characters in strings with replace()
        String str12 = "Replace spaces with underscores";
        String replaced = str12.replace(" ", "_");
        System.out.println("Replaced: " + replaced);


//        11. Splitting strings with split()
        String str13 = "one, two, three";
        String[] parts = str13.split(", ");
        for (String part : parts) {
            System.out.println(part);
        }


//        12. Converting Numbers to Strings with valueOf()
        int number = 42;
        String str14 = String.valueOf(number);
        System.out.println("Converted Number: " + str14);


//        13. Converting integer objects to Strings
        Integer numObj = 42;
        String str15 = numObj.toString();
        System.out.println("Converted Integer Object: " + str15);


//        14. Converting to uppercase and lowercase
        String str16 = "Hello, World";
        String upper = str16.toUpperCase();
        String lower = str16.toLowerCase();
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);


    }
}
