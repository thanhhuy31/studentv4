
package assignment4;

import java.util.ArrayList;

public class PersonList {
    private ArrayList<Person> personList;

    public PersonList() {
        this.personList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        personList.add(student);
    }
    public void addTeacher(Teacher teacher) {
        personList.add(teacher);
    }

    public void updatePerson(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                person.updatePerson(id);
                break;
            }
        }
    }
    public void deletePersonById(String id) {
        personList.removeIf(person -> person.getId().equals(id));
    }

    public Person findPersonById(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }
    public void displayEveryone() {
        for (Person person : personList) {
            person.displayInfo();
        }
    }
    public Student findTopStudent() {
        Student topStudent = null;
        for (Person person : personList) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (topStudent == null || student.getGpa() > topStudent.getGpa()) {
                    topStudent = student;
                }
            }
        }
        return topStudent;
    }

    public ArrayList<Teacher> findTeacherByDepartment(String department) {
        ArrayList<Teacher> teachers = new ArrayList<>();
        for (Person person : personList) {
            if (person instanceof Teacher && ((Teacher) person).getDepartment().equals(department)) {
                teachers.add((Teacher) person);
            }
        }
        return teachers;
    }
}
