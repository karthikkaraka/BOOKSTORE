package com.karthik.BOOKSTORE.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long authorid;
    private String authorname;
    private String email;
    private String bio;
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    private List<Book> books;
}
