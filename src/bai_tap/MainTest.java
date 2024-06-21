package bai_tap;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        ManagementSystem managementSystem = new ManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn chức năng theo số (để tiếp tục):");
            System.out.println("1. Thêm mới giảng viên hoặc học sinh");
            System.out.println("2. Xóa giảng viên hoặc học sinh");
            System.out.println("3. Xem danh sách giảng viên hoặc học sinh");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    managementSystem.addPerson();
                    break;
                case 2:
                    managementSystem.deletePerson();
                    break;
                case 3:
                    managementSystem.viewlist();
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}


