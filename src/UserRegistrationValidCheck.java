import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationValidCheck {

    public void getFirstName(){
        UserRegistrationValidCheck user=new UserRegistrationValidCheck();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first name");
        UserDetails userDetails=new UserDetails(scanner.nextLine());
        Pattern pattern=Pattern.compile("([A-Z][a-z]{2,})");
        Matcher matcher=pattern.matcher(userDetails.firstName);
        boolean m=matcher.matches();
        if(!m) {
            System.out.println("Please enter 1st letter in caps and min 3 letters");
            user.getFirstName();
        }
    }



    public static void main(String[] args) {
        UserRegistrationValidCheck user=new UserRegistrationValidCheck();
        user.getFirstName();
    }
}