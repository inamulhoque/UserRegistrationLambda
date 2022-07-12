package lambda;

import org.testng.annotations.Test;

public class UserRegistrationLambdaTest {
    @Test
    public void testFirstName(){
        UserRegistrationLambda obj = new UserRegistrationLambda();
        obj.firstNameValid("Inamul");
    }
    @Test
    public void lastFirstName(){
        UserRegistrationLambda obj = new UserRegistrationLambda();
        obj.lastNameValid("Hoque");
    }
    @Test
    public void testE_Mail(){
        UserRegistrationLambda obj = new UserRegistrationLambda();
        obj.E_Mail("inam@gmail.com");
    }
    @Test
    public void testMobile(){
        UserRegistrationLambda obj = new UserRegistrationLambda();
        obj.mobileValid("+919101149275");
    }
    @Test
    public void testPassword(){
        UserRegistrationLambda obj = new UserRegistrationLambda();
        obj.passwordValid("Inam@123");
    }
}
