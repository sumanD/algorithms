package chegg.may18.q1;

/**
 * Project 5 - Student Advisor
 *
 * @author Joe Btfsplk
 */

public class Student {

    private String name, email, password;

    private Course[] courseList;

    private int currentCourses;

    public final int MAX_COURSES = 5;

    /**
     * Create a new student and empty list of courses taken/registered for
     *
     * @param name     student name
     * @param email    email address
     * @param password case sensitive password
     */

    public Student(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.courseList = new Course[MAX_COURSES];
    }

    /**
     * Return the student's name
     *
     * @return name
     */

    public String getName() {
        return name;
    }


    /**
     * Check the login credentials of this student against his email address and
     * <p>
     * password. Passwords are case sensitive.
     *
     * @param email    email address
     * @param password password to check
     * @return true if both credentials match
     */

    public boolean login(String email, String password) {
        if(this.email.equals(email) && this.password.equals(password)) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Register for a course. Operation fails if already registered or is
     * <p>
     * currently registered for the maximum number MAX_COURSES
     *
     * @param courseID course ID to register
     * @return true if successful
     */

    public boolean registerForCourse(String courseID) {

        if(currentCourses < MAX_COURSES) {

            for(Course course : courseList) {
                if(course!= null && course.getCourse().equalsIgnoreCase(courseID)) {
                    return false;
                }
            }

            Course course = new Course(courseID);
            courseList[currentCourses] = course;
            currentCourses ++;
            return true;
        }
        else {
            return false;
        }
    }


    /**
     * Return the course registered to
     *
     * @param courseID course ID to find
     * @return Course or null if not registered
     */

    public Course getCourse(String courseID) {
        Course course = null;

        for(Course course1 : courseList) {
            if(course!= null && course1.getCourse().equalsIgnoreCase(courseID)) {
                course = course1;
                break;
            }
        }

        return course;
    }


    /**
     * Enter a grade for the desired course that is still in progress.
     * <p>
     * In other words, one for which no grade has been entered.
     *
     * @param courseID course ID to enter a grade for
     * @param grade    grade to be entered
     * @return true if successful
     */

    public boolean enterGrade(String courseID, String grade) {

        for(Course course : courseList) {
            if(course!= null && course.getCourse().equalsIgnoreCase(courseID)
                    && course.isCompleted() == false) {
                course.setGrade(grade);
                return true;
            }
        }

        return false;
    }


    /**
     * Return a string representation of this student and courses
     * <p>
     * he/she is registered for
     *
     * @return string representation of the student
     */

    public String toString() {

        String s = name + "\n";

        for (int i = 0; i < currentCourses; i++) {

            s += courseList[i] + "\n";

        }
        return s;
    }
}