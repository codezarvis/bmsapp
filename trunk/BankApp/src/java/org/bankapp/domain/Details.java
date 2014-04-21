package org.bankapp.domain;
// Generated Apr 21, 2014 10:52:35 AM by Hibernate Tools 3.2.1.GA



/**
 * Details generated by hbm2java
 */
public class Details  implements java.io.Serializable {


     private Long detailsId;
     private String firstName;
     private String lastName;
     private String mobile;
     private String emailId;
     private byte[] picture;
     private byte[] signature;
     private String accountType;
     private Double minimumBalance;
     private Long addressId;
     private String parentName;
     private String designation;

    public Details() {
    }

	
    public Details(Long detailsId) {
        this.detailsId = detailsId;
    }
    public Details(Long detailsId, String firstName, String lastName, String mobile, String emailId, byte[] picture, byte[] signature, String accountType, Double minimumBalance, Long addressId, String parentName, String designation) {
       this.detailsId = detailsId;
       this.firstName = firstName;
       this.lastName = lastName;
       this.mobile = mobile;
       this.emailId = emailId;
       this.picture = picture;
       this.signature = signature;
       this.accountType = accountType;
       this.minimumBalance = minimumBalance;
       this.addressId = addressId;
       this.parentName = parentName;
       this.designation = designation;
    }
   
    public long getDetailsId() {
        return this.detailsId;
    }
    
    public void setDetailsId(Long detailsId) {
        this.detailsId = detailsId;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getEmailId() {
        return this.emailId;
    }
    
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public byte[] getPicture() {
        return this.picture;
    }
    
    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
    public byte[] getSignature() {
        return this.signature;
    }
    
    public void setSignature(byte[] signature) {
        this.signature = signature;
    }
    public String getAccountType() {
        return this.accountType;
    }
    
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public Double getMinimumBalance() {
        return this.minimumBalance;
    }
    
    public void setMinimumBalance(Double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
    public Long getAddressId() {
        return this.addressId;
    }
    
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }
    public String getParentName() {
        return this.parentName;
    }
    
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }
    public String getDesignation() {
        return this.designation;
    }
    
    public void setDesignation(String designation) {
        this.designation = designation;
    }




}

