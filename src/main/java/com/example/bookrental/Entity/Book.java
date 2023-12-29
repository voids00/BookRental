package com.example.bookrental.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Book")
@Data
public class Book {
    @Id
            @GeneratedValue( strategy = GenerationType.AUTO)
    long id;
    String name;
    double rating;
    int stock;
    Date published_date;
    String photo;

}
