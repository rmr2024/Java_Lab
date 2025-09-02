package datatypedemo;

public class SpaceTravel {
	
	public static void main(String[] args) {
		
		double distance_to_moon = 384400;
		float speed = 27.5f;
		byte crewmember=3;
		boolean oxygen_available = true;
		char rocketCode='w';
		double timeTravel = distance_to_moon/(speed*3600);
		System.out.println("RocketCode: " + rocketCode);
		System.out.println("Crew Members: " + crewmember);
		System.out.println("Oxygen available: " + oxygen_available);
		System.out.println("Travel time: " + timeTravel + " hours");
	}

}
