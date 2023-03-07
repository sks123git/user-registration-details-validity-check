import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationValidCheck {
    public void getFirstName(){
        UserRegistrationValidCheck user=new UserRegistrationValidCheck();
        UserDetails userDetails=new UserDetails();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first name");
        userDetails.setFirstName(scanner.nextLine());
        // using lambda expression
        Predicate<String> isMatching = n ->{
            Pattern pattern=Pattern.compile("([A-Z][a-z]{2,})");
            Matcher matcherFirstName=pattern.matcher(n);
            return matcherFirstName.matches();
        };
        //Comparing
        if(!isMatching.test(userDetails.getFirstName())) {
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
        // using lambda expression
        Predicate<String> isMatching = n ->{
            Pattern pattern=Pattern.compile("([A-Z][a-z]{2,})");
            Matcher matcherLastName=pattern.matcher(n);
            return matcherLastName.matches();
        };
        //Comparing
        if(!isMatching.test(userDetails.getLastName())) {
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
        // using lambda expression
        Predicate<String> isMatching = n ->{
            Pattern pattern=Pattern.compile("([a-zA-Z0-9\\.]+@[a-z]+\\.[a-z]{2,3}+([\\.][a-z]{2})?)");
            Matcher matcher=pattern.matcher(n);
            return matcher.matches();
        };
        if(!isMatching.test(userDetails.getEmailAddress())) {
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
        // Using lambda expression
        Predicate<String> isMatching = n -> {
            Pattern pattern = Pattern.compile("([0-9]{2}+\\s[0-9]{10})");
            Matcher matcher = pattern.matcher(n);
            return matcher.matches();
        };
        if(!isMatching.test(userDetails.getMobileNo())) {
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
        // Using lambda expression
        Predicate<String> isMatching = n -> {
            Pattern pattern = Pattern.compile("((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&+!=]*[@#$%^&+!=][^@#$%^&+!=]*$)).{8,}");
            Matcher matcher = pattern.matcher(n);
            return matcher.matches();
        };
        if(!isMatching.test(userDetails.getPassword())) {
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