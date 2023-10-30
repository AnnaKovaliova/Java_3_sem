package bsu.rfct.course2.group6.kovaliova;

import java.util.Scanner;

//Apple/Big Cheese Burger/Big Burger/Small

public class Main {
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        Scanner scanner = new  Scanner(System.in);
        
        System.out.println("Введите завтрак:");

        String input = scanner.nextLine();
        String[] buff = input.split(" ");

        int itemsSoFar = 0;

        for (String arg: buff) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            } else if (parts[0].equals("Burger")){
                breakfast[itemsSoFar] = new Burger(parts[1]);
            }
            itemsSoFar++;
        }
    for (Food item: breakfast)
        if (item!=null)
            item.consume();
        else
            break;
    
    }
}