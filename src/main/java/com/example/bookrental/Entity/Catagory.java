package com.example.bookrental.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Catagory")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Catagory {
@Id
        @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String  name;
    String discription;

}
