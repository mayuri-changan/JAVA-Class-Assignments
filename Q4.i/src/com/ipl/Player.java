/*Q4. Use employee class to store id,name,sal,dept and designation.
a. Use HashSet to store multiple employee objects. Add required functions in the appropriate
class.
No duplicate employee entries are allowed.
-2 Employee objects are same if their id is same
b. b. Use Treemap to store multiple Employee objects. Add required functions in the
appropriate class.
Product assignment
Class Product
Id, name, type (perishable/nonperishable)
Mfgdate,
For perishable
Exp-date
Price
Nonperishable ---- category (furniture, statitionary, utensils)
CalculateTax()
If product is perishable then tax = 5% of price
Otherwise
Tax= 15% of price+100

1. Write a program to store information about IPL teams in ArrayList
Create Team class to store teamid, tname, coachname, and list of players.
and perform following operations
1. add new Team
2. delete a team
3. delete a player from team(accept player id to delete)
4. display all batsman
5. display all player with a speciality(accept speciality from user)
6. add a new player in a team
7. modify coach of a team
8. exit */

package com.ipl;

import java.util.Scanner;

public class Player {
    int playerId;
    String playerName;
    String speciality; // e.g., batsman, bowler, all-rounder

    public void accept(Scanner sc) {
        System.out.print("Enter Player ID: ");
        playerId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Player Name: ");
        playerName = sc.nextLine();

        System.out.print("Enter Speciality: ");
        speciality = sc.nextLine();
    }

    public void display() {
        System.out.println("ID: " + playerId + ", Name: " + playerName + ", Speciality: " + speciality);
    }
}

