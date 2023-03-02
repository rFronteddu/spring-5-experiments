package rfronteddu.springFramework.springWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import rfronteddu.springFramework.springWebApp.repositories.AuthorRepository;

@Controller
public class AuthorController
{
    private final AuthorRepository authorRepository;

    public AuthorController (AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping ("/book/authors")
    public String getAuthors (Model model) {
        model.addAttribute ("authors", authorRepository.findAll ());
        return "books/authors";
    }
}
