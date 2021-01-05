package userRegistration;
import org.junit.Assert;
import org.junit.Test;

public class TestingUserRegException {

    @Test
    public void testUserFirstName_whenValid_ShouldReturnSuccess() {
        UserRegistrationException userRegistration = new UserRegistrationException();
        String isFNameValid = null;
        try {
            isFNameValid = userRegistration.checkFName("James");
        }
        catch (InvalidDetailExceptions e){
            Assert.assertEquals("Success", isFNameValid);
        }

    }

    @Test
    public void testFirstName_WhenValueIsInvalid_shouldReturnException() {
    	UserRegistrationException userRegistration = new UserRegistrationException();
        String isFNameValid = null;
        try {
            userRegistration.checkFName("james");
        }
        catch (InvalidDetailExceptions e){
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }

    @Test
    public void testFirstName_WhenPassNullValue_shouldNullValueException() {
    	UserRegistrationException userRegistration = new UserRegistrationException();
        String isFNameValid = null;
        try {
            userRegistration.checkFName(null);
        }
        catch (InvalidDetailExceptions e){
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void testLastName_WhenValueIsValid_ShouldReturnSuccess() {
    	UserRegistrationException userRegistration = new UserRegistrationException();
        String islNameValid = null;
        try {
            islNameValid = userRegistration.checkLName("Bond");
        }
        catch (InvalidDetailExceptions e){
            Assert.assertEquals("Success" , islNameValid);
        }
    }

    @Test
    public void testLastName_WhenValueIsInvalid_ShouldThrowInvalidException(){
    	UserRegistrationException userRegistration = new UserRegistrationException();
        try {
            userRegistration.checkLName("bond");
        }
        catch (InvalidDetailExceptions e){
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }

    @Test
    public void testLastName_WhenValueIsNull_ShouldThrowNullPointerException(){
    	UserRegistrationException userRegistration = new UserRegistrationException();
        try {
            userRegistration.checkLName(null);
        }
        catch (InvalidDetailExceptions e){
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void testEmailId_WhenValueIsValid_ShouldReturnSuccess(){
    	UserRegistrationException userRegistration = new UserRegistrationException();
        String isEmailValid = null;
        try {
            isEmailValid = userRegistration.checkEmail("jamesbond007@gmail.com");
        }
        catch (InvalidDetailExceptions e)
        {
            Assert.assertEquals("Success", isEmailValid);
        }
    }

    @Test
    public void testEmailId_WhenValueIsInvalid_ShouldThrowInvalidDetailException() {
    	UserRegistrationException userRegistration = new UserRegistrationException();
        try {
            userRegistration.checkEmail("james.@.com");
        }
        catch (InvalidDetailExceptions e) {
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }

    @Test
    public void testEmailId_WhenValueIsNull_ShouldThrowNullPointerException() {
    	UserRegistrationException userRegistration = new UserRegistrationException();
        try {
            userRegistration.checkEmail(null);
        }
        catch (InvalidDetailExceptions e) {
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void testMobileNum_WhenValueIsValid_ShouldReturnSuccess() {
    	UserRegistrationException userRegistration = new UserRegistrationException();
        String isPhoneValid = null;
        try {
            isPhoneValid = userRegistration.checkPhoneNumber("91 7979898999");
        }
        catch (InvalidDetailExceptions e) {
            Assert.assertEquals("Success", isPhoneValid);
        }
    }

    @Test
    public void testMobileNum_WhenValueIsInvalid_ShouldInvalidDetailException() {
    	UserRegistrationException userRegistration = new UserRegistrationException();
        try {
            userRegistration.checkPhoneNumber("7979898999");
        }
        catch (InvalidDetailExceptions e) {
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }

    @Test
    public void testMobileNum_WhenPassedNullValue_ShouldThrowNullPointerException() {
    	UserRegistrationException userRegistration = new UserRegistrationException();
        try {
            userRegistration.checkPhoneNumber(null);
        }
        catch (InvalidDetailExceptions e) {
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void testPassword_WhenSatisfyRule2_ShouldReturnSuccess() {
    	UserRegistrationException userRegistration = new UserRegistrationException();
        String isValidPassword = null;
        try {
            isValidPassword = userRegistration.checkPassword("Qwer@0321");
        }
        catch (InvalidDetailExceptions e){
            Assert.assertEquals("Success", isValidPassword);
        }
    }

    @Test
    public void testPassword_WhenNotSatisfyRule2_ShouldThrowInvalidPassException() {
    	UserRegistrationException userRegistration = new UserRegistrationException();
        try {
            userRegistration.checkPassword("qwer");
        }
        catch (InvalidDetailExceptions e){
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }


    @Test
    public void testPassword_WhenPassedNullValue_ShouldThrowNullPointerException() {
    	UserRegistrationException userRegistration = new UserRegistrationException();
        try {
            userRegistration.checkPassword(null);
        }
        catch (InvalidDetailExceptions e){
            Assert.assertEquals(InvalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void mood_Analyser_Test_Happy() {
    	UserRegistrationException userRegistration = new UserRegistrationException();
        String isMoodHappy = null;
        try {
            isMoodHappy = userRegistration.moodAnalyse("James", "Bond", "91 7979898999", "jamesbond007@gmail.com", "Qwer@0321");
        }
        catch (InvalidDetailExceptions e) {
            Assert.assertEquals("HAPPY", isMoodHappy);
        }
    }

    @Test
    public void mood_Analyser_Test_Sad() {
    	UserRegistrationException userRegistration = new UserRegistrationException();
        String isMoodSad = null;
        try {
            isMoodSad = userRegistration.moodAnalyse("james", "bond", "7979898999", "007james.@.com", "qwer*123");
        }
        catch (InvalidDetailExceptions e) {
            Assert.assertEquals("SAD", isMoodSad);
        }
    }
}
