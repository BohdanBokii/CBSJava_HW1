package org.example.MazeRunner;

public class Main {
    public static void main(String[] args) {
        String result = "";
        System.out.println("Hello? my dear student!");
        System.out.println("Lets read your arguments:");
        for (int i = 0; i < args.length; i++) {
            result = result + " " + args[i];
        }
        System.out.println(result);
    }
}
