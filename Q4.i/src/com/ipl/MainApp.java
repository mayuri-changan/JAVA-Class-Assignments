package com.ipl;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Team> teams = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n--- IPL Team Menu ---");
            System.out.println("1. Add New Team");
            System.out.println("2. Delete a Team");
            System.out.println("3. Delete a Player from Team");
            System.out.println("4. Display All Batsman");
            System.out.println("5. Display All Players with Speciality");
            System.out.println("6. Add New Player in Team");
            System.out.println("7. Modify Coach of Team");
            System.out.println("8. Display All Teams");
            System.out.println("9. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Team t = new Team();
                    t.accept(sc);
                    teams.add(t);
                    break;

                case 2:
                    System.out.print("Enter Team ID to delete: ");
                    int tid = sc.nextInt();
                    sc.nextLine();
                    teams.removeIf(team -> team.teamId == tid);
                    System.out.println("Team deleted successfully.");
                    break;

                case 3:
                    System.out.print("Enter Team ID: ");
                    int teamId = sc.nextInt();
                    sc.nextLine();
                    Team teamToDeletePlayer = null;
                    for (Team team : teams) {
                        if (team.teamId == teamId)
                            teamToDeletePlayer = team;
                    }
                    if (teamToDeletePlayer != null) {
                        System.out.print("Enter Player ID to delete: ");
                        int pid = sc.nextInt();
                        sc.nextLine();
                        teamToDeletePlayer.deletePlayerById(pid);
                    } else {
                        System.out.println("Team not found.");
                    }
                    break;

                case 4:
                    for (Team team : teams)
                        team.displayAllBatsman();
                    break;

                case 5:
                    System.out.print("Enter Speciality: ");
                    String spec = sc.nextLine();
                    for (Team team : teams)
                        team.displayBySpeciality(spec);
                    break;

                case 6:
                    System.out.print("Enter Team ID to add player: ");
                    int addTeamId = sc.nextInt();
                    sc.nextLine();
                    Team teamToAddPlayer = null;
                    for (Team team : teams) {
                        if (team.teamId == addTeamId)
                            teamToAddPlayer = team;
                    }
                    if (teamToAddPlayer != null)
                        teamToAddPlayer.addPlayer(sc);
                    else
                        System.out.println("Team not found.");
                    break;

                case 7:
                    System.out.print("Enter Team ID to modify coach: ");
                    int modTeamId = sc.nextInt();
                    sc.nextLine();
                    Team teamToModify = null;
                    for (Team team : teams) {
                        if (team.teamId == modTeamId)
                            teamToModify = team;
                    }
                    if (teamToModify != null)
                        teamToModify.modifyCoach(sc);
                    else
                        System.out.println("Team not found.");
                    break;

                case 8:
                    for (Team team : teams)
                        team.display();
                    break;

                case 9:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 9);

        sc.close();
    }
}
