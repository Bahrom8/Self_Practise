package day28_practices;

public class Credentials {

    private String username, password;

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(!isStrongPassword(password)){
            System.err.println("Password is not a strong password");
            System.exit(1);
        }
        this.password = password;
    }

    public boolean isStrongPassword(String password) {
        boolean step1 = password.length() >= 8 && !password.contains(" ");
        boolean step2 = false;  // has an Upper case letter
        boolean step3 = false;  // has a lower case letter
        boolean step4 = false;  // has Digit
        boolean step5 = false; // has Special Character

        for (char each : password.toCharArray()) {

            if (Character.isUpperCase(each)) {
                step2 = true;
            } else if (Character.isLowerCase(each)) {
                step3 = true;
            } else if (Character.isDigit(each)) {
                step4 = true;
            } else {
                step5 = true;
            }

        }

        return step1 && step2 && step3 && step4 && step5;
    }

    public String toString() {
        return "\n\tCredentials" +
                "\nusername: " + getUsername() +
                "\npassword: " + getPassword();
    }

    public static void main(String[] args) {

        Credentials login = new Credentials("Cydeo", "WoodenSpoon2022@");
        System.out.println(login);

    }




}
/*
Create a class named Credentials
            Variables:
                username, password

            Encapsulate all the fields.
                    (The password MUST be a strong password)


            Add a constructor that allows the user to set all the fields when the object is created.
                        (If the arguments are not valid, it should not be set to the instances)

            Methods:
                isStrongPassWord(): takes an argument of string and verifies if the given string is a
                strong password, returns boolean
                            Characteristics of strong passwords are:
                                    1. The password MUST be at least eight characters long and should not contain space
                                    2. The password should at least contain one letter
                                    3. The password should at least contain one special character
                                    4. The password should at least contain a digit

                toString()
 */
