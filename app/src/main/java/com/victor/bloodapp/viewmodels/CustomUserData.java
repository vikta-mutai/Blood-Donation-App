package com.victor.bloodapp.viewmodels;

import java.io.Serializable;

//data from donations
public class CustomUserData implements Serializable {
   private String Address, County, Contact;
   private String Name, BloodGroup;
   private String Time, Date;


   public CustomUserData() {

    }

    public CustomUserData(String address, String county, String contact, String name, String bloodGroup, String time, String date) {
        Address = address;
        County = county;
        Contact = contact;
        Name = name;
        BloodGroup = bloodGroup;
        Time = time;
        Date = date;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getCounty() {
        return County;
    }

    public void setCounty(String county) {
        this.County = county;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        this.Contact = contact;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
       this.Name = name;
    }

    public String getBloodGroup() {
        return BloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.BloodGroup = bloodGroup;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        this.Time = time;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }
}
