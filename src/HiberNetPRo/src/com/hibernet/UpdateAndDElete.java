package com.hibernet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateAndDElete {
    public static void main(String[] args) {
        // Initialize Hibernate SessionFactory
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Example: Update a student
//        updateStudent(sessionFactory, 1, "onEEE", "Smith", "A+"); // Assume student_id is 1

        // Example: Delete a student
        deleteStudent(sessionFactory, 7); // Assume student_id is 1

        // Close the session factory
        sessionFactory.close();
    }

    public static void updateStudent(SessionFactory sessionFactory, int studentId, String firstName, String lastName, String grade) {
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

    public static void deleteStudent(SessionFactory sessionFactory, int studentId) {
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
