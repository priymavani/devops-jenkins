import java.util.*;

public class CrudOperation {

static class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<>();
    int choice;

    do {
        System.out.println("\n===== CRUD OPERATIONS =====");
        System.out.println("1. Insert Data");
        System.out.println("2. Read Data");
        System.out.println("3. Update Data");
        System.out.println("4. Delete Data");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");

        choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Age: ");
                int age = sc.nextInt();

                students.add(new Student(id, name, age));
                System.out.println("Data Inserted Successfully!");
                break;

            case 2:
                System.out.println("\nID\tNAME\tAGE");
                for (Student s : students) {
                    System.out.println(s.id + "\t" + s.name + "\t" + s.age);
                }
                break;

            case 3:
                System.out.print("Enter ID to Update: ");
                int updateId = sc.nextInt();
                sc.nextLine();

                boolean updated = false;

                for (Student s : students) {
                    if (s.id == updateId) {
                        System.out.print("Enter New Name: ");
                        s.name = sc.nextLine();

                        System.out.print("Enter New Age: ");
                        s.age = sc.nextInt();

                        updated = true;
                        break;
                    }
                }

                System.out.println(updated ? "Updated Successfully!" : "Record Not Found!");
                break;

            case 4:
                System.out.print("Enter ID to Delete: ");
                int deleteId = sc.nextInt();

                boolean deleted = students.removeIf(s -> s.id == deleteId);

                System.out.println(deleted ? "Deleted Successfully!" : "Record Not Found!");
                break;

            case 5:
                System.out.println("Program Ended");
                break;

            default:
                System.out.println("Invalid Choice!");
        }

    } while (choice != 5);

    sc.close();
}

}