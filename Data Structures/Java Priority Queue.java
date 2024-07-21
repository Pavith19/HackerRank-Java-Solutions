/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-15*/

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */
class Student implements Comparable<Student>{
    String name = new String();
    double cgpa;
    int id;
    public Student(String name, double cgpa, int id){
        this.name = name;
        this.cgpa = cgpa;
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public double getCgpa(){
        return this.cgpa;
    }
    public int getId(){
        return this.id;
    }
    public int compareTo(Student student){
        if (cgpa == student.cgpa){
            if (name.compareTo(student.name) == 0){
                if (id == student.id){
                    return 0;
                }
                else if (id > student.id){
                    return 1;
                }
                else {
                    return -1;
                }
            }
            else {
                return name.compareTo(student.name);
            }
        }
        else if (cgpa > student.cgpa){
            return -1;
        }
        else {
            return 1;
        }
    }
}

class Priorities{
    public ArrayList<Student> getStudents(List<String> evt){
        int n = evt.size();
        PriorityQueue<Student> priorityQueue = new PriorityQueue<Student>();
        for (String i : evt){
            String[] strings = new String[4];
            strings = i.split("\\s");
            if (strings.length > 1){
                priorityQueue.add(new Student(strings[1], Double.valueOf(strings[2]),Integer.valueOf(strings[3])));
            }
            else {
                priorityQueue.poll();
            }
        }
        while (priorityQueue.size() > 1){
            System.out.println(priorityQueue.poll().name);
        }
        return new ArrayList<Student>(priorityQueue);
    }
}


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}