package com.wds.Test;

public class StudentServiceImpl implements StudentService{
    @Override
    public void addOne() {
        System.out.println(1);
    }

    public static void main(String[] args) {
        StudentServiceImpl studentService = new StudentServiceImpl();
        studentService.addTwo();
    }
}
