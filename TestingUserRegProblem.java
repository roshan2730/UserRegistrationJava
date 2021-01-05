package userRegistration;

import org.junit.Assert;
import org.junit.Test;

public class TestingUserRegProblem {
    @Test
    public void testingFirstName() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isFNameValid = userRegistration.checkFName("Francis");
        Assert.assertTrue(isFNameValid);
    }

    @Test
    public void testFirstNameInvalidMustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isFnameValid = userRegistration.checkFName("francis");
        Assert.assertFalse(isFnameValid);
    }

    @Test
    public void testLastNameValidMustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isLnameValid = userRegistration.Lname("Kumar");
        Assert.assertTrue(isLnameValid);
    }
    @Test
    public void testLastNameValidMustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isLnameINValid = userRegistration.Lname("kumar");
        Assert.assertFalse(isLnameINValid);
    }

    @Test
    public void testEmailId_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isEmailValid = userRegistration.checkEmail("bond007.james@gmail.com");
        Assert.assertTrue(isEmailValid);
    }
    @Test
    public void testEmailId_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isEmailInvalid = userRegistration.checkEmail("jamesm@.com");
        Assert.assertFalse(isEmailInvalid);
    }

    @Test
    public void testPhoneNumber_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPhoneNumberValid = userRegistration.checkPhoneNum("91 7979464646");
        Assert.assertTrue(isPhoneNumberValid);
    }
    @Test
    public void testPhoneNumber_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPhoneNumberInValid = userRegistration.checkPhoneNum("7979464646");
        Assert.assertFalse(isPhoneNumberInValid);
    }

    @Test
    public void testPassword_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPasswordValid = userRegistration.checkPassword("Abc@123gjyg");
        Assert.assertTrue(isPasswordValid);
    }
    @Test
    public void testPassword_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPasswordInValid = userRegistration.checkPassword("abcdefg");
        Assert.assertFalse(isPasswordInValid);
    }

    @Test
    public void mood_Analyser_Test_Happy() {
        UserRegistration userRegistration = new UserRegistration();
        String isMoodHappy = userRegistration.moodAnalyzer("Francis", "Kumar", "91 7979464646", "bond007.james@gmail.com", "2103@James");
        Assert.assertEquals("HAPPY", isMoodHappy);
    }

    @Test
    public void mood_Analyser_Test_Sad() {
        UserRegistration userRegistration = new UserRegistration();
        String isMoodSad = userRegistration.moodAnalyzer("francis", "kumar", "7979464646", "bond007@.com", "799235");
        Assert.assertEquals("SAD", isMoodSad);
    }
}

