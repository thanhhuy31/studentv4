
package assignment4;

import java.util.Scanner;


public class Processor {
    public static void main(String[] args) {
        PersonList personList = new PersonList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add new student");
            System.out.println("2. Add new teacher");
            System.out.println("3. Update person by ID");
            System.out.println("4. Delete person by ID");
            System.out.println("5. Display all students and teachers");
            System.out.println("6. Find the student with the highest GPA");
            System.out.println("7. Find teachers by department");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
              
                    break;
                case 2:
                  
                    break;
                case 3:
                
                    break;
                case 4:
           
                    break;
                case 5:
             
                    personList.displayEveryone();
                    break;
                case 6:
             
                    Student topStudent = personList.findTopStudent();
                    if (topStudent != null) {
                        topStudent.displayInfo();
                    }
                    break;
                case 7:
                   
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
