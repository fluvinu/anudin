package com.hibernet;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainConsole {
    public static void main(String[] args) {
        // Initialize Hibernate SessionFactory
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Insert Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Fetch All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    insertStudent(scanner, sessionFactory);
                    break;
                case 2:
                    updateStudent(scanner, sessionFactory);
                    break;
                case 3:
                    deleteStudent(scanner, sessionFactory);
                    break;
                case 4:
                    fetchAllStudents(sessionFactory);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sessionFactory.close();
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    public static void insertStudent(Scanner scanner, SessionFactory sessionFactory) {
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Enter date of birth (yyyy-MM-dd): ");
        String dobInput = scanner.nextLine();
        Date dateOfBirth = null;
        try {
            dateOfBirth = new SimpleDateFormat("yyyy-MM-dd").parse(dobInput);
        } catch (Exception e) {
            System.out.println("Invalid date format. Student not inserted.");
            return;
        }
        
        System.out.print("Enter grade: ");
        String grade = scanner.nextLine();
        
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            try {
                // Create new student object
                Student student = new Student();
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setDateOfBirth(dateOfBirth);
                student.setGrade(grade);

                // Save the student
                session.save(student);
                transaction.commit(); // Commit the transaction
                System.out.println("Student inserted successfully.");
            } catch (Exception e) {
                if (transaction.isActive()) {
                    transaction.rollback(); // Rollback on error
                }
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void fetchAllStudents(SessionFactory sessionFactory) {
        try (Session session = sessionFactory.openSession()) {
            // Query to fetch all students
            List<Student> students = session.createQuery("FROM Student", Student.class).list();
            System.out.println("Student Records:");
            for (Student student : students) {
                System.out.println("ID: " + student.getId() + ", First Name: " + student.getFirstName() +
                                   ", Last Name: " + student.getLastName() +
                                   ", Date of Birth: " + student.getDateOfBirth() +
                                   ", Grade: " + student.getGrade());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateStudent(Scanner scanner, SessionFactory sessionFactory) {
        System.out.print("Enter student ID to update: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter new first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter new last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter new grade: ");
        String grade = scanner.nextLine();

        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            try {
                // Retrieve the existing student object
                Student student = session.get(Student.class, studentId);
                if (student != null) {
                    // Update student details
                    student.setFirstName(firstName);
                    student.setLastName(lastName);
                    student.setGrade(grade);
                    session.update(student); // Persist the changes
                    System.out.println("Student updated successfully.");
                } else {
                    System.out.println("Student not found with ID: " + studentId);
                }

                transaction.commit(); // Commit the transaction
            } catch (Exception e) {
                if (transaction.isActive()) {
                    transaction.rollback(); // Rollback on error
                }
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteStudent(Scanner scanner, SessionFactory sessionFactory) {
        System.out.print("Enter student ID to delete: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            try {
                // Retrieve the student object to be deleted
                Student student = session.get(Student.class, studentId);
                if (student != null) {
                    session.delete(student); // Delete the student
                    System.out.println("Deleted student with ID: " + studentId);
                } else {
                    System.out.println("Student not found with ID: " + studentId);
                }

                transaction.commit(); // Commit the transaction
            } catch (Exception e) {
                if (transaction.isActive()) {
                    transaction.rollback(); // Rollback on error
                }
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

