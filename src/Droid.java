/**
 * This program defines a Droid class that models a simple robot with a name and battery level.
 * The Droid can perform tasks that consume battery power, report its current energy level,
 * and transfer energy to another Droid.
 */

public class Droid {
    int batteryLevel; // Variable to store the battery level of the Droid
    String name;      // Variable to store the name of the Droid

    // Constructor to initialize a new Droid with a specified name and a full battery level
    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    // Method to return a string representation of the Droid
    public String toString() {
        return "Hello, I'm the droid: " + name;
    }

    // Method for the Droid to perform a task, which reduces its battery level by 10
    public void performTask(String task) {
        System.out.println(name + " is performing the task: " + task);
        batteryLevel -= 10;
    }

    // Method to report the current battery level of the Droid
    public void energyReport() {
        System.out.println(name + " battery level right now is: " + batteryLevel);
    }

    // Method to transfer energy from this Droid to another Droid
    public void energyTransfer(Droid otherDroid, int amount) {
        this.batteryLevel -= amount;
        otherDroid.batteryLevel += amount;

        System.out.println(this.name + " successfully transferred " + amount + " charges to " + otherDroid.name);
        System.out.println(this.name + " charge is now at: " + this.batteryLevel +
                " and " + otherDroid.name + " charge is now at: " + otherDroid.batteryLevel);
    }

    // Main method to demonstrate the use of the Droid class
    public static void main(String[] args) {
        Droid codey = new Droid("Codey");    // Create a new Droid named Codey
        Droid stanley = new Droid("Stanley"); // Create another Droid named Stanley

        System.out.println(codey.name); // Print the name of Codey

        // Codey performs some tasks
        codey.performTask("washing dishes");
        codey.performTask("mopping floors");
        codey.performTask("doing push-ups");

        // Codey reports its current battery level
        codey.energyReport();

        // Codey transfers 20 units of energy to Stanley
        codey.energyTransfer(stanley, 20);
    }
}