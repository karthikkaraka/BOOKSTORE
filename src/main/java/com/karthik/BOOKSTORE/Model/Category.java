package com.karthik.BOOKSTORE.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.print.Book;
import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    private long category_id;
    private String categoryname;
    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private List<Book> books;
}