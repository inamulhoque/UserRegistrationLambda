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
    public void E_Mail(){
        UserRegistrationLambda obj = new UserRegistrationLambda();
        obj.E_Mail("inam@gmail.com");
    }
}
