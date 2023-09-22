public class Student {
    private String name;
    private double gpa;
    private int grade;

    public Student (String n, double g, int gr) {
        name = n;
        gpa = g;
        grade = gr;
    }

    public void hello() {
        System.out.print("Hello, my name is " + name + " I'm in " + grade + "th grade and have a " + gpa + " GPA");
    }
}
