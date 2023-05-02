package com.example;

import java.util.*;

public class App {
    
    private static Map<String, List<String>> pyramids;
    private static Map<String, Integer> goldContributions;
    private static Set<String> requestedPyramids;
    
    public static void main(String[] args) {
        pyramids = new HashMap<>();
        goldContributions = new HashMap<>();
        requestedPyramids = new HashSet<>();
        
        // populate pyramids map
        pyramids.put("Pyramid 1", Arrays.asList("Pharaoh 1", "Pharaoh 2"));
        pyramids.put("Pyramid 2", Arrays.asList("Pharaoh 2", "Pharaoh 3"));
        pyramids.put("Pyramid 3", Arrays.asList("Pharaoh 1", "Pharaoh 3"));
        
        // populate gold contributions map
        goldContributions.put("Pharaoh 1", 100);
        goldContributions.put("Pharaoh 2", 200);
        goldContributions.put("Pharaoh 3", 300);
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("............Nassef's Egyptian Pyramid App................");
            System.out.println("Command       Description");
            System.out.println("..............");
            System.out.println("1             List all of the pyramids and the contributors associated with them");
            System.out.println("2             Display information for a specific pyramid");
            System.out.println("3             Display a list of requested pyramids");
            System.out.println("4             Display information for a specific pyramid by id number");
            System.out.println("5             Report a list of requested pyramids without any duplicates");
            System.out.println("q             Quit the application");
            System.out.println("..........................................................");
            System.out.print("Enter a command: ");
            
            String command = scanner.nextLine();
            
            switch (command) {
                case "1":
                    listPyramids();
                    break;
                case "2":
                    displayPyramidInfo(scanner);
                    break;
                case "3":
                    listPyramids();
                    break;
                case "4":
                    displayPyramidInfo(scanner);
                    break;
                case "5":
                    reportRequestedPyramidsWithoutDuplicates();
                    break;
                case "q":
                    System.out.println("Quitting application...");
                    System.exit(0);
                default:
                    System.out.println("Invalid command. Please try again.");
                    break;
            }
        }
    }
    
    private static void reportRequestedPyramidsWithoutDuplicates() {
    }

    private static void listPyramids() {
        System.out.println("List of all pyramids and contributors:");
        for (Map.Entry<String, List<String>> entry : pyramids.entrySet()) {
            String pyramid = entry.getKey();
            List<String> contributors = entry.getValue();
            System.out.println(pyramid + ": " + contributors);
        }
    }
    
    private static void displayPyramidInfo(Scanner scanner) {
        System.out.print("Enter the name of the pyramid you want information on: ");
        String pyramid = scanner.nextLine();
        
        List<String> contributors = pyramids.get(pyramid);
        if (contributors == null) {
            System.out.println("Pyramid not found.");
            return;
        }
        
        System.out.println("Information for " + pyramid + ":");
        int totalGold = 0;
        for (String contributor : contributors) {
            int gold = goldContributions.getOrDefault(contributor, 0);
            totalGold += gold;
            System.out.println(contributor + " contributed " + gold + " gold.");
        }
        System.out.println("Total gold contributed: " + totalGold);
        requestedPyramids.add(pyramid);
    }
}