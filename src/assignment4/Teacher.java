
package assignment4;

import java.util.Date;

public class Teacher extends Person {
    private String department;
    private String teachingSubject;

    public Teacher(String id, String fullName, Date dateOfBirth, String department, String teachingSubject) {
        super(id, fullName, dateOfBirth);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void addPerson() {
        
    }

    @Override
    public void updatePerson(String id) {
        
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher ID: " + getId());
        System.out.println("Name: " + getFullName());
        System.out.println("Date of Birth: " + getDateOfBirth());
        System.out.println("Department: " + department);
        System.out.println("Teaching Subject: " + teachingSubject);
    }
}
