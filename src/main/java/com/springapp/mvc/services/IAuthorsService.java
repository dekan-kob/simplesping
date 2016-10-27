package com.springapp.mvc.services;

import com.springapp.mvc.models.Author;

import java.util.List;

/**
 * @author Denis Koblov
 * @e-mail dekankob@gmail.com
 * @date 23.10.2016
 */
public interface IAuthorsService {
    Author getById(int id);
    List<Author> getAll();
    Author getByPhone(String phone);
}
