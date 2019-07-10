package j2se;

public class GiantDragon {
	private GiantDragon() {
		
	}
	private static GiantDragon instance;
	public static GiantDragon getinstance() {
		if(null == instance) {
			instance=new GiantDragon();
		}
	return instance;
	} 
	
	protected static void flame() {
		System.out.println("‡Š»ð");
		System.out.println("come on baby!");
	}
	
	
}
