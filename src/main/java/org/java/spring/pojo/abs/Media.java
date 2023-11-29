package org.java.spring.pojo.abs;

public abstract class Media {
	
	private int id;
	private String titolo;
	
	
	public Media(int id, String titolo) {
		setId(id);
		setTitolo(titolo);
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
}
