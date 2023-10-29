import java.util.Scanner;
/*

 * Adventure.java
 * Author:  Rishi Kumar 
 * Submission Date:  10/29/2023
 *
 * Purpose: The main entry point of the game.
 * Uses the implementations of the other classes
 * to actually implement the gameplay
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither 
 * received nor given inappropriate assistance. I have not copied 
 * or modified code from any source other than the course webpage 
 * or the course textbook. I recognize that any unauthorized 
 * assistance or plagiarism will be handled in accordance with 
 * the University of Georgia's Academic Honesty Policy and the 
 * policies of this course. I recognize that my work is based 
 * on an assignment created by the School of Computing 
 * at the University of Georgia. Any publishing or
 * posting of source code for this assignment is strictly 
 * prohibited unless you have written consent from the 
 * School of Computing at the University of Georgia.  
 */
public class Adventure {

	public static void main(String[] args) {
		//scanner
		Scanner scan = new Scanner(System.in);
		//intro
		System.out.println("Welcome to UGA Adventures: Episode I");
		System.out.println("The Adventure of the Cave of Redundancy Adventure");
		System.out.println("By: Rishi Kumar");
		//boolean variables to control loops
		boolean playerAlive = true, keepPrompting = true;
		//instantiating objects for main class
		Player player = new Player();
		Map map = new Map();
		Room room = map.getRoom(0, 0);
		player.setX(0);
		player.setY(0);
		Lamp playerLamp = null;
		Key playerKey = null;
		Chest chest = null;
		//game loop
		while(playerAlive) {
			System.out.println(room.getDescription());
			//prompt loop
			while(keepPrompting) {
				//takes the input and ensures that any case will work
				String action = scan.nextLine();
				action = action.toLowerCase();
				//handles each input
				switch (action) {
					case "get lamp":
						playerLamp = room.getLamp();
						if (playerLamp != null) {
							player.setLamp(playerLamp);
							room.clearLamp();
							System.out.println("OK");
						}
						else {
							System.out.println("No lamp present");
						}
						break;
						
					case "light lamp":
						if (player.getLamp() != null) {
							playerLamp.lightLamp();
							System.out.println("OK");
						}
						else {
							System.out.println("You don't have the lamp to light");
						}
						break;
					case "north":
						if (room.isDark() == true && (player.getLamp() == null || (player.getLamp() != null && playerLamp.isLampLit() == false))) {
							System.out.println("You have stumbled into a passing grue, and have been eaten");
						}
						else {
							if (room.canGoNorth() == true) {
								player.setX(player.getX() - 1);
								room = map.getRoom(player.getX(), player.getY());
								if ((room.isDark() == true && player.getLamp() == null) || (player.getLamp() != null && playerLamp.isLampLit() == false)) {
									System.out.println("It is pitch black, you can't see anything. You may be eaten by a grue!");
								}
								else {
									System.out.println(room.getDescription());
								}
							}
							else {
								System.out.println("Can't go that way");
							}
						}
						break;
						
					case "south":
						if (room.isDark() == true && (player.getLamp() == null || (player.getLamp() != null && playerLamp.isLampLit() == false))) {
							System.out.println("You have stumbled into a passing grue, and have been eaten");
						}
						else {
							if (room.canGoSouth() == true) {
								player.setX(player.getX() + 1);
								room = map.getRoom(player.getX(), player.getY());
								if ((room.isDark() == true && player.getLamp() == null) || (player.getLamp() != null && playerLamp.isLampLit() == false)) {
									System.out.println("It is pitch black, you can't see anything. You may be eaten by a grue!");
								}
								else {
									System.out.println(room.getDescription());
								}
							}
							else {
								System.out.println("Can't go that way");
							}
						}
						break;
						
					case "east":
						if (room.isDark() == true && (player.getLamp() == null || (player.getLamp() != null && playerLamp.isLampLit() == false))) {
							System.out.println("You have stumbled into a passing grue, and have been eaten");
						}
						else {
							if (room.canGoEast() == true) {
								player.setY(player.getY() + 1);
								room = map.getRoom(player.getX(), player.getY());
								if ((room.isDark() == true && player.getLamp() == null) || (player.getLamp() != null && playerLamp.isLampLit() == false)) {
									System.out.println("It is pitch black, you can't see anything. You may be eaten by a grue!");
								}
								else {
									System.out.println(room.getDescription());
								}
							}
							else {
								System.out.println("Can't go that way");
							}
						}
						break;
						
					case "west":
						if (room.isDark() == true && (player.getLamp() == null || (player.getLamp() != null && playerLamp.isLampLit() == false))) {
							System.out.println("You have stumbled into a passing grue, and have been eaten");
						}
						else {
							if (room.canGoWest() == true) {
								player.setY(player.getY() - 1);
								room = map.getRoom(player.getX(), player.getY());
								if ((room.isDark() == true && player.getLamp() == null) || (player.getLamp() != null && playerLamp.isLampLit() == false)) {
									System.out.println("It is pitch black, you can't see anything. You may be eaten by a grue!");
								}
								else {
									System.out.println(room.getDescription());
								}
							}
							else {
								System.out.println("Can't go that way");
							}
						}
						break;
					case "look":
						if (room.isDark() == true && (player.getLamp() == null || playerLamp.isLampLit() == false)) {
							System.out.println("It is pitch black, you can't see anything. You may be eaten by a grue!");
						}
						else {
							System.out.println(room.getDescription());
							System.out.print("Exits are: ");
							if (room.canGoNorth() == true) {
								System.out.println("north");
							}
							if (room.canGoSouth() == true) {
								System.out.println("south");
							}
							if (room.canGoEast() == true) {
								System.out.println("east");
							}
							if (room.canGoWest() == true) {
								System.out.println("west");
							}
							if (room.getLamp() != null) {
								System.out.println("There is an old oil lamp that was made long ago here.");
							}
							if (room.getKey() != null) {
								System.out.println("You see the outline of a key on a dusty shelf that's covered in dust.");
							}
							if (room.getChest() != null) {
								System.out.println("There is a large, wooden, massive, oaken chest here with the word \"CHEST\" carved into it");
							}
						}
						break;
					case "get key": 
						playerKey = room.getKey();
						if (playerKey != null) {
							player.setKey(playerKey);
							room.clearKey();
							System.out.println("OK");
						}
						else {
							System.out.println("No key present");
						}
						break;
						
					
					case "unlock chest": 
						chest = room.getChest();
						if (player.getKey() != null) {
							if (chest == null) {
								System.out.println ("No chest to unlock.");
							}
							else {
								playerKey.use(chest);
								System.out.println ("OK");
							}
						}
						else {
							if (chest == null) {
								System.out.println ("No chest to unlock.");
							}
							else {
								System.out.println ("Need a key to do any unlocking!");
							}
						}
						break;
						
					case "open chest": 
						chest = room.getChest();
						if (chest != null && chest.isLocked() == false) {
							System.out.println(chest.getContents());
							keepPrompting = false;
							System.exit(1);
						}
						else {
							if (chest != null && chest.isLocked() == true) {
								System.out.println("The chest is locked");
							}
							else if (chest == null) {
								System.out.println("No chest present");
							}
						}
						
						break;
						
					default: 
						System.out.println("I'm sorry I don't know how to do that.");
						break;
				} 
			}
				
		}
			playerAlive = false;
	}

}


