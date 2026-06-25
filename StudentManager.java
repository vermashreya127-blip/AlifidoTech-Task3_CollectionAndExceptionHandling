import java.util.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class StudentManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();
        HashSet<String> uniqueStudents = new HashSet<>();
        HashMap<String, Integer> studentAge = new HashMap<>();

        try {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Student Age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above.");
            }

            students.add(name);
            uniqueStudents.add(name);
            studentAge.put(name, age);

            System.out.println("\n--- Student Details ---");
            System.out.println("ArrayList: " + students);
            System.out.println("HashSet: " + uniqueStudents);
            System.out.println("HashMap: " + studentAge);

        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            sc.close();
        }
    }
}