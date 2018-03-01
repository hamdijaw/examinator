package com.edureka.zuul.rest;

import com.edureka.zuul.domain.Foo;
import com.edureka.zuul.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/mybook")
public class BookRS {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/available")
    public String available() {
        return "Spring in Action Devtools";
    }

    @GetMapping(value = "/checked-out")
    public String checkedOut() {
        return "Spring Boot in Action";
    }

    @GetMapping(value = "/foo")
    public Foo getFoo() {
        System.out.println("inside BookRS.getFoo");
        return new Foo(1, "first");
    }

    @GetMapping(value = "/foo/cache")
    public Foo getFooFromCache(@RequestParam String input) {
        System.out.println("inside BookRS.getFoo");
        return bookService.getFoo(input);
    }
}
