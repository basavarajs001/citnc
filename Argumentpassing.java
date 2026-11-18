class ArgumentStudent {
    int marks;
    ArgumentStudent(int marks) { this.marks = marks; }
}
class ArgumentPassing {
    static void change(int x, ArgumentStudent s) {
        x = 100;
        s.marks = 95;
        s = new ArgumentStudent(50);
    }
    public static void main(String[] args) {
        int n = 20;
        ArgumentStudent st = new ArgumentStudent(60);
        change(n, st);
        System.out.println(n);
        System.out.println(st.marks);
    }
}