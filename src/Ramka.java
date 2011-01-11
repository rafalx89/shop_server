import java.awt.Container;

import javax.swing.*;
/**
 * Klasa Ramka w kt�rej b�dzie zamieszczony JPanel: GlownyPanel
 * 
 * @author Rafal
 * 
 */
public class Ramka extends JFrame
{
	/**
	 * Tworzy instancje GlownyPanel Ustawia rozdzielczo�� Tworzy instancje
	 * Kontenera i umieszcza w nim GlownyPanel Ustawia Ramke na widoczn�
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
