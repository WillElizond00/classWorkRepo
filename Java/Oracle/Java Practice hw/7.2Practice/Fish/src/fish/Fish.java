/*
William Elizondo

*/


package fish;

/**
 *
 * @author deck
 */
public class Fish {

    String typeOfFish;
    int friendliness;

    // Default constructor
    public Fish() {
        typeOfFish = "unknown";
        friendliness = 3;
    }

    // Constructor with parameters
    public Fish(String t, int f) {
        typeOfFish = t;
        friendliness = f;
    }

    // Getter method for friendliness
    public int getFriendliness() {
        return friendliness;
    }

    // Method to find the nicest fish from a variable number of Fish objects
    public static Fish nicestFish(Fish... fishArray) {
        // Check if no fish are passed
        if (fishArray.length == 0) {
            return null;
        }

        // Initialize temp to the first fish in the array
        Fish temp = fishArray[0];

        // Loop through all fish in the array
        for (Fish fish : fishArray) {
            if (fish.getFriendliness() > temp.getFriendliness()) {
                temp = fish; // Update temp if a friendlier fish is found
            }
        }

        // Return the nicest fish (temp)
        return temp;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initializing fish objects with types and friendliness levels
        Fish fish1 = new Fish("AngelFish", 5); // AngelFish with friendliness 5
        Fish fish2 = new Fish("Guppy", 3);     // Guppy with friendliness 3
        Fish fish3 = new Fish("Goldfish", 4);  // Goldfish with friendliness 4

        // Finding the nicest fish
        Fish nicest = nicestFish(fish1, fish2, fish3); // nicestFish now accepts a variable number of arguments

        // Displaying the type and friendliness level of the nicest fish
        System.out.println("The nicest fish is: " + nicest.typeOfFish + " with a friendliness level of " + nicest.getFriendliness());
    } // end of main
} // end of class
