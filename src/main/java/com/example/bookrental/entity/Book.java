package com.example.bookrental.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_book")
@Getter
@Setter
public class Book {
    @Id
    @SequenceGenerator(name = "book_primary_key_generator", initialValue = 0, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "book_primary_key_generator")
    Long id;
    String name;
    Double rating;
    Integer stock;
    Date published_date;
    String photo;


    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Category.class)
    private Category category;

    @ManyToMany
    @JoinTable(name = "book_author", // Specify the name of the intermediate table
            joinColumns = @JoinColumn(name = "book_id"), // Column in the book table
            inverseJoinColumns = @JoinColumn(name = "author_id") // Column in the author table
    )
    List<Author> authors;
}
//javaxvaidation constraints