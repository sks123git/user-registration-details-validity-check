import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationValidCheck {
    public void getFirstName(){
        UserRegistrationValidCheck user=new UserRegistrationValidCheck();
        UserDetails userDetails=new UserDetails();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first name");
        userDetails.setFirstName(scanner.nextLine());
        Pattern pattern=Pattern.compile("([A-Z][a-z]{2,})");
        Matcher matcherFirstName=pattern.matcher(userDetails.getFirstName());
        boolean matchFirstName=matcherFirstName.matches();
        Matcher matcherLastName=pattern.matcher(userDetails.getLastName());
        boolean matchLastName=matcherLastName.matches();
        if(!matchFirstName) {
            System.out.println("Please enter 1st letter in caps and min 3 letters");
            user.getFirstName();
        }
    }
    public void getLastName(){
        UserRegistrationValidCheck user=new UserRegistrationValidCheck();
        UserDetails userDetails=new UserDetails();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Last name");
        userDetails.setLastName(scanner.nextLine());
        Pattern pattern=Pattern.compile("([A-Z][a-z]{2,})");
        Matcher matcherFirstName=pattern.matcher(userDetails.getFirstName());
        boolean matchFirstName=matcherFirstName.matches();
        Matcher matcherLastName=pattern.matcher(userDetails.getLastName());
        boolean matchLastName=matcherLastName.matches();
        if(!matchLastName) {
            System.out.println("Please enter 1st letter in caps and min 3 letters");
            user.getLastName();
        }
    }
    public void getEmailAddress(){
        UserRegistrationValidCheck user=new UserRegistrationValidCheck();
        UserDetails userDetails=new UserDetails();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the email id");
        userDetails.setEmailAddress(scanner.nextLine());
        Pattern pattern=Pattern.compile("([a-zA-Z0-9\\.]+@[a-z]+\\.[a-z]{2,3}+([\\.][a-z]{2})?)");
        Matcher matcher=pattern.matcher(userDetails.getEmailAddress());
        boolean matchEmail=matcher.matches();
        if(!matchEmail) {
            System.out.println("Please enter correct email id");
            user.getEmailAddress();
        }
    }
    public void getMobileNumber(){
        UserRegistrationValidCheck user=new UserRegistrationValidCheck();
        UserDetails userDetails=new UserDetails();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the mobile number");
        userDetails.setMobileNo(scanner.nextLine());
        Pattern pattern=Pattern.compile("([0-9]{2}+\\s[0-9]{10})");
        Matcher matcher=pattern.matcher(userDetails.getMobileNo());
        boolean matchMobileNumber=matcher.matches();
        if(!matchMobileNumber) {
            System.out.println("Please enter correct mobile no");
            user.getMobileNumber();
        }
    }
    public void getPassword(){
        UserRegistrationValidCheck user=new UserRegistrationValidCheck();
        UserDetails userDetails=new UserDetails();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Password");
        userDetails.setPassword(scanner.nextLine());
        Pattern pattern=Pattern.compile("((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&+!=]*[@#$%^&+!=][^@#$%^&+!=]*$)).{8,}");
        Matcher matcher=pattern.matcher(userDetails.getPassword());
        boolean matchPassword=matcher.matches();
        if(!matchPassword) {
            System.out.println("Please enter correct minimum 8 characters, 1 uppercase and 1 numeric");
            user.getPassword();
        }
    }

    public static void main(String[] args) {
        UserRegistrationValidCheck user = new UserRegistrationValidCheck();
        user.getFirstName();
        user.getLastName();
        user.getEmailAddress();
        user.getMobileNumber();
        user.getPassword();
    }
}