package com.nerchuko.hibernateimpl.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity(name = "student")
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@ToString(exclude = "laptop")
public class Student {

    @Id
    private int student_id;
    private String student_name;
    private int student_marks;
    //    @JoinColumn(name="laptop_id")
    @OneToOne
    private Laptop laptop;

    public int getStudent_id() {
        return this.student_id;
    }

    public String getStudent_name() {
        return this.student_name;
    }

    public int getStudent_marks() {
        return this.student_marks;
    }

    public Laptop getLaptop() {
        return this.laptop;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public void setStudent_marks(int student_marks) {
        this.student_marks = student_marks;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Student)) return false;
        final Student other = (Student) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getStudent_id() != other.getStudent_id()) return false;
        final Object this$student_name = this.getStudent_name();
        final Object other$student_name = other.getStudent_name();
        if (this$student_name == null ? other$student_name != null : !this$student_name.equals(other$student_name))
            return false;
        if (this.getStudent_marks() != other.getStudent_marks()) return false;
        final Object this$laptop = this.getLaptop();
        final Object other$laptop = other.getLaptop();
        if (this$laptop == null ? other$laptop != null : !this$laptop.equals(other$laptop)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Student;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getStudent_id();
        final Object $student_name = this.getStudent_name();
        result = result * PRIME + ($student_name == null ? 43 : $student_name.hashCode());
        result = result * PRIME + this.getStudent_marks();
        final Object $laptop = this.getLaptop();
        result = result * PRIME + ($laptop == null ? 43 : $laptop.hashCode());
        return result;
    }
}
