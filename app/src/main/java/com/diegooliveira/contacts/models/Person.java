package com.diegooliveira.contacts.models;

public class Person {
    private String FirstName;
    private String LastName;
    private String Phone;
    private PhoneType PhoneType;
    private String Email;
    private String Instagram;
    private String Linkedin;

    public Person() { }

    public Person(String firstName, String lastName, String phone, int phoneType, String email, String instagram, String linkedin) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPhone(phone);
        this.setPhoneType(phoneType);
        this.setEmail(email);
        this.setInstagram(instagram);
        this.setLinkedin(linkedin);
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastName() {
        return this.LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getPhone() {
        return this.Phone;
    }

    public void setPhone(String phone) {
        this.Phone = phone;
    }

    public PhoneType getPhoneType() {
        return PhoneType;
    }

    public void setPhoneType(int phoneTypeId) {
        this.PhoneType = PhoneType.getById(phoneTypeId);
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getInstagram() {
        return this.Instagram;
    }

    public void setInstagram(String instagram) {
        this.Instagram = instagram;
    }

    public String getLinkedin() {
        return this.Linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.Linkedin = linkedin;
    }

    public String getFullName() {
        return this.getFirstName() + " " + this.getLastName();
    }
}
