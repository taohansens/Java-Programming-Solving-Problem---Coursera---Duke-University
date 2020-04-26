package semana2.strings;

public class PositionsInStrings {

	public static void main(String[] args) {
		String s = "taohansen";
		System.out.println(s.substring(4,7));
		System.out.println(s.length());
		System.out.println(s.indexOf("hansen"));
		System.out.println(s.indexOf("n"));
		System.out.println(s.indexOf("f"));
		System.out.println(s.indexOf("n", 6));
		System.out.println(s.startsWith("tao"));
		System.out.println(s.endsWith("san"));
		
		
	}

}
