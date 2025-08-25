package com.karthik.BOOKSTORE.Service;

import com.karthik.BOOKSTORE.Model.Category;
import com.karthik.BOOKSTORE.Repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepo catrepo;
    public Category addcategory(Category category) {
        return catrepo.save(category);
    }
}
