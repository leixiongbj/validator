package cn.ibengbeng.validator.controller;

import cn.ibengbeng.customer.BookService;
import cn.ibengbeng.validator.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public String addUser(@RequestBody @Valid User user) {
        return bookService.print();
    }
}
