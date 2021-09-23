package com.object.test2;

public class User11 {
    private int idprivate=001;
    int agedefault=19;
    public int numpublic=100;
    protected String nameprotected="no";
    public void login(){
        System.out.println("login");
    System.out.println(this.numpublic);
        System.out.println(this.nameprotected);
        System.out.println(this.agedefault);
        System.out.println(this.idprivate);
}
}
