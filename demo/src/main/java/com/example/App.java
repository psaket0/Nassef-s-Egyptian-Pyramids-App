package com.example;

import java.util.*;

public class App {
    // Define the pharaohs and their hieroglyphics
    static final Map<String, String> pharaohs = new HashMap<>();
    static {
        pharaohs.put("Khufu", "fb560de8bc19833811a71a4f1f200f3cbf4efc075a6252fac178eb1d21142f85");
        pharaohs.put("Djoser", "b14c10a77eabf9562f8b24a6b11aaf9df9e56d3c3f3d1f82148e4817b0ce22e8");
        // add more pharaohs as needed
    }
    
    // Define the pyramids and their contributors
    static final Map<Integer, List<String>> pyramids = new HashMap<>();
    static {
        pyramids.put(1, Arrays.asList("Khufu", "Djoser"));
        pyramids.put(2, Arrays.asList("Djoser"));
        // add more pyramids as needed
    }
    
    // Define the contributors and their contributions
    static final Map<String, Integer> contributors = new HashMap<>();
    static {
        contributors.put("Khufu", 1793);
        contributors.put("Djoser", 1362);
        // add more contributors as needed
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println("Enter a command (1-5, q):");
            System.out.println("1. List all the pharaohs");
            System.out.println("2. Displays information for a specific Egyptian pharaoh by asking the user for a pyramid id number");
            System.out.println("3. List all the pyramids and the contributors associated with them");
            System.out.println("4. Displays information for specific pyramid information by asking the user for a pyramid id number");
            System.out.println("5. Reports a list of requested pyramids without any duplicates");
            System.out.println("q. Quits the application");
            String input = scanner.nextLine().trim().toLowerCase();
            switch (input) {
                case "1":
                    listPharaohs();
                    break;
                case "2":
                    displayPharaohInfo(scanner);
                    break;
                case "3":
                    listPyramids();
                    break;
                case "4":
                    displayPyramidInfo(scanner);
                    break;
                case "5":
                    reportRequestedPyramids(scanner);
                    break;
                case "q":
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid command.");
            }
            System.out.println();
        }
    }
    
    // Command 1: List all the pharaohs
    static void listPharaohs() {
        System.out.println("Pharaohs:");
        for (String pharaoh : pharaohs.keySet()) {
            System.out.println(pharaoh);
        }
    }
    
    
