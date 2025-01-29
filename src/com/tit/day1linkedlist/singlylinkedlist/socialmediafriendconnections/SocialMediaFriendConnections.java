package com.tit.day1linkedlist.singlylinkedlist.socialmediafriendconnections;

public class SocialMediaFriendConnections {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Adding users
        list.addUser(1, "Alice", 25);
        list.addUser(2, "Bob", 22);
        list.addUser(3, "Charlie", 28);
        list.addUser(4, "Daisy", 23);

        // Adding friend connections
        list.addFriend(1, 2);
        list.addFriend(1, 3);
        list.addFriend(2, 3);
        list.addFriend(3, 4);

        // Displaying friends of a specific user
        System.out.println("Displaying friends of Alice:");
        list.displayFriends(1);

        // Finding mutual friends between users
        System.out.println("\nFinding mutual friends between Alice and Bob:");
        list.findMutualFriends(1, 2);

        // Searching for a user by name
        System.out.println("\nSearching for user named Charlie:");
        list.searchUserByName("Charlie");

        // Counting number of friends for each user
        System.out.println("\nCounting number of friends for each user:");
        list.countFriends();

        // Removing a friend connection
        System.out.println("\nRemoving friend connection between Alice and Bob:");
        list.removeFriend(1, 2);
        list.displayFriends(1);
    }
}
