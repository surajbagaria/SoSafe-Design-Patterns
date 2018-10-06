package model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
	private static User user = null;

	public int userID;
	public String firstName;
    public String lastName;
    public String email;
    public String phoneNumber;
    public String password;
    public String confirmPassword;
    public String address;
    public String masterCode;



    public Service service;
    public Bill bill;
    private Sensor sensor;

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void setSensor(Sensor senor) {
        this.sensor = senor;
    }

    public Sensor getSensor() {
        return sensor;
    }

//    int serviceId;
//    private double totalCost;

	private User() {

	}
	public static User getInstance() {
		if (user == null) {
			user = new User();
		}
		return user;
	}

	public void setID(int iD){
		this.userID = iD;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public void setiPassword(String iPassword){
		this.password = iPassword;
	}

	public void setConfirmPassword(String confirmPassword){
		this.confirmPassword = confirmPassword;
	}

	public void setAddress(String address){
		this.address = address;
	}

//

	public void setMasterPassword(String masterPassword){
		this.masterCode = masterPassword;
	}

//	public void setAutoGeneratedResponseCode(String autoGeneratedResponseCode){
//		this.autoGeneratedResponseCode = autoGeneratedResponseCode;
//	}


//	public void setNoOfRooms(int noOfRooms) {
//		this.noOfRooms = noOfRooms;
//	}

	public int getiD(){return this.userID;}
	public String getFirstName(){return firstName;}
	public String getLastName(){return lastName;}
	public String getEmail(){return email;}
	public String getPhoneNumber(){return phoneNumber;}
	public String getiPassword(){return password;}
	public String getConfirmPassword(){return confirmPassword;}
	public String getAddress(){return address;}
	public String getMasterPassword(){return masterCode;}

// 	public String getAutoGeneratedResponseCode(){return this.autoGeneratedResponseCode;}


//	public int getNoOfRooms() {
//		return noOfRooms;
//	}

//	public double getTotalCost() {
//		return totalCost;
//	}

    //	public String makeMasterPassword() {
//		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
//		StringBuilder salt = new StringBuilder();
//		Random rnd = new Random();
//		while (salt.length() < 18) { // length of the random string.
//			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
//			salt.append(SALTCHARS.charAt(index));
//		}
//		String saltStr = salt.toString();
//		return saltStr;
//	}
//
//	public String makeResponseCode() {
//		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
//		StringBuilder salt = new StringBuilder();
//		Random rnd = new Random();
//		while (salt.length() < 5) { // length of the random string.
//			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
//			salt.append(SALTCHARS.charAt(index));
//		}
//		String saltStr = salt.toString();
//		return saltStr;
//
//	}

//	public void calculateTotalCost(int noOfServices, int noOfSections, int noOfRooms){
//		for(int i = 0; i < noOfServices;  i++){
//			for(int j = 0; j < noOfSections; j++){
//				for(int k = 0; k < noOfRooms; k++){
//					System.out.println(getBuilding().getServices()[i].getSections()[j].getRooms()[k].getSensor().getSensorCost());
//					totalCost = totalCost + getBuilding().getServices()[i].getSections()[j].getRooms()[k].getSensor().getSensorCost();
//				}
//			}
//		}
//	}
}