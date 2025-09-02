package datatypedemo;

public class RoadMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Non-Primitive DataType
		String studentName="Meenakshi";
		String[] roadmap= {
				"1st Year: Master Program Fundamentals",
				"2nd Year: Explore AI",
				"3rd Year: Internship in Tech Companies",
				"4th Year: Innovative projects",
				"After B.Tech: Masters or Job in Tech Companies"
		};
		System.out.println("------------------------");
		System.out.println("     Career RoadMap     ");
		System.out.println("------------------------");
		System.out.println("Student Name: " + studentName);
		
		for(String step:roadmap) {
			System.out.println("=> " + step);
		}
	}

}
