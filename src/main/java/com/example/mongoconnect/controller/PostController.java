package com.example.mongoconnect.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.example.mongoconnect.Repo.listReviewsRepo;
import com.example.mongoconnect.model.listReviews;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController
{

    @Autowired
    listReviewsRepo repo;

    @GetMapping("/allListAndReviews")
    @CrossOrigin
    public List<listReviews> getAllReviews()
    {
        return repo.findAll();
    }

    @ApiIgnore
    @RequestMapping(value="/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }
}