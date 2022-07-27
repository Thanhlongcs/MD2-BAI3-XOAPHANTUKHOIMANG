package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //B1: Khởi tạo mảng cho trước
        int[] number = {4, 12, 7, 8, 1, 6, 9};
        Scanner scanner = new Scanner(System.in);

        //B2: Nhập vào phần tử cần xóa
        System.out.println("Enter number that you want to delete: ");
        int delete_number = scanner.nextInt();
        boolean isExist = false;

        //B3: Kiểm tra phần tử nhập vào có tồn tại trong mảng không. Nếu có in lấy ra vị trí của nó.
        // Giả sử vị trí của phần tử cần xóa là 0
        int index_delete = 0;
        for (int i = 0; i <= number.length + 1; i++) {
            if (number[i] == delete_number) {
                index_delete = i;
                System.out.println("Position of the number in list is: " + (index_delete +1 ));
                isExist = true;
                break;
            }
        }

        //B4: Nếu phần tử nhập vào không tồn tại, hiển thị lại cho user. Nếu có tồn tại, thực hiện xóa.
        if (isExist) {
            for (int i = index_delete; i < number.length-1 ; i++) {
                // Thực hiện gán phần tử thứ index+1 cho cho phần tử ở bị trí index. - Nói khác đi là dịch các phần từ sang trái
                number[i] = number[i + 1];
            }

            //In ra mảng sau khi xóa
            System.out.println("After delete: ");
            for (int i = 0; i < number.length - 1; i++) {
                System.out.print(number[i] + "\t");
            }
        }
    }
}