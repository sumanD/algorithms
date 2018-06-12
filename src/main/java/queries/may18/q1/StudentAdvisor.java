package queries.may18.q1;

import java.util.Scanner;

/**
 * Project 5 - Student Advisor
 *
 * @author Joe Btfsplk
 */

public class StudentAdvisor {

    private static Student[] studentList = {

            new Student("Tom Jones", "imastudent@school.edu", "password"),

            new Student("DB Cooper", "dbcooper@school.edu", "whoami"),

            new Student("Harry Smith", "hsmith@school.edu", "harry"),};

    public static void main(String[] args) {
        init(); // Initialize studentList with classes
        startKiosk(); // Begin menu based operations of the student advisor kiosk
    }

    private static void startKiosk() {

        /* TODO Create a continuous loop that first 'logs in' a student

        and then provides a loop of menu based options:



        Choose from the following options:

        1. Display My Courses

        2. Register for a Course

        3. Withdraw from a Course

        4. Log Out

        Option:

        */

        Scanner keyboard = new Scanner(System.in);

    }

    /**
     * Initialize the list of students with classes and do some basic validity
     * <p>
     * checks
     */

    private static void init() {

        for (int i = 0; i < studentList.length; i++) {

            Student student = studentList[i];

            switch (i) {

                case 0:

                    if (student.login("imastudent@school.edu", "password") == false

                            || student.login("imastudent@school.edu", "") == true) {

                        System.out.println("Logic Error: "

                                + student.getName()

                                + " password verification failed");

//System.exit(0);

                    }

                    student.registerForCourse("CSIT165");

                    student.registerForCourse("CSIT123");

                    student.registerForCourse("MATH101");

                    student.registerForCourse("PLAGIARISM101");

                    student.enterGrade("PLAGIARISM101", "A");

                    System.out.println(student);

                    break;

                case 1:

                    student.registerForCourse("CSIT165");

                    if (student.registerForCourse("CSIT165") == false) {

                        System.out.println("Logic Error: "

                                + student.getName()

                                + " cannot register for same course");

//System.exit(0);

                    }

                    if (student.enterGrade("PLAGIARISM101", "A") == false) {

                        System.out.println("Logic Error: "

                                + student.getName()

                                + " is not registered for " + "PLAGIARISM101");

//System.exit(0);

                    }

                    System.out.println(student);

                    break;

                default:

                    student.registerForCourse("MATH101");

                    student.registerForCourse("PLAGIARISM101");

                    student.enterGrade("PLAGIARISM101", "Withdrawn");

                    student.registerForCourse("CSIT165");

                    student.registerForCourse("CSIT166");

                    student.registerForCourse("CSIT265");

                    if (student.registerForCourse("CSIT185") == false) {

                        System.out.println("Logic Error: "

                                + student.getName()

                                + " cannot register for more than 5 courses");

//System.exit(0);

                    }

                    System.out.println(student);

            }

        }

    }

}
