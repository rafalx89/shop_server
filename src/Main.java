import javax.swing.JFrame;

/**
 * Glowna Klasa kt�ra uruchamia ca�y program Tworzy instancj� Klasy Ramka i
 * wy�wietla j� Ustawia domy�ln� akcje dla przycisku Exit
 * 
 * @author Rafal
 * 
 */
public class Main
{

	/**
	 * metoda main do uruchamiania ca�ego programu
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		Ramka rm = new Ramka();
		rm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ustawiamy akcje
															// dla przycisku
															// Exit
		rm.show();

	}

}
