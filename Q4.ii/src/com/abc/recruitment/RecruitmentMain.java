package com.abc.recruitment;

import java.util.*;

public class RecruitmentMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Student, StudentSkill> map = new HashMap<>();

        int choice;

        do {
            System.out.println("\n===== ABC RECRUITMENT MENU =====");
            System.out.println("1. Add new student");
            System.out.println("2. Add new skill for student");
            System.out.println("3. Delete student");
            System.out.println("4. Delete skill for student");
            System.out.println("5. Display students by skill");
            System.out.println("6. Display students by degree");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter SID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Birthdate: ");
                    String bdate = sc.nextLine();

                    System.out.print("Enter Degree: ");
                    String degree = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    Student s = new Student(id, name, bdate, degree, marks);
                    StudentSkill ss = new StudentSkill();

                    System.out.print("Enter initial skill: ");
                    sc.nextLine();
                    String skill = sc.nextLine();
                    ss.addSkill(skill);

                    map.put(s, ss);

                    System.out.println("Student Added!");
                    break;

                case 2:
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Skill: ");
                    String newSkill = sc.nextLine();

                    for (Student st : map.keySet()) {
                        if (st.sid == sid) {
                            map.get(st).addSkill(newSkill);
                        }
                    }

                    System.out.println("Skill Added!");
                    break;

                case 3:
                    System.out.print("Enter Student ID to delete: ");
                    int delId = sc.nextInt();

                    map.keySet().removeIf(st -> st.sid == delId);

                    System.out.println("Student Deleted!");
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    int sid2 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Skill to remove: ");
                    String remSkill = sc.nextLine();

                    for (Student st : map.keySet()) {
                        if (st.sid == sid2) {
                            map.get(st).removeSkill(remSkill);
                        }
                    }

                    System.out.println("Skill Removed!");
                    break;

                case 5:
                    System.out.print("Enter Skill: ");
                    sc.nextLine();
                    String searchSkill = sc.nextLine();

                    for (Student st : map.keySet()) {
                        if (map.get(st).hasSkill(searchSkill)) {
                            System.out.println(st + " => " + map.get(st));
                        }
                    }
                    break;

                case 6:
                    System.out.print("Enter Degree: ");
                    sc.nextLine();
                    String deg = sc.nextLine();

                    for (Student st : map.keySet()) {
                        if (st.degree.equalsIgnoreCase(deg)) {
                            System.out.println(st + " => " + map.get(st));
                        }
                    }
                    break;

                case 7:
                    System.out.println("Exited!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}
