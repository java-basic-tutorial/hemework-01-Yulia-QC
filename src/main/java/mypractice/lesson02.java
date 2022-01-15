package mypractice;

import java.time.LocalDateTime;

public class lesson02 {
    public static void main(String[] args) {
        int hour = LocalDateTime.now().getHour();
        if(hour >= 9 && hour <= 18) {
            System.out.println("Work time");
        } else {
            System.out.println("My time");
        }
        if (hour < 9 || hour > 18) {
            System.out.println("My time");
        }


    }
}
