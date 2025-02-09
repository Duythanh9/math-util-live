/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com_fu_mathutil;
// Ta viết cái Class để cung cấp tiện ích cho nơi khác xài
//Khi ta cung cấp tiện ích cho nơi khác xài, đó là lúc ta 
// ko cần nhớ cái gì cho riêng ta, hàm Static giúp làm điều này
//
public class MathUtil {
    
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0 .. 20");
        // hàm dừng liền éo cần return
        
        // xuống đây là n = 0..20 òi
        if(n == 0 || n == 1 )
            return 1; // dừng ngay khi n đặc biệt
        
        //xuống đến đây, n = 2..20 òi
        // chơi for hoặc đệ quy - recursion
        // kĩ thuật nhồi con heo đất, ốc bu dồn thịt
        // i = 2, i = 3, i = 4, i = 5, i = n nhồi liên tục i vào tích
        long product = 1; // tích khởi đầu = 1, nhồi 2.... n
        for(int i = 2; i <= n; i++)
            product *= i;
        // nhân từ 2 đến 
        return product;
    }
    
}
