/** Klasse Main 
*Hier werden Zauberstäbe erstellt und verglichen
*/
public class Main {

	public static void main(String[] args) {
		
		MagicWand stab1 = new MagicWand("silber", 800); 
		MagicWand stab2 = new MagicWand("elfenbein", 500);

		if (stab1.getStrength() > stab2.getStrength()) {
			System.out.print("Der" + " " + stab1.getColor() + " " + "Phonixfeder-Zauberstab mit seinem Stark" + " " + stab1.getStrength());
			System.out.println(" ist starker als der" + " " + stab2.getColor() + " " + "Drachenherzfaser-Zauberstab mit seinem Stark" + " " 
							   + stab2.getStrength());
		} else {
			System.out.print("Der" + " " + stab2.getColor() + " " + "Drachenherzfaser-Zauberstab mit seinem Stark" + " " + stab2.getStrength());
			System.out.println(" ist starker als der" + " " + stab1.getColor() + " " + "Phonixfeder-Zauberstab mit seinem Stark " + " " 
							   + stab1.getStrength());
		}
		System.out.println("Die Zauberstaebe sind gleich:" + stab1.equals(stab2));
	}
}
	