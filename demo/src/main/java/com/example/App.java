import java.util.*;

public class PyramidApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pharaoh> pharaohs = new ArrayList<>();
        List<Pyramid> pyramids = new ArrayList<>();
        
        // Add pharaohs
        pharaohs.add(new Pharaoh(1, "Khufu", "Giza"));
        pharaohs.add(new Pharaoh(2, "Sneferu", "Dahshur"));
        pharaohs.add(new Pharaoh(3, "Djoser", "Saqqara"));
        pharaohs.add(new Pharaoh(4, "Hatshepsut", "Deir el-Bahri"));
        pharaohs.add(new Pharaoh(5, "Tutankhamun", "Valley of the Kings"));

        // Add pyramids
        pyramids.add(new Pyramid(1, "Great Pyramid of Giza", "Khufu", 2.3, "million"));
        pyramids.add(new Pyramid(2, "Red Pyramid", "Sneferu", 1.69, "million"));
        pyramids.add(new Pyramid(3, "Step Pyramid", "Djoser", 0.06, "million"));
        pyramids.add(new Pyramid(4, "Mortuary Temple", "Hatshepsut", 0.75, "million"));
        pyramids.add(new Pyramid(5, "Tutankhamun's tomb", "Tutankhamun", 0.013, "million"));
        
        boolean quit = false;
        while (!quit) {
            System.out.println("Enter a command:");
            System.out.println("1: List all the pharaohs");
            System.out.println("2: Displays information for a specific Egyptian pharaoh by asking the user for a pyramid id number");
            System.out.println("3: List all the pyramids and the contributors associated with them");
            System.out.println("4: Displays information for specific pyramid information by asking the user for a pyramid id number");
            System.out.println("5: Reports a list of requested pyramids without any duplicates");
            System.out.println("q: Quits the application");
            String input = scanner.nextLine();
            
            switch (input) {
                case "1":
                    System.out.println("List of all pharaohs:");
                    for (Pharaoh pharaoh : pharaohs) {
                        System.out.println(pharaoh.getId() + ": " + pharaoh.getName());
                    }
                    break;
                case "2":
                    System.out.println("Enter the pharaoh id number:");
                    int pharaohId = scanner.nextInt();
                    scanner.nextLine();
                    for (Pharaoh pharaoh : pharaohs) {
                        if (pharaoh.getId() == pharaohId) {
                            System.out.println("Pharaoh name: " + pharaoh.getName());
                            System.out.println("Pyramid location: " + pharaoh.getPyramidLocation());
                        }
                    }
                    break;
                case "3":
                    System.out.println("List of all pyramids and the contributors associated with them:");
                    for (Pyramid pyramid : pyramids) {
                        System.out.println(pyramid.getId() + ": " + pyramid.getName() + " (built by " + pyramid.getPharaohName() + ")");
                        for (Contributor contributor : pyramid.getContributors()) {
                            System.out.println("- " + contributor.getName() + ": " + contributor.getGold() + " " + pyramid.getCurrency());
                        }
                    }
                    break;
                case "4":
                    System.out.println("Enter the pyramid id number:");
                    int
