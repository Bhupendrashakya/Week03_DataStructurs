package sampleproblemsofstackandqueue;

import java.util.LinkedList;
import java.util.Queue;

class PetrolPump {
    int petrol;
    int distance;

    public PetrolPump(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}

 class CircularTour {

    // Function to find the starting point of the tour
    public static int findStartingPoint(PetrolPump[] pumps) {
        int n = pumps.length;
        int start = 0;
        int end = 1;

        int curr_petrol = pumps[start].petrol - pumps[start].distance;

        // Loop to find a valid starting point
        while (end != start || curr_petrol < 0) {
            // If the current amount of petrol is less than 0, then remove the starting petrol pump from the tour
            while (curr_petrol < 0 && start != end) {
                curr_petrol -= pumps[start].petrol - pumps[start].distance;
                start = (start + 1) % n;

                // If we reach the starting point again, return -1 as no solution exists
                if (start == 0) {
                    return -1;
                }
            }
            // Add a new petrol pump to the tour
            curr_petrol += pumps[end].petrol - pumps[end].distance;
            end = (end + 1) % n;
        }

        // Return the starting point
        return start;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
                new PetrolPump(6, 4),
                new PetrolPump(3, 6),
                new PetrolPump(7, 3)
        };

        int start = findStartingPoint(pumps);

        if (start == -1) {
            System.out.println("No solution exists");
        } else {
            System.out.println("Start at petrol pump " + start);
        }
    }
}
