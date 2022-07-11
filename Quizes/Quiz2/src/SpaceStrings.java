
public class SpaceStrings {
	
	public int getStringLength(String str) {
		return str.length();
	}
	
	public int getLetterPosition(String str, char ch) {
		return str.indexOf(ch);
	}
	
	public String makeAllCaps(String str) {
		return str.toUpperCase();
	}
	
	public String makeAllLower(String str) {
		return str.toLowerCase();
	}
	
	public String makeHugeString(String str1, String str2) {
		return str1.concat(str2);
	}

	public static void main(String[] args) {
		SpaceStrings space = new SpaceStrings();
		
		String starman = "Starman Sez";
		String rocketship = "Red Tesla";

		System.out.println(space.getStringLength(starman));
		System.out.println(space.getLetterPosition(starman, 'r'));
		System.out.println(space.makeAllCaps(starman));
		System.out.println(space.makeAllLower(starman));
		System.out.println(space.makeHugeString(starman, rocketship));

	}

}
