/**
*Klasse Zauberstab
*Erstellt einen Zauberstab,
*der die Farbe und die Stärke hat
*/ 
public class MagicWand {

    //Attribute
	private String color;
	private int strength;
	
	/**
	*Konstruktor Zauberstab
	*nimmt Farbe und Stärke an
	*@param color gibt die Farbe zurück
	*@param strength gibt die Stärke zurück
	*/ 
	
	public MagicWand(String color, int strength) {
		this.color = color;
		this.strength = strength;
	}
	
	/**
	*Gibt die Farbe zurück
	*@return color = Farbe 
	*/ 
	public String getColor() {
		return this.color;
	}

	/**
	*Gibt die Stärke zurück
	*@return strength = Stärke 
	*/

	public int getStrength() {
		return this.strength;
	}
	
	/**
	*Überschriebene equals() Methode,
	*vergleicht Farben und Stärken von Zauberstäbe
	*@param x ist Referenzobjekt
	*@return false, falls Farben oder Stärken sich unterscheiden voneinander
	*und true, falls beide gleich sind 
	*/
	
	public boolean equals(Object x) {

		MagicWand stab = (MagicWand) x;
		
		if (stab.getColor() != this.getColor()) {
			return false;
		}

		if (stab.getStrength() != this.getStrength()) {
			return false;
		}
		return true;
	}
}
