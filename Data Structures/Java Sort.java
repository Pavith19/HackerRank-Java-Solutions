/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-15*/
import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
//class CustomComparator implements Comparator<Student>{
//    @Override
//    public int compare(Student s1, Student s2){
//        if (s1.getCgpa() < s2.getCgpa())
//            return 1;
//        if (s1.getCgpa() > s2.getCgpa())
//            return  -1;
//        if (!Objects.equals(s1.getFname(), s2.getFname()))
//            return s1.getFname().compareTo(s2.getFname());
//        return s1.getId() - s2.getId();
//    }
//}

public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getCgpa() == o2.getCgpa()){
                    return o1.getFname().compareTo(o2.getFname());
                } else if (o1.getCgpa() < o2.getCgpa()) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        });

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}



