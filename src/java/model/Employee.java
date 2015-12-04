package model;

import java.io.Serializable;

/**
 *
 * @author John Phillips
 */
public class Employee implements Serializable {

    private int empId;
    private String number;
    private String lastName;
    private String firstName;
    private String position;

    public Employee(int empId, String number, String lastName, String firstName, String position) {
        this.empId = empId;
        this.number = number;
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

   
    public String inHTMLRowFormat() {
        return "<tr><td>" + empId + "</td>"
                + "<td>" + number + "</td>"
                + "<td>" + lastName + "</td>"
                + "<td>" + firstName + "</td>"
                + "<td>" + position + "</td></tr>\n";
    }

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", title=" + number
                + ", author=" + lastName + ", subject=" + firstName
                + ", isbn=" + position + '}';
    }

    public int getNubmer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
