package com.ipl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Team {
    int teamId;
    String teamName;
    String coachName;
    ArrayList<Player> players;

    public Team() {
        players = new ArrayList<>();
    }

    public void accept(Scanner sc) {
        System.out.print("Enter Team ID: ");
        teamId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Team Name: ");
        teamName = sc.nextLine();

        System.out.print("Enter Coach Name: ");
        coachName = sc.nextLine();

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Player " + (i + 1));
            Player p = new Player();
            p.accept(sc);
            players.add(p);
        }
    }

    public void display() {
        System.out.println("\nTeam ID: " + teamId + ", Name: " + teamName + ", Coach: " + coachName);
        System.out.println("Players:");
        for (Player p : players) {
            p.display();
        }
    }

    public void deletePlayerById(int id) {
        Iterator<Player> it = players.iterator();
        while (it.hasNext()) {
            Player p = it.next();
            if (p.playerId == id) {
                it.remove();
                System.out.println("Player removed successfully.");
                return;
            }
        }
        System.out.println("Player not found.");
    }

    public void displayBySpeciality(String speciality) {
        System.out.println("Players with speciality: " + speciality);
        for (Player p : players) {
            if (p.speciality.equalsIgnoreCase(speciality))
                p.display();
        }
    }

    public void addPlayer(Scanner sc) {
        Player p = new Player();
        p.accept(sc);
        players.add(p);
    }

    public void modifyCoach(Scanner sc) {
        System.out.print("Enter new Coach Name: ");
        coachName = sc.nextLine();
        System.out.println("Coach updated successfully.");
    }

    public void displayAllBatsman() {
        System.out.println("All Batsman:");
        for (Player p : players) {
            if (p.speciality.equalsIgnoreCase("batsman"))
                p.display();
        }
    }
}
