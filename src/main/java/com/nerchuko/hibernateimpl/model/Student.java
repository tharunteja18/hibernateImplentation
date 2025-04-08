package com.nerchuko.hibernateimpl.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
//@ToString(exclude = "laptop")
public class Student {

    @Id
    private int student_id;
    private String student_name;
    private int student_marks;
    //    @JoinColumn(name="laptop_id")

//    @ManyToMany(cascade = CascadeType.ALL)
//    private List<Laptop> laptop;

}
