package com.springapp.mvc.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author Denis Koblov
 * @e-mail dekankob@gmail.com
 * @date 23.10.2016
 */
@Entity
public class Author implements Serializable {
    private static final long serialVersionUID = 4011346719502656269L;

    private int id;
    private String fio;
    private String phone;

    public Author() {
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
