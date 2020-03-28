package com.wds.zhi_and_yinyong.Test2;

public class StudentClass {
    public static class Student{
        private int id;
        private String name;
        public Student(int id,String name){
            this.id=id;
            this.name=name;
        }
       public  Student(){}

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        int a=1;
        String name="张三";
        Student student = new Student(1, "小明");
        Test(a,name,student);
        System.out.println("在main方法中 a= "+a);
        System.out.println("在main方法中 name= "+name);
        System.out.println("在main方法中 student名称为: "+student.getName()+"id为： "+student.getId() );


    }



    static  void Test(int a,String name,Student student){
        a=2;
        name="王五";
        student.setId(2);
        student.setName("小王");
    }
}
