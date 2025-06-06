package org.example.ba4;

import lombok.ToString;

@ToString
public class School {
    private String name;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public School() {
        System.out.println("School()");
    }
}
