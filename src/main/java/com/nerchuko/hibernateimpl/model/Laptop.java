package com.nerchuko.hibernateimpl.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
//@ToString(exclude = "student")
public class Laptop {

    @Id
    private int laptop_id;
    private String laptop_name;

//    @ManyToMany(cascade = CascadeType.ALL)
//    private List<Student> student;

}
