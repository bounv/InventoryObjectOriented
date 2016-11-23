package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Thing createItem(String name, int quantity, String category) throws Exception {
        if(category.equalsIgnoreCase("beer")) {
            return new Beer(name, quantity);
        } else if (category.equalsIgnoreCase("wine")) {
            return new Wine(name, quantity);
        } else if (category.equalsIgnoreCase("champagne")) {
            return new Champagne(name, quantity);
        } else if (category.equalsIgnoreCase("liquor")) {
            return new Liquor(name, quantity);
        } else if (category.equalsIgnoreCase("sake")) {
            return new Sake(name, quantity);
        } else {
            return null;
        }

    }

    public static void main(String[] args) throws Exception {

        ArrayList<Thing> items = new ArrayList<>();
        Thing p = new Thing ("pen", 2, "supplies");
        items.add(p);
        Thing f = new Thing ("football", 4, "sports");
        items.add(f);
        Thing c = new Thing ("cards", 6, "entertainment");
        items.add(c);

        Scanner scanner = new Scanner(System.in);

        while(true) {
            int i = 1;
            for(Thing item : items) {
                String checkbox = "[" + item.quantity + "]";

                System.out.printf("%s %s %s %s\n", i, checkbox, item.name, item.category);
                i ++ ;
            }
            System.out.println();
            System.out.println("What do you want to do?");
            System.out.println();
            System.out.println("1. Create a new item");
            System.out.println("2. Remove an item");
            System.out.println("3. Update an item's quantity");
            System.out.println();
            System.out.println("Enter Your Numeric Choice: ");

            String option = scanner.nextLine();

            if(option.equals("1")) {

                System.out.println("Enter name of new item:");
                String text = scanner.nextLine();

                System.out.println("Set the quantity:");
                int quantity = Integer.parseInt(scanner.nextLine());

                System.out.println("Select an existing the category:");
                String category = scanner.nextLine();

                Thing item = createItem(text, quantity, category);

                items.add(item);

            } else if(option.equals("2")) {

                System.out.println("Enter number you want to remove");
                int n = Integer.parseInt(scanner.nextLine());
                items.remove(n - 1);


            } else if(option.equals("3")) {
                System.out.println("Input item number you wish to update:");

                int n = Integer.parseInt(scanner.nextLine());
                Thing t = items.get(n - 1 );
                System.out.println("Now enter the new quantity");
                int z = Integer.parseInt(scanner.nextLine());
                t.quantity = z;

            } else {
                System.out.println("Invalid Option");
            }

        }
    }

}
