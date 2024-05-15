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

    // Method to find the nicest fish
    public static Fish nicestFish(Fish f1, Fish f2) {
        if (f1.getFriendliness() > f2.getFriendliness()) {
            return f1;
        } else {
            return f2;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initializing fish objects with types and friendliness levels
        Fish fish1 = new Fish("AngelFish", 5); // AngelFish with friendliness 5
        Fish fish2 = new Fish("Guppy", 3);     // Guppy with friendliness 3

        // Finding the nicest fish
        Fish nicest = nicestFish(fish1, fish2); // This should call the nicestFish method

        // Displaying the type and friendliness level of the nicest fish
        System.out.println("The nicest fish is: " + nicest.typeOfFish + " with a friendliness level of " + nicest.getFriendliness());
    } //end of main
} // end of class 
