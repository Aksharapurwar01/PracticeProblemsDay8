package com.company;

import java.util.Scanner;

class Employee
{
    int emphrs = 0;
    int empwage = 0;
    int  empcheck;
    public static final int is_full_time = 1;
    public static final int is_part_time = 2;
    public static final int emp_rate_per_hour = 20;

    void GetData()         
    {
        int  empcheck = (int) Math.floor(Math.random()*10) %3;
        switch (empcheck) {
            case is_part_time:
                emphrs = 4;
                break;
            case is_full_time:
                emphrs = 8;
                break;
            default:
                emphrs = 0;

        }


    }

    void PutData()         
    {

        empwage = emphrs * emp_rate_per_hour;
        System.out.println("Emp wage: " +empwage);

    }

    public static void main(String args[])
    {

        Employee E = new Employee();// Creating Object

        E.GetData();         
        E.PutData();          

    }
}
