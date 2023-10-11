import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reegex {
    public static void main(String[] args) {
        // Sample input string
        String input = "Hello, my email is example@example.com and my phone number is 123-456-7890.";

        // Regular expression for matching email addresses
        String emailRegex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";

        // Regular expression for matching phone numbers
        String phoneRegex = "\\b\\d{3}-\\d{3}-\\d{4}\\b";

        // Create Pattern objects
        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);

        // Create Matcher objects
        Matcher emailMatcher = emailPattern.matcher(input);
        Matcher phoneMatcher = phonePattern.matcher(input);

        // Find and print email addresses
        while (emailMatcher.find()) {
            System.out.println("Email found: " + emailMatcher.group());
        }

        // Find and print phone numbers
        while (phoneMatcher.find()) {
            System.out.println("Phone number found: " + phoneMatcher.group());
        }
    }
}
