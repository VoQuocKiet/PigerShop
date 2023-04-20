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
public class order implements Serializable{
    private String cusName;
    private String cusPhone;
    private String cusAddress;
    private String oProduct;
    private String Color;
    private Double Total;

    public order(String cusName, String cusPhone, String cusAddress, String oProduct, String Color, Double Total) {
        this.cusName = cusName;
        this.cusPhone = cusPhone;
        this.cusAddress = cusAddress;
        this.oProduct = oProduct;
        this.Color = Color;
        this.Total = Total;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusPhone() {
        return cusPhone;
    }

    public void setCusPhone(String cusPhone) {
        this.cusPhone = cusPhone;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    public String getoProduct() {
        return oProduct;
    }

    public void setoProduct(String oProduct) {
        this.oProduct = oProduct;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }
    
    
   

   

    
    
    
    
    
}
