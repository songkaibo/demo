package j2se;

public class TestSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season season=Season.AUTUMN;
		switch(season) {
		case SPRING:
			System.out.println("春天");
			break;
		case AUTUMN:
			System.out.println("秋天");
			break;
		case SUMMER:
			System.out.println("夏天");
			break;
		case WINTER:
			System.out.println("冬天");
			break;
		}
	}

}
