import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "John Doe", "123 Elm St"));
        students.add(new Student(2, "Jane Smith", "456 Oak St"));
        students.add(new Student(3, "Alice Johnson", "789 Pine St"));
        students.add(new Student(4, "Bob Brown", "101 Maple St"));
        students.add(new Student(5, "Charlie White", "202 Cedar St"));
        students.add(new Student(6, "David Black", "303 Birch St"));
        students.add(new Student(7, "Eve Green", "404 Spruce St"));
        students.add(new Student(8, "Frank Blue", "505 Walnut St"));
        students.add(new Student(9, "Grace Red", "606 Cherry St"));
        students.add(new Student(10, "Hannah Yellow", "707 Ash St"));

        System.out.println("Orginal List:");
        for (Student student : students) {
            System.out.println(student);
        }

        SelectionSort.selectionSort(students, new NameComparator());
        System.out.println("\nSorted by Name:");
        for (Student student : students) {
            System.out.println(student);
        }

        SelectionSort.selectionSort(students, new RollNoComparator());
        System.out.println("\nSorted by Roll No:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
