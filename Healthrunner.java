class Healthrunner{
	public static void main(String[] args){
		Health health = new Health();
		char input = 0;
		int damage = 0;
		while(!health.dead()){
			System.out.println(health);
			damage = -6 + (int)(Math.random()*13);
			switch (input){
				case 'Q':
					break;
				case 'q':
					break;
				default:
					System.out.println(health.takeDamage(damage));
					break;	
			}
		}
		if(health.dead()){
			System.out.println("dead");
		}
	}
}
