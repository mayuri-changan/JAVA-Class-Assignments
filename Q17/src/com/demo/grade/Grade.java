/*Q17. Create enum grade and store following objects
Distinction(80,100),First(65,79),Second(50,64),Pass(40,49),Fail(0,39)
Accept grade from user and display minimum and maximum marks for the grade.*/

package com.demo.grade;
public enum Grade {

    DISTINCTION(80, 100),
    FIRST(65, 79),
    SECOND(50, 64),
    PASS(40, 49),
    FAIL(0, 39);

    private int minMarks;
    private int maxMarks;

    Grade(int minMarks, int maxMarks) {
        this.minMarks = minMarks;
        this.maxMarks = maxMarks;
    }

    public int getMinMarks() {
        return minMarks;
    }

    public int getMaxMarks() {
        return maxMarks;
    }
}
