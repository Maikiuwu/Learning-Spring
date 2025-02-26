package com.example.demo.Model;

public class perfil {

    private String name;
    private String last_name;
    private String email;
    private String password;

    public perfil(String name, String last_name, String email, String password) {
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getLast_name() {
        return last_name;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    
    
}
