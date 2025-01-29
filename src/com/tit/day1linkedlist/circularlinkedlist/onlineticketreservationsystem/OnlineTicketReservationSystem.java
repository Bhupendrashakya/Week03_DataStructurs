package com.tit.day1linkedlist.circularlinkedlist.onlineticketreservationsystem;

public class OnlineTicketReservationSystem {
    public static void main(String[] args) {
        CircularLinkedList reservationSystem = new CircularLinkedList();

        // Adding tickets
        reservationSystem.addTicket(101, "Alice", "Avatar 2", "A1", "10:00 AM");
        reservationSystem.addTicket(102, "Bob", "Inception", "B2", "12:00 PM");
        reservationSystem.addTicket(103, "Charlie", "Avatar 2", "A2", "10:00 AM");

        // Displaying all tickets
        System.out.println("\nDisplaying all tickets:");
        reservationSystem.displayTickets();

        // Searching for tickets
        System.out.println("\nSearching for tickets by Customer Name:");
        reservationSystem.searchTicket("Alice");

        System.out.println("\nSearching for tickets by Movie Name:");
        reservationSystem.searchTicket("Inception");

        // Removing a ticket
        System.out.println("\nRemoving a ticket with ID 102:");
        reservationSystem.removeTicket(102);
        reservationSystem.displayTickets();

        // Counting total tickets
        System.out.println("\nCounting total tickets:");
        reservationSystem.countTickets();
    }
}
