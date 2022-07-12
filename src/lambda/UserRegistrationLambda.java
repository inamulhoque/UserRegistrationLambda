package lambda;

import java.util.regex.Pattern;

public class UserRegistrationLambda {
    public void firstNameValid(String fname){
        Validation first_name = (String name) -> {
            Pattern pattern = Pattern.compile("[A-Z][a-z]{2,}");
            pattern.matcher(name);
        };
        first_name.userValidation(fname);
    }
    public void lastNameValid(String lname){
        Validation last_name = (String name) -> {
            Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
            pattern.matcher(name);
        };
        last_name.userValidation(lname);
    }
    public void E_Mail(String mail){
        Validation email = (String name) -> {
            Pattern pattern = Pattern.compile("^[a-z\\d+_.-]+@[a-z\\d.-]+$");
            pattern.matcher(name);
        };
        email.userValidation(mail);
    }
    public void mobileValid(String mobile_no){
        Validation  phone = (String name) -> {
            Pattern pattern = Pattern.compile("[+91]+[\\d]{10}$");
        };
    }
}
