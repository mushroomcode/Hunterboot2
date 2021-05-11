package com.Controller;

import com.Entity.Librarian;
import com.Service.LibrarianServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HunterController {

    @Autowired
    private LibrarianServiceImpl librarianService;

    @GetMapping("/getLibrarian")
    public Librarian hunterMapperTestConn(int id) {
        return librarianService.selectLibrarian(id);
    }

    @PostMapping("/getHero")
    public String converterTEST() {
        return "we are hero!";
    }

}
