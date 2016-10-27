package com.springapp.mvc.controllers;

import com.springapp.mvc.models.Author;
import com.springapp.mvc.services.IAuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

/**
 * @author Denis Koblov
 * @e-mail dekankob@gmail.com
 * @date 23.10.2016
 */
@Controller
public class AuthorsController {
    IAuthorsService authorsService;

    @Autowired
    public AuthorsController(IAuthorsService authorsService) {
        this.authorsService = authorsService;
    }

    @RequestMapping(value = "/author", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        List<Author> authors = authorsService.getAll();
        model.addAttribute("authors", authors);
        model.addAttribute("message", "Hello world!");
        return "authors";
    }

    @RequestMapping(value = "/author/{authorId}", method = RequestMethod.GET)
    public String authorInfo(ModelMap model, @PathVariable Integer authorId) {
        model.addAttribute("message", "Hello world!");
        return "authors";
    }
}
