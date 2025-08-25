package com.karthik.BOOKSTORE.Service;

import com.karthik.BOOKSTORE.Model.Author;
import com.karthik.BOOKSTORE.Repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
@Autowired
    AuthorRepo authrepo;
    public Author addauthor(Author author) {
        return authrepo.save(author);
    }
}
