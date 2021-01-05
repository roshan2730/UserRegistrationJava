package userRegistration;

public class UserRegistration {
    public boolean checkFName(String fName) {
        return (fName.matches("[A-Z][a-z]{3,}"));

    }

    public boolean Lname(String Lname) {
        return (Lname.matches("[A-Z][a-z]{3,}"));
    }

    public boolean checkEmail(String emailID) {
        return (emailID.matches("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$"));
    }

    public boolean checkPhoneNum(String phoneNum) {
        return (phoneNum.matches("^[0-9]{1,2}[ ][0-9]{10}$"));
    }

    public boolean checkPassword(String password) {
        return  (password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:'<>,.>/~`_+=|].).{8,}$"));
    }

    public String moodAnalyzer(String fName, String Lname, String phoneNum, String emailID, String password) {
        if(checkFName(fName) == true && Lname(Lname) == true && checkEmail(emailID) == true && checkPhoneNum(phoneNum) == true && checkPassword(password) == true){
            return "HAPPY";
        }
        else {
            return "SAD";
        }
    }

}
