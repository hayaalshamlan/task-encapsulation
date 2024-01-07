public class App {
    public static void main(String[] args) {
        Students student = new Students("Haya", 26, 3.5);
        student.setGpaStatus(3.5);
        student.setAge(26);
        student.setName("Haya");
        System.out.println(student.getGpaStatus());
        System.out.println(student.getAge());
        System.out.println(student.getName());

    }
}
