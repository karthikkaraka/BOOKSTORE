package com.karthik.BOOKSTORE.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private String title;
    private double price;
    private long stock;
    private String description;
    private long ISBN;
    private Date published_date;
    @ManyToOne
    @JoinColumn(name="author_id")
    private Author author;
    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;
}
