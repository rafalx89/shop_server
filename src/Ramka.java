import java.awt.Container;

import javax.swing.*;
/**
 * Klasa Ramka w której bêdzie zamieszczony JPanel: GlownyPanel
 * 
 * @author Rafal
 * 
 */
public class Ramka extends JFrame
{
	/**
	 * Tworzy instancje GlownyPanel Ustawia rozdzielczoœæ Tworzy instancje
	 * Kontenera i umieszcza w nim GlownyPanel Ustawia Ramke na widoczn¹
	 */
	public Ramka()
	{
		GlownyPanel gp = new GlownyPanel();
		Container cn = getContentPane();
		setBounds(100, 100, 400, 300);
		cn.add(gp);
		setVisible(true);

	}

}
