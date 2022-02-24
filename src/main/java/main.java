package main.java;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                You wake up feeling well rested. What do you do first?
                 A: Look out the front window.
                 B: Drink water out of your bowl.
                 C: Go to your humans door and whine until they wake up.""");
        String input = scan.nextLine();
        if (input.equalsIgnoreCase("A")){
            System.out.println("""
            You look out the window and see that pesky child on his two round legs throwing paper at houses""");
            Scanner sc = new Scanner(System.in);
        } else if (input.equalsIgnoreCase("B")){
            System.out.println("""
                    You quench your thirst with delicious water.""");
        } else if (input.equalsIgnoreCase("C")){
            System.out.println("""
                    Your human is awake. He does not look happy""");
        } else {
            System.out.println("""
                    Please choose A, B, or C.
                    A: Look out the front window.
                     B: Drink water out of your bowl.
                    C: Go to your humans door and whine until they wake up.""");
        }
    }
}
