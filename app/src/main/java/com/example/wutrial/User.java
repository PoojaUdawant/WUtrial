package com.example.wutrial;

import com.google.firebase.database.Exclude;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class User implements Serializable {

    private String phoneNo;
    private String country;
    private String currency;
    private String idProofNo, idProofName, userID, bankName, fullName;
    private boolean kyc, linkedStatus;
    private int walletBalance,loginPass, paymentPin;

    //change loginpass and pin to hash

    public User(){ //for data snapshot

    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getIdProofNo() {
        return idProofNo;
    }

    public void setIdProofNo(String idProofNo) {
        this.idProofNo = idProofNo;
    }

    public String getIdProofName() {
        return idProofName;
    }

    public void setIdProofName(String idProofName) {
        this.idProofName = idProofName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isKyc() {
        return kyc;
    }

    public void setKyc(boolean kyc) {
        this.kyc = kyc;
    }

    public boolean isLinkedStatus() {
        return linkedStatus;
    }

    public void setLinkedStatus(boolean linkedStatus) {
        this.linkedStatus = linkedStatus;
    }

    public int getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(int walletBalance) {
        this.walletBalance = walletBalance;
    }

    public int getLoginPass() {
        return loginPass;
    }

    public void setLoginPass(int loginPass) {
        this.loginPass = loginPass;
    }

    public int getPaymentPin() {
        return paymentPin;
    }

    public void setPaymentPin(int paymentPin) {
        this.paymentPin = paymentPin;
    }

    public void setData(String ph, String country, String idproofName, String bankName, String idproofNo,String currency){
        this.idProofName =idproofName;
        this.bankName=bankName;
        this.idProofNo =idproofNo;
        this.phoneNo = ph;
        this.country = country;
        this.currency=currency;
        walletBalance =0;
        loginPass=0;
        paymentPin =0;
        kyc = true;
        linkedStatus =true;
    }

    public void generateUserID(String Country, String name, String ph){
        String lastname[] = name.split(" ");
        userID = lastname[1] + "@" + Country + ph;
    }



    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();

        result.put("idProofName", idProofName);
        result.put("idProofNo", idProofNo);
        result.put("kyc",true);
        result.put("linkedStatus",true);
        result.put("country", country);
        result.put("phoneNo", phoneNo);
        result.put("userID", userID);
        result.put("bankName",bankName);
        result.put("walletBalance", walletBalance);
        result.put("loginPass",loginPass);
        result.put("paymentPin", paymentPin);
        result.put("fullName", fullName);

        return result;
    }



}

