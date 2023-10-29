
public class Lamp {

	/*
	 * Instance variables and methods go here, you're responsible for 
	 * choosing and naming them.
	 */
	
	//private instance variables
	private boolean lampLit = false;
	
	/**
	 * Gets the boolean value of whether lamp is lit
	 * 
	 * @return lampLit
	 */
	public boolean isLampLit() {
		return this.lampLit;
	}
	
	/**
	 * Lights the lamp
	 * 
	 */
	public void lightLamp() {
		lampLit = true;
	}

	
}
