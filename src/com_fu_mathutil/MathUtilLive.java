/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com_fu_mathutil;

/**
 *
 * @author Nhu Quynh
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
        System.out.println("5! = 120; actual: " + result);
        System.out.println("6! = 720; actual: " + MathUtil.getFactorial(6));
        System.out.println("0! = 1; actual: " + MathUtil.getFactorial(1));
        
        // Thêm code sau lần đầu tiên làm chuyện ấy 9h43AM
        System.out.println("1! = 1; actual: " + MathUtil.getFactorial(1));
        System.out.println("3! = 6; actual: " + MathUtil.getFactorial(3));

        // MathUtil.getFactorial(-5); // ném ngoại lệ
        // kĩ thuật kiểm thử phần mềm: ước lượng xem giá trị trả về của hàm là gì
        // expected value : 5! = 120
        // mày/ hàm ai đó viết khi chạy thực tế là mấy - actual, giả sử 120
        // if ex
    }

}
