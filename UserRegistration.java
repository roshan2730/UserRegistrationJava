import java.util.Scanner;

public class UserRegistration {
    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        UserRegistration obj = new UserRegistration();
        if (obj.checkName() == true) {
            System.out.println("Entered name is in correct format");
        } else{
            System.out.println("PLEASE Enter  a valid name");
        }

    }
    public boolean checkName() {
        System.out.println("Enter the first name");
        String firstName = sc.next();
        System.out.println("Enter the last name");
        String lastName = sc.next();

        if (firstName.matches("[A-Z][a-z]{3,}" ) && (lastName.matches("[A-Z][a-z]{3,}") == true) == true)  {
            return true;
        }
        else {
            return false;
        }
    }
}
