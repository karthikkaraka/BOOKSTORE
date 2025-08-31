package com.karthik.BOOKSTORE.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cartitemid;
    @ManyToOne
    @JoinColumn(name="cart_id",referencedColumnName = "cartid")
    private Cart cart;
    @ManyToOne
    @JoinColumn(name="book_id",referencedColumnName = "id")
    private Book book;
    private int quantity;
}
