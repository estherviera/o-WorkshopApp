package org.ulpgc.is1.model;

public class Customer {

    private String name;
    private Phone phone;

    public Customer(String name, Phone phone){
        this.name = name;
        this.phone = phone;
    }
    // prueba

    public String getName() {
        return name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
