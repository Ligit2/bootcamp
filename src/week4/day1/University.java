package week4.day1;

import java.io.IOException;
import java.util.Scanner;

public class University {
    String name;
    int countOFStudents;
    int maxCountOfStudents;
    int maxAgeOfStudents;
    int minAgeOfStudents;
    University(){};
    University(String name,int countOFStudents, int maxCountOfStudents, int maxAgeOfStudents, int minAgeOfStudents ){
        this.countOFStudents = countOFStudents;
        this.name = name;
        this.maxAgeOfStudents = maxAgeOfStudents;
        this.maxCountOfStudents = maxCountOfStudents;
        this.minAgeOfStudents =minAgeOfStudents;
    }

    boolean checkAge(int age){
        if(age>=minAgeOfStudents && age<=maxAgeOfStudents)
            return true;
        else
            return false;
    }
    void admission(){
        System.out.println("University has these courses");
        System.out.println("Applied Mathematics -- 1");
        System.out.println("Computer science -- 2");
        System.out.println("History -- 3");
        System.out.println("Biology -- 4");
        System.out.println("Economy -- 5");
    }
    boolean register(){
        this.countOFStudents++;
        if(this.countOFStudents>this.maxCountOfStudents)
            return false;
        else
            return true;
    }
    void display(){
        System.out.println("count of students -> " + countOFStudents);
        System.out.println("maximum count of students-> " + maxAgeOfStudents);
        System.out.println("maximum age of students -> " + maxAgeOfStudents);
        System.out.println("minimum age of students-> " + minAgeOfStudents);
    }

    void professionChoice() throws IOException {
        admission();
        System.out.println("please chose one of the professions");
        char c =(char)System.in.read();
        switch(c){
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            {
                System.out.println("Input your age");
                Scanner scanner = new Scanner(System.in);
                int inputage = scanner.nextInt();
                if(checkAge(inputage)){
                    if(register()){
                        System.out.println("you are already registered");
                    }
                    else
                        System.out.println("Sorry registration is over");
                }
            }
            default:{
                System.out.println("Sorry no such courses");
            }
        }
    }
}
