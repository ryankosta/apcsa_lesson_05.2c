import java.util.Scanner;
class Healthrunner{
	private Health health;
	private Scanner kb;
	public Healthrunner(){
		health = new Health();
		kb = new Scanner(System.in);
	}
	public void loop(){
		do {
			System.out.println("Your turn! Hit Enter when ready");
		} while (!health.dead() && prompt(getinchar()));
		if (health.dead()){
			System.out.println("You Died!!!");
		}
	}
	private char getinchar(){
		String nextline = kb.nextLine();
		if(nextline.length() > 0)
			return(nextline.charAt(0));
		return(0);
	}
	private boolean prompt(char in){
		int damage = 0;
		switch (in){
			case 'Q':
				return(false);
			case 'q':
				return(false);
			default:
				damage = -6 + (int)(Math.random()*13);
				System.out.println(health.takeDamage(damage));
				break;	
		}
		return(true);
	}
	public static void main(String[] args){
		Healthrunner hrunner = new Healthrunner();
		hrunner.loop();
	}

}
