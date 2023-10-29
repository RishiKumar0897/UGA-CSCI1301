/*
 * Player.java
 * Author:  Rishi Kumar 
 * Submission Date:  10/29/2023
 *
 * Purpose: Class defining the player in the game
 * contains player movement and actions defined in 
 * the game
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
public class Player {
	//private instance variables
	private Lamp lamp;
	private Key key;
	private int x;
	private int y;
	
	/**
	 * Sets the key for the player
	 * 
	 * @param key
	 */
	public void setKey(Key key) {
		this.key = key;
	}
	
	/**
	 * Sets the lamp for the player
	 * 
	 * @param lamp
	 */
	public void setLamp(Lamp lamp) {
		this.lamp = lamp;
	}
	/**
	 * Returns the lamp for the player; null if no lamp in inventory
	 * 
	 * @return lamp
	 */
	public Lamp getLamp() {
		return this.lamp;
	}
	
	/**
	 * Returns the key for the player; null if no key in inventory
	 * 
	 * @return key
	 */
	public Key getKey() {
		return this.key;
	}
	
	/**
	 * Sets the x coordinate of the room the player is in
	 * 
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Sets the y coordinate of the room the player is in
	 * 
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Gets the x coordinate of the room the player is in
	 * 
	 * @return x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Gets the y coordinate of the room the player is in
	 * 
	 * @return y
	 */
	public int getY() {
		return y;
	}
	
	
}
