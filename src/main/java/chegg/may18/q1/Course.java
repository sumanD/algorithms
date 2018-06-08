package chegg.may18.q1;

/**
 * Project 5 - Student Advisor
 *
 * @author Joe Btfsplk
 */

public class Course {

    private String course, grade;

    /**
     * Create a course have a specific course identifier, e.g., MATH101
     *
     * @param course course identifier
     */

    public Course(String course) {
        this.course = course;

    }

    /**
     * Return course identifier
     *
     * @return course identifier
     */

    public String getCourse() {
        return course;

    }

    /**
     * Return the current grade
     *
     * @return grade
     */

    public String getGrade() {
        return grade;

    }

    /**
     * Enter a grade and mark the course as completed
     *
     * @param grade
     */

    public void setGrade(String grade) {

        this.grade = grade;
    }

    /**
     * Return current course status
     *
     * @return true if completed
     */

    public boolean isCompleted() {

        return grade!= null && grade.equalsIgnoreCase("completed") ? true : false;
    }

    /**
     * String representation of this course
     *
     * @return
     */

    public String toString() {

// TODO: Add code to complete this method

        return course + " - Grade: " + grade + " - Status: ";

    }


}
