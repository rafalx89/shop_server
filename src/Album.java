import java.awt.Image;
import java.util.*;
public class Album
{
	/**
	 * id albumu
	 */
	private int id;
	/**
	 * Lista piosenek
	 */
	private List<String> album_list = new ArrayList<String>();
	/**
	 * Nazwa albumu
	 */
	private String album_name;
	/**
	 * Wykonawca
	 */
	private String performer;
	/**
	 * Kategoria
	 */
	// private Category category;
	/**
	 * Cena albumu
	 */
	private double price;
	/**
	 * Opis albumu
	 */
	private String description;

	/**
	 * Okladka albumu
	 */
	private Image album_image;

	/**
	 * Konstuktor
	 */
	public Album()
	{

	}
	/**
	 * Ustawianie id - albumu
	 * 
	 * @param id
	 *            - id albumu
	 */
	public void setID(int id)
	{
		this.id = id;
	}
	/**
	 * Ustawienie nazwy albumu
	 * 
	 * @param name
	 *            - zmienna z nazwą albumu
	 */
	public void setName(String name)
	{
		this.album_name = name;
	}
	/**
	 * Ustawianie listy piosenek
	 * 
	 * @param album_list
	 *            - lista piosenek
	 */
	public void setAlbumList(List album_list)
	{
		this.album_list = album_list;
	}
	/**
	 * Dodawanie piosenki do albumu
	 * 
	 * @param song
	 *            - piosenka
	 */
	public void addSong(String song)
	{
		this.album_list.add(song);
	}

	/**
	 * Usuwanie piosenki z albumu
	 * 
	 * @param id
	 *            - id piosenki
	 */
	public void removeSong(int id)
	{
		this.album_list.remove(id);
	}

	/**
	 * Ustawianie wykonawcy
	 * 
	 * @param performer
	 *            - wykonawca
	 */
	public void setPerformer(String performer)
	{
		this.performer = performer;
	}
	/**
	 * uStawianie kategorii albumu ("rock", "pop" itp.)
	 */
	/*
	 * public void setCategory(Category category) { this.category = category; }
	 */

	/**
	 * Ustawianie ceny albumu
	 * 
	 * @param price
	 *            - cena albumu
	 */
	public void setPrice(double price)
	{
		this.price = price;
	}

	/**
	 * Ustawianie opisu albumu
	 * 
	 * @param description
	 *            - opis albumu
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}

	/**
	 * Ustawianie okladki albumu
	 * 
	 * @param image
	 */
	public void setAlbumImage(Image image)
	{
		this.album_image = image;
	}

	/**
	 * Zwracanie id albumu
	 * 
	 * @return - id
	 */
	public int getID()
	{
		return this.id;
	}

	/**
	 * Zwracanie nazwy albumu
	 * 
	 * @return - album_name
	 */
	public String getAlbumName()
	{
		return this.album_name;
	}

	/**
	 * Zwracanie listy piosenek
	 * 
	 * @return - album_list
	 */
	public List<String> getAlbumList()
	{
		return this.album_list;
	}
	/**
	 * Zwracanie wykonawcy
	 * 
	 * @return - performer
	 */
	public String getPerformer()
	{
		return this.performer;
	}

	/**
	 * Zwracanie kategorie albumu
	 * 
	 * @return - category
	 */
	/*
	 * public Category getCategory() { return this.category; }
	 */

	/**
	 * Zwracanie opisu albumu
	 * 
	 * @return - description
	 */
	public String getDescription()
	{
		return this.description;
	}

	// public byte[] getAlbumImage()
	// {
	// TODO

	// }

}
