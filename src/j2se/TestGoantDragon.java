package j2se;

public class TestGoantDragon {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GiantDragon s1 =GiantDragon.getinstance();
		GiantDragon s2 =GiantDragon.getinstance();
		GiantDragon s3 =GiantDragon.getinstance();

		Hero h1=Hero.getinstance();
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
	}

}
