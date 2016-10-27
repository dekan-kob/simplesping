package com.springapp.mvc.forms;

import java.io.Serializable;
import javax.validation.constraints.Size;

/**
 * @author Denis Koblov
 * @e-mail dekankob@gmail.com
 * @date 24.10.2016
 */
public class UserForm implements Serializable {
    private static final long serialVersionUID = 4657462015039726030L;
    private String userId;
    @Size(min = 10, message = "min size")
    private String email;
    private Integer age;

    //Contacts
    private String phone;
    private String address;

    private String legalName;
    private String ipName;

    public boolean isLegal() {
        if (phone == null || phone.length() == 0 || !phone.startsWith("8")) {
            return true;
        }
        return false;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getIpName() {
        return ipName;
    }

    public void setIpName(String ipName) {
        this.ipName = ipName;
    }
}
