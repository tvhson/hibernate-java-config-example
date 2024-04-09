package org.example;

import org.example.dao.StudentDao;
import org.example.entity.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        Student student1 = new Student("An", "Nguyen", "21521837@gm.uit.edu.vn");
        Student student2 = new Student("Hoai", "Ho", "215284963@gm.uit.edu.vn");
        Student student3 = new Student("Huy", "Nguyen", "21522756@gm.uit.edu.vn");

        studentDao.saveStudent(student1);
        studentDao.saveStudent(student2);
        studentDao.saveStudent(student3);

        List< Student > students = studentDao.getStudents();
        students.forEach(s -> System.out.println(s.toString()));

        student1.setFirstName("An1");
        studentDao.updateStudent(student1);

        students = studentDao.getStudents();
        students.forEach(s -> System.out.println(s.toString()));

        studentDao.deleteStudent(1);
        students = studentDao.getStudents();
        students.forEach(s -> System.out.println(s.toString()));
    }
}