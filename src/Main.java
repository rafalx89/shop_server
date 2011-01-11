import javax.swing.JFrame;

/**
 * Glowna Klasa która uruchamia ca³y program Tworzy instancjê Klasy Ramka i
 * wyœwietla j¹ Ustawia domyœln¹ akcje dla przycisku Exit
 * 
 * @author Rafal
 * 
 */
public class Main
{

	/**
	 * metoda main do uruchamiania ca³ego programu
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
