package com.karthik.BOOKSTORE.Repository;

import com.karthik.BOOKSTORE.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepo extends JpaRepository<Book,Long> {
    public List<Book> findByAuthor_Authorid(long authorid);
    public List<Book> findByCategory_Categoryid(long authorid);
}
