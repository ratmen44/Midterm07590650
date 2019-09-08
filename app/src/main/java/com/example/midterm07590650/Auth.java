package com.example.midterm07590650;

public class Auth {
    private static final String USERNAME = "bbb";
    private static final String PASSWORD = "222";
    private static final String USERNAME1 = "aaa";
    private static final String PASSWORD1 = "111";

    private String mUsername;
    private String mPassword;

    public Auth(String Username, String Password) {
        this.mUsername = Username;
        this.mPassword = Password;
    }

    public String getmUsername(){
        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public boolean check() {
        if(getmUsername().equals(USERNAME) && getmPassword().equals(PASSWORD) || getmUsername().equals(USERNAME1) && getmPassword().equals(PASSWORD1)){
            return true;
        }else{
            return false;
        }
    }
}
