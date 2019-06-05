/** Created by Randy Yin
 * This class is responsible for keeping track of student fees and grade
 */

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /** Every student created will start with a 30000 payment
     *
     * @param id id for student: unique
     * @param name name of the student
     * @param grade grade level of the student
     */

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    /** Keep adding amount to feesPaid
     *
     * @param feesPaid fees that the student has paid
     */
    public void setFeesPaid(int feesPaid) {
        this.feesPaid += feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }
}
