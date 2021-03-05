class Health{
	private int HEALTHLOAD = 6;
	private int healthcount;
	public Health(){
		healthcount = HEALTHLOAD;
	}
	public String takeDamage(int health){
		String message = "";
		if (health + healthcount <= HEALTHLOAD) {
			healthcount += health;
		}
		if (health > 0) {
			message = "Power up +"+health;
		}
		else {
			message = "taking " + (-1 * health) + " damage";
		}
		
		return(message);
	}
	public String toString(){
		String message = "";
		int i = 0;
		while (i < healthcount) {
			message += " @ ";
			i++;
		}
		while (i < HEALTHLOAD) {
			message += "[ ]";
			i++;
		}
		return(message);
	}
	public boolean dead(){
		return(healthcount <= 0);
	}
}
