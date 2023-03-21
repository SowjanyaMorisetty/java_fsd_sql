package employeedetails;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmpDetailsValidation {
	
	private String name;
    private String phoneNumber;
    private String emailAddress;
    private String address;
    private String location;

    public EmpDetailsValidation(String name, String phoneNumber, String emailAddress, String address, String location)
            throws InvalidDetails {
        this.name = name;

        if (!validatePhoneNumber(phoneNumber)) {
            throw new InvalidDetails("Invalid phone number format");
        }
        this.phoneNumber = phoneNumber;

        if (!validateEmailAddress(emailAddress)) {
            throw new InvalidDetails("Invalid email address format");
        }
        this.emailAddress = emailAddress;

        if (!validateAddress(address)) {
            throw new InvalidDetails("Invalid address format");
        }
        this.address = address;

        if (!validateLocation(location)) {
            throw new InvalidDetails("Invalid location format");
        }
        this.location = location;
    }
    
    

    
    public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getPhoneNumber() {
		return phoneNumber;
	}




	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}




	public String getEmailAddress() {
		return emailAddress;
	}




	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getLocation() {
		return location;
	}




	public void setLocation(String location) {
		this.location = location;
	}




	private boolean validatePhoneNumber(String phoneNumber) {
        
        return phoneNumber != null && phoneNumber.length() == 10 && phoneNumber.matches("\\d+");
    }

    private boolean validateEmailAddress(String emailAddress) {
       
        return emailAddress != null && emailAddress.contains("@");
    }

    private boolean validateAddress(String address) {
       
        return address != null && !address.trim().isEmpty();
    }

    private boolean validateLocation(String location) {
       
        return location != null && !location.trim().isEmpty();
    }
    
   
}




