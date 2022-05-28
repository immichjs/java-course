
public class StringMethods {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(6, 11);
		String s06 = original.replace('a', '-');
		int bc = original.indexOf("bc");
		int lbc = original.lastIndexOf("bc");
		String fruits = "apple lemon";
		String[] arrFruits = fruits.split(" ");
		String apple = arrFruits[0];
		String lemon = arrFruits[1];
		
		System.out.println("Original > " + original);
		System.out.println("toLowerCase > " + s01);
		System.out.println("toUpperCase > " + s02);
		System.out.println("trim > " + s03);
		System.out.println("substring(2) > " + s04);
		System.out.println("substring(6, 11) > " + s05);
		System.out.println("replace > " + s06);
		System.out.println("indexOf > " + bc);
		System.out.println("lastIndexOf > " + lbc);
		System.out.println("split > " + lemon + " " + apple);
	}

}
