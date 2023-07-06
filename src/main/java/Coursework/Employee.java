package Coursework;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private int office;
    private int salary;
    private int id;
    private static int count;


    public Employee(String fName, String mName, String lName, int office, int salary) {
        this.firstName = fName;
        this.middleName = mName;
        this.lastName = lName;
        this.office = office;
        this.salary = salary;
        id = ++count;

    }

    @Override
    public String toString() {
        return '\n' + "Сотрудник" + '\n' + "id = " + id + '\n' +
                "Фамилия ='" + this.middleName + '\'' + '\n' +
                "Имя ='" + this.firstName + '\'' + '\n' +
                "Отчество ='" + this.lastName + '\'' + '\n' +
                "Отдел = " + this.office + '\n' +
                "Зарплата = " + this.salary + '\n';
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public int getOffice() {
        return office;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
