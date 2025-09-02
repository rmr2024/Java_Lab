package datatypedemo;

class GP{
	GP()
	{
		//super();
		System.out.println("Class A");
	}
}

class P{
	P()
	{
		System.out.println("Class B");
	}
}

class C{
	C()
	{
		super();
		System.out.println("Class C");
	}
}

public class MainSuperKey {

	public static void main(String[] args) {
		C c1= new C();
	}
}