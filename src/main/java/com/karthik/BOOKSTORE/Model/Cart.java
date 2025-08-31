package com.karthik.BOOKSTORE.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cartid;
    @OneToOne
    @JoinColumn(name="user_id",referencedColumnName = "id")
    private User user;
    @CreatedDate
    @Column(updatable = false)
    private Date createdat;
    @LastModifiedDate
    private Date updatedat;
    @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<CartItems> items;
}
