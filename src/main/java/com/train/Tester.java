package com.train;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = getTicket();
        ticket.count();
    }

    @NotNull
    private static Ticket getTicket() {
        System.out.println("Please enter number of tickets:");
        Scanner scanner=new Scanner(System.in);
        double tickets=scanner.nextDouble();
        System.out.println("How many round-trip tickets:");
        double roundtrip =scanner.nextDouble();
        return new Ticket(tickets,roundtrip);
    }
}
