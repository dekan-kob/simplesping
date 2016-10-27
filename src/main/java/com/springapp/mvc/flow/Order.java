package com.springapp.mvc.flow;

import com.springapp.mvc.models.Author;

import java.io.Serializable;

/**
 * @author Denis Koblov
 * @e-mail dekankob@gmail.com
 * @date 23.10.2016
 */
public class Order implements Serializable {
    private Author user;

    public Author getUser() {
        return user;
    }

    public void setUser(Author user) {
        this.user = user;
    }
}
