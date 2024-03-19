package day18_practices;

public class Contact {

    public String name, email;
    public int areCode;
    public long phoneNumber;

    public void setInfo(String name, String email, int areCode, long phoneNumber) {
        this.name = name;
        this.email = email;
        this.areCode = areCode;
        this.phoneNumber = phoneNumber;
    }

    public void Call() {
        System.out.println("Calling to " + name + " now");
    }

    public void sendMessage(){
        System.out.println("Sending a message to " + areCode + phoneNumber + " now");
    }

    public void sendEmail(){
        System.out.println("Sending email to " + email + " now");
    }


}

/*
Create a custom class named Contact
		Attributes:
			name
			phoneNumber
			email

		Action:
			setInfo(): sets all the fields
			call(): displays the message "Calling $name now"
			sendMessage(): displays the message "sending a message to $phoneNumber now"
			sendEmail(): displays the message "sending email to $email now"

 */
