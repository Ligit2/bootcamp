package week4.day2;

import java.util.Locale;

public class Person {
    private String firstname;
    private String lastname;
    private String passportId;
    private  String sex;
    private String nationality;
    private int age;
    Person(){}
    Person(String firstname, String lastname, String passportId, String sex, String nationality){
        this.firstname = firstname;
        this.lastname = lastname;
        this.sex = sex;
        this.nationality = nationality;
        this.passportId = passportId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPassportId() {
        return passportId;
    }

    public String getSex() {
        return sex;
    }

    public String getNationality() {
        return nationality;
    }
    public void setAge(int age ){
        if(age >= 18 && age<=99){
            this.age = age;
        }
        else
            System.out.println("Invalid age");
    }

    public void setFirstname(String firstname) {
        if(firstname.length() >= 3 && firstname.length()<=15)
            this.firstname = firstname;
        else
            System.out.println("Invalid firstname");
    }

    public void setLastname(String lastname) {
        if(lastname.length()>=6 && lastname.length() <=20)
        this.lastname = lastname;
        else
            System.out.println("Invalid lastname");
    }

    public void setPassportId(String passportId) {
        if (passportId.length() == 8) {
            boolean check = true;
            for (int i = 2; i < passportId.length(); i++) {
                if (!(passportId.charAt(i) >= '0' && passportId.charAt(i) <= '9')) {
                    check = false;
                    break;
                }
            }
            if (check && passportId.startsWith("AM"))
                this.passportId = passportId;
            else System.out.println("invalid passport id");
        } else
            System.out.println("invalid passport id");
    }

    public void setSex(String sex) {
        if(sex.compareToIgnoreCase("female")==0 || sex.compareToIgnoreCase("male")==0)
        this.sex = sex.toLowerCase(Locale.ROOT);
        else
            System.out.println("Invalid sex");
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void display(){
        System.out.println("Person name " + firstname + " " + lastname);
        System.out.println("Person gender " + sex);
        System.out.println("Person passportId " + passportId);
        System.out.println("Person nationality " + nationality);
    }
}
