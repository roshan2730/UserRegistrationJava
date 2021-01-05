import java.util.Scanner;

public class UserRegistration {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UserRegistration obj = new UserRegistration();
        if(obj.checkFirstName() == true) {
            System.out.println("Entered name is in correct format");
        } else {
            System.out.println("Enter valid name");
        }
    }

    public boolean checkFirstName() {
        System.out.println("Enter the name");
        String firstName = sc.next();
        if(firstName.matches( "[A-Z][a-z]*" ) == true){
            return true;
        }
        else {
            return false;
        }
    }
}
