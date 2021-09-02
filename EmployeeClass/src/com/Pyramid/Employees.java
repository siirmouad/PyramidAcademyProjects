package com.Pyramid;

public class Employees {
    private String name;
     int age;
    double salary;
     String location;
     double periodWorked;


    public  Employees( String name,
            int age,
            double salary,
            String location,
            double periodWorked)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
        this.periodWorked = periodWorked;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void raiseSalary(){
        this.salary = salary + 10000;
        if(periodWorked > 5){
            System.out.println(salary);
        }
    }

}

