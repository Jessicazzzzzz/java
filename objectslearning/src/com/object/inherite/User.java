package com.object.inherite;

import java.util.Objects;

public class User {
    int id;
    String name;
    String pwd;

    User(int id,String name,String pwd){
        this.id =id;
        this.name = name ;
        this.pwd= pwd;
    }

    public static void main(String[] args) {
        User u1= new User(1,"nick","123456");
        User u2= new User(1,"nick2","123456");
        System.out.println(u1);
        System.out.println(u2.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
