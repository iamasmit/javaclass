import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserBirthdayComparison {
    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter birthdays for two persons
        LocalDate person1Birthday = getUserBirthday(scanner, "Enter Person 1's birthday (YYYY-MM-DD): ");
        LocalDate person2Birthday = getUserBirthday(scanner, "Enter Person 2's birthday (YYYY-MM-DD): ");

        // Compare birthdays
        int comparisonResult = person1Birthday.compareTo(person2Birthday);

        // Display results
        System.out.println("Person 1 Birthday: " + formatDate(person1Birthday));
        System.out.println("Person 2 Birthday: " + formatDate(person2Birthday));

        if (comparisonResult == 0) {
            System.out.println("Both persons have the same birthday!");
        } else if (comparisonResult < 0) {
            System.out.println("Person 1's birthday is earlier than Person 2's birthday.");
        } else {
            System.out.println("Person 1's birthday is later than Person 2's birthday.");
        }

        // Close the Scanner
        scanner.close();
    }

    // Prompt user to enter a valid date
    private static LocalDate getUserBirthday(Scanner scanner, String prompt) {
        LocalDate birthday = null;

        while (birthday == null) {
            System.out.print(prompt);
            String input = scanner.nextLine();

            try {
                birthday = LocalDate.parse(input);
            } catch (Exception e) {
                System.out.println("Invalid date format. Please enter the date in YYYY-MM-DD format.");
            }
        }

        return birthday;
    }

    // Format date in "MM/dd/yy" format
    private static String formatDate(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("MM/dd/yy"));
    }
}
