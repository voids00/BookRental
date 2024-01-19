package com.example.bookrental.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "tbl_catagory")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SQLDelete(sql = "UPDATE tbl_catagory SET deleted = true WHERE id = ?")
@Where(clause ="deleted=false")
public class Category {
    @Id
    @SequenceGenerator(name = "category_primary_key_generator", initialValue = 0, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "category_primary_key_generator")
    Long id;

    @Column(unique=true)
    String name;
    String discription;
    private boolean deleted = Boolean.FALSE;
}
