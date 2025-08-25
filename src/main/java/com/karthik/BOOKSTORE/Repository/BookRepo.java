package com.karthik.BOOKSTORE.Repository;

import com.karthik.BOOKSTORE.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Long> {
}
