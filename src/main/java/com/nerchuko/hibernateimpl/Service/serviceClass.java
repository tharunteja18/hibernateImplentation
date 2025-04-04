package com.nerchuko.hibernateimpl.Service;


import com.nerchuko.hibernateimpl.Repository.LaptopRepository;
import com.nerchuko.hibernateimpl.Repository.StudentRepository;
import com.nerchuko.hibernateimpl.model.Laptop;
import com.nerchuko.hibernateimpl.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class serviceClass {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private LaptopRepository laptopRepository;
    public void addStudent() {

        Laptop l1 = Laptop.builder()
                .laptop_id(105)
                .laptop_name("Apple")
                .build();

        Student s1 = Student.builder()
                .student_id(5)
                .student_name("KK")
                .student_marks(50)
                .build();

        s1.setLaptop(l1);
        laptopRepository.save(l1);
        studentRepository.save(s1);
        System.out.println("inside the service class");
    }

}
