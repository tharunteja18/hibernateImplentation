package com.nerchuko.hibernateimpl.Service;


import com.nerchuko.hibernateimpl.Repository.LaptopRepository;
import com.nerchuko.hibernateimpl.Repository.StudentRepository;
import com.nerchuko.hibernateimpl.model.Laptop;
import com.nerchuko.hibernateimpl.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class serviceClass {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private LaptopRepository laptopRepository;
    public void addStudent() {
        System.out.println("inside the service class");

        Laptop l1 = Laptop.builder()
                .laptop_id(101)
                .laptop_name("hp")
                .build();

        Laptop l2 = Laptop.builder()
                .laptop_id(102)
                .laptop_name("lenovo")
                .build();

//        Laptop l3 = Laptop.builder()
//                .laptop_id(108)
//                .laptop_name("Dell")
//                .build();

//        List<Laptop> list = List.of(l1, l2);

        Student s1 = Student.builder()
                .student_id(1)
                .student_name("vk")
                .student_marks(89)
                .build();

        Student s2 = Student.builder()
                .student_id(2)
                .student_name("rohit")
                .student_marks(90)
                .build();
//        List<Student> listStudent = List.of(s1, s2);
//
//        s1.setLaptop(list);
//        s2.setLaptop(list);
//        l1.setStudent(listStudent);
//        l2.setStudent(listStudent);


        laptopRepository.save(l1);
        laptopRepository.save(l2);

        studentRepository.save(s1);
        studentRepository.save(s2);

        System.out.println("outside the service class");
    }

}
