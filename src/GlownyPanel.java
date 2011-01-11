import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 * Klasa g�owny panel do uruchamiania serwera, zatrzymywania, i czytania log�w
 * serwera.
 * 
 * 
 * 
 */
public class GlownyPanel extends JPanel
{

	/**
	 * G�rne menu
	 */
	private JMenuBar mb;

	/**
	 * Podmenu w menu: Do obslugi serwera
	 */
	private JMenu m1;

	/**
	 * Podmenu w menu: Pomoc
	 */
	private JMenu m2;

	/**
	 * Przycisk w podmenu Serwer: Wystartuj serwer
	 */
	private JMenuItem mi1;

	/**
	 * Przycisk w podmena Serwer: Zatrzymaj serwer
	 */
	private JMenuItem mi2;

	/**
	 * Przycisk w podmenu Serwer: Zamknij program serwera
	 */
	private JMenuItem mi3;

	/**
	 * Przycisk w podmenu Pomoc: Informacje o programie
	 */
	private JMenuItem mj1;

	/**
	 * Pole tekstowe do wypisywania log�w serwera
	 */
	private JTextArea log;

	/**
	 * Pole ze skrolem w kt�rym jest umieszczone pole z logami
	 */
	private JScrollPane sp_log;

	/**
	 * Przycisk do startowania serwera
	 */
	private JButton start_serwer;

	/**
	 * Przycisk do zatrzymywania serwera
	 */
	private JButton stop_serwer;

	/**
	 * Kontener w kt�rym b�d� zamieszczone przyciski stop_serwer i start serwer
	 */
	private Container cn;

	/**
	 * Konstruktor w kt�rym inicjowane s� wszystkie atrybuty i podawane. Posiada
	 * te� Action Listenery do obs�ugi przycisk�w i serwera
	 */
	public GlownyPanel()
	{
		/**
		 * Tworzymu instancj� odpowienich klas
		 */
		mb = new JMenuBar();
		m1 = new JMenu("Serwer");
		mi1 = new JMenuItem("Wystartuj serwer");
		mi2 = new JMenuItem("Zatrzymaj serwer");
		mi3 = new JMenuItem("Zamknij");
		m2 = new JMenu("Pomoc");
		mj1 = new JMenuItem("About");
		// Tworzymy instancj� kontenera
		cn = new Container();
		start_serwer = new JButton("Wystartuj serwer");
		stop_serwer = new JButton("Zatrzymaj serwer");

		log = new JTextArea();
		// Tworzymy instancj� klasy ScrollPane i przypisujemy jej instancje
		// klasy TextArea
		sp_log = new JScrollPane(log);

		/**
		 * ActionListener do zamykania ca�ego programu serwera
		 */
		mi3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				// Inicjujemy i wy�wietlamy okno OptionDialog i do zmiennej jest
				// przypisywana warto�� Yes lub No
				int choice = JOptionPane.showOptionDialog(getRootPane(),
						"Czy na pewno chcesz zamkn�� program?", "Zako�czy�?",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, null, null);
				// Sprawdzamy, czy wcisniety zosta� przycisk Yes, je�li tak, to
				// zamykamy ca�y program
				if (choice == JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}
			}
		});

		/*
		 * Opcje dla pola log
		 */
		log.setLineWrap(true); // Ustawiamy zawijanie wierszy
		log.setWrapStyleWord(true); // Przy zawijaniu zawijamy ca�e s�owa
		log.setEditable(false); // Wy��czamy edytowalno�� pola

		/*
		 * Dodawanie i ��czenie ze sob� komponent�w
		 */
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m2.add(mj1);
		mb.add(m1);
		mb.add(m2);

		/*
		 * Ustawiamy rozmiar przycisk�w start_serer i stop_serwer
		 */
		start_serwer.setMinimumSize(new Dimension(150, 30));
		start_serwer.setPreferredSize(new Dimension(150, 30));
		start_serwer.setMaximumSize(new Dimension(150, 30));
		stop_serwer.setMinimumSize(new Dimension(150, 30));
		stop_serwer.setPreferredSize(new Dimension(150, 30));
		stop_serwer.setMaximumSize(new Dimension(150, 30));

		// ustawiamy Layout dla instancji klasy Container
		cn.setLayout(new FlowLayout());
		cn.add(start_serwer);
		cn.add(stop_serwer);

		/*
		 * Ustawianie wygl�du na BorderLayout
		 */
		setLayout(new BorderLayout());
		add(mb, "North");
		add(sp_log, "Center");
		add(cn, "South");

	}

}
