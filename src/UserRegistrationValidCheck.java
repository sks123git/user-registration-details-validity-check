import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationValidCheck {
    public void getFirstNameLastName(){
        UserRegistrationValidCheck user=new UserRegistrationValidCheck();
        UserDetails userDetails=new UserDetails();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first name");
        userDetails.setFirstName(scanner.nextLine());
        System.out.println("Enter the Last name");
        userDetails.setLastName(scanner.nextLine());
        Pattern pattern=Pattern.compile("([A-Z][a-z]{2,})");
        Matcher matcherFirstName=pattern.matcher(userDetails.getFirstName());
        boolean matchFirstName=matcherFirstName.matches();
        Matcher matcherLastName=pattern.matcher(userDetails.getLastName());
        boolean matchLastName=matcherLastName.matches();
        if(!matchFirstName || !matchLastName) {
            System.out.println("Please enter 1st letter in caps and min 3 letters");
            user.getFirstNameLastName();
        }
    }
    public void getEmailAddress(){
        UserRegistrationValidCheck user=new UserRegistrationValidCheck();
        UserDetails userDetails=new UserDetails();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Password");
        userDetails.setEmailAddress(scanner.nextLine());
        Pattern pattern=Pattern.compile("([a-zA-Z0-9\\.]+@[a-z]+\\.[a-z]{2,3}+([\\.][a-z]{2})?)");
        Matcher matcher=pattern.matcher(userDetails.getEmailAddress());
        boolean matchPassword=matcher.matches();
        if(!matchPassword) {
            System.out.println("Please enter correct password");
            user.getEmailAddress();
        }
    }
    public void getMobileNumber(){
        UserRegistrationValidCheck user=new UserRegistrationValidCheck();
        UserDetails userDetails=new UserDetails();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Password");
        userDetails.setMobileNo(scanner.nextLine());
        Pattern pattern=Pattern.compile("([0-9]{2}+\\s[0-9]{10})");
        Matcher matcher=pattern.matcher(userDetails.getMobileNo());
        boolean matchPassword=matcher.matches();
        if(!matchPassword) {
            System.out.println("Please enter correct mobile no");
            user.getMobileNumber();
        }
    }

    public static void main(String[] args) {
        UserRegistrationValidCheck user = new UserRegistrationValidCheck();
        user.getFirstNameLastName();
        user.getEmailAddress();
        user.getMobileNumber();
    }
}