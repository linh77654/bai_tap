package bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagementSystem {
    ArrayList<Person> persons = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addPerson() {
        System.out.println("Thêm mới giảng viên hoặc học sinh:");
        System.out.println("1. Thêm mới học sinh");
        System.out.println("2. Thêm mới giảng viên");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập mã: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String birthDate = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        String gender = scanner.nextLine();

        if (choice == 1) {
            System.out.print("Nhập lớp: ");
            String className = scanner.nextLine();
            System.out.print("Nhập điểm số: ");
            double score = scanner.nextDouble();
            Student student = new Student(id, name, birthDate, gender, className, score);
            persons.add(student);
        } else if (choice == 2) {
            System.out.print("Nhập chuyên môn: ");
            String specialization = scanner.nextLine();
            Teacher teacher = new Teacher(id, name, birthDate, gender, specialization);
            persons.add(teacher);
        } else {
            System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    public void deletePerson() {
        System.out.print("Nhập mã học sinh hoặc giáo viên cần xóa");
        String id = scanner.nextLine();
        Person personToDelete = null;

        for (Person person : persons) {
            if (person.getId().equals(id)) {
                personToDelete = person;
                break;
            }
        }
        if (personToDelete != null) {
            System.out.println("Bạn có muốn xóa không (Yes/No) ");
            String confirmation = scanner.nextLine();

            if (confirmation.equalsIgnoreCase("Yes")) {
                persons.remove(personToDelete);
                System.out.println("Đã xóa lựa chọn");
            } else {
                System.out.println("Hủy xoá");
            }
        } else {
            System.out.println("không tìm thấy danh sách bạn chọn");
        }
    }

    public void viewlist() {
        System.out.println("Danh sách học sinh và giáo viên");
        for (Person person : persons) {
            System.out.println("Mã" + person.getId());
            System.out.println("Tên" + person.getName());
            System.out.println("Ngày sinh" + person.getBirthDate());
            System.out.println("Giới tính" + person.getGender());

            if (person instanceof Student) {
                Student student = (Student) person;
                System.out.println("Lớp" + student.getClassName());
                System.out.println("Điểm số" + student.getScore());
            } else
                if(person instanceof Teacher) {
                    Teacher teacher =(Teacher) person;
                    System.out.println("Chuyen môn"+ teacher.getSpecialization());
                }
        }
    }

}


