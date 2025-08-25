package com.karthik.BOOKSTORE.Controller;

import com.karthik.BOOKSTORE.Model.Category;
import com.karthik.BOOKSTORE.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Bookstore/admin")
@PreAuthorize("hasRole('ADMIN')")
public class AdminControllerCategories {
    @Autowired
    CategoryService catser;
    @PostMapping("/addcategory")
    public ResponseEntity<Category> addcategory(@RequestBody Category category)
    {
        Category addedcategory = catser.addcategory(category);
        return new ResponseEntity<>(addedcategory, HttpStatus.CREATED);
    }

}
