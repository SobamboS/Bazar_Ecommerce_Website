package com.appsdeveloperblog.app.ws.mobileappws.Vendor.validator;

public class VendorDetailValidator{
    public  static boolean isValidEmail(String email){
        return email.contains("@");
    }

    public  static  boolean isValidPhoneNumber(String phoneNumber){
        return  phoneNumber.length() == 11;
    }

    public  static boolean isValidPassword(String password){
        return password.matches("[a-zA-Z0-9(@#$!_)]{8,20}");
    }


}
