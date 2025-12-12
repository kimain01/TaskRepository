package taskgit;

public class B {

	public static void main(String[] args)
	{
		System.out.println("B.java도 만듦 ...");
		System.out.println("6번 명령대로 수정할거임 이제 c호출해봄");
		C c = new C();
		c.printC();
	}

}
