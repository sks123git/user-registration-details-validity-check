import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidatorTest {
@Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
    Pattern pattern=Pattern.compile("([A-Z][a-z]{2,})");
    Matcher matcherFirstName=pattern.matcher("Shubham");
    boolean matchFirstName=matcherFirstName.matches();
    Assert.assertEquals(true,matchFirstName);
}
@Test
public void givenLastName_WhenProper_ShouldReturnTrue() {
    Pattern pattern = Pattern.compile("([A-Z][a-z]{2,})");
    Matcher matcherLastName = pattern.matcher("Singh");
    boolean matchLastName = matcherLastName.matches();
    Assert.assertEquals(true, matchLastName);
}
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        Pattern pattern=Pattern.compile("([a-zA-Z0-9\\.]+@[a-z]+\\.[a-z]{2,3}+([\\.][a-z]{2})?)");
        Matcher matcher=pattern.matcher("queyo@qwe.com");
        boolean matchEmail=matcher.matches();
        Assert.assertEquals(true, matchEmail);
    }
    @Test
    public void givenMobileNo_WhenProper_ShouldReturnTrue() {
        Pattern pattern=Pattern.compile("([0-9]{2}+\\s[0-9]{10})");
        Matcher matcher=pattern.matcher("91 9103838275");
        boolean matchMobileNumber=matcher.matches();
        Assert.assertEquals(true, matchMobileNumber);
    }
}