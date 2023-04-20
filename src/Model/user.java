/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class user implements Serializable{
    private String name;
    private String password;

    public user(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        user u = (user) obj;
        if (this.getName().equals(u.getName()) && this.getPassword().equals(getPassword())) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return String.format("%s-%s", this.getName(), this.getPassword());
    }
    
    
    
}
