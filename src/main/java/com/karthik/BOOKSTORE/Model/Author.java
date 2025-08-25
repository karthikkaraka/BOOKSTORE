package com.karthik.BOOKSTORE.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long authorid;
    private String authorname;
    private String email;
    private String bio;
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    private List<Book> books;
}
