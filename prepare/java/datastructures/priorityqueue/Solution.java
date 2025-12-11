package prepare.java.datastructures.priorityqueue;

import java.util.Comparator;

public class Solution {

    class Student {
        int id;
        String name;
        double cgpa;

        public Student( int id, String name, double cgpa ) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public double getCGPA() {
            return this.cgpa;
        }
    }

    class Priorities implements Comparator<Student> {

        @Override
        public int compare( Student s1, Student s2 ) {


            Student student;
            if ( s1.getCGPA() != s2.getCGPA() ) {
                return Math.max( s1.getCGPA(), s2.getCGPA() ) == s1.getCGPA() ? s1.getId() : s2.getId();
            } else if ( !s1.getName().equals( s2.getName() ) ) {
                student = s1.getName().compareTo( s2.getName() ) > 0 ? s1 : s2;
                return student.getId();
            } else {
                student = Math.max( s1.getId(), s2.getId() ) == s1.getId() ? s1 : s2;
                return student.getId();
            }


        }
        // public static List<Student> getStudents( List<String> events ) {




        // PriorityQueue<Student> list = new PriorityQueue<Student>( new Priorities() );
        // return list;
        // }
    }

}
