package com.train;

import java.util.Scanner;

public class Ticket {
    double tickets;
    double roundtrip;
    double total;

    public Ticket(double tickets, double roundtrip) {
        this.tickets = tickets;
        this.roundtrip = roundtrip;

    }
    public void count(){

        total=(roundtrip*2000*0.9)+(tickets-roundtrip)*1000;
        System.out.println("Total tickes:"+tickets);
        System.out.println("Round-trip:"+roundtrip);
        System.out.println("Total:"+total);
        }


    }

