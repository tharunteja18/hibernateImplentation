package com.nerchuko.hibernateimpl.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity(name="laptop")
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
//@ToString(exclude = "student")
public class Laptop {

    @Id
    private int laptop_id;
    private String laptop_name;

}
