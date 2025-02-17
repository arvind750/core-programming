// package core-programming.java-control-flows.level1-problems;

import java.util.*;
 class RocketFORLOOPLaunchCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the countdown start value: ");
        int counter = sc.nextInt();
        
        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        
        System.out.println("Liftoff! ");
    }
}
