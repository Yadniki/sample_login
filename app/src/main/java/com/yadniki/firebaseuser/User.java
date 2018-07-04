package com.yadniki.firebaseuser;

public class User {

    String userId;
    String userName;
    Integer money;
    public User(){

    }
    public User(String userId,String userName,Integer money){
        this.userId=userId;
        this.userName=userName;
        this.money=0;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getMoney() {
        return money;
    }
}
