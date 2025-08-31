package com.karthik.BOOKSTORE.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String username;
  private String password;
  @Enumerated(EnumType.STRING)
  private Role role;
  @OneToOne(mappedBy = "user" ,cascade=CascadeType.ALL)
  @JsonIgnore
  @ToString.Exclude
  private Cart cart;
}
