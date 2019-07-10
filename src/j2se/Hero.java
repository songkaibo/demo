package j2se;

public class Hero {
	private String name;
	private float hp;
	private static String copyright;
	private Hero() {
		
	}
	private static Hero instance;
	public static Hero getinstance() {
		if(null==instance) {
		instance=new Hero();
		}
		return instance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero gareen = new Hero();
		gareen.name="蓋倫";
		gareen.hp=500;
		gareen.copyright="版權由Riot game 公司所有";
		System.out.println(gareen.name);
		System.out.println(gareen.hp);
		System.out.println(gareen.copyright);
		
		Hero teemo = new Hero();
		teemo.name="提莫";
		teemo.hp=200;
		System.out.println(teemo.copyright);
		System.out.println(teemo.hp);
	
	}

}
