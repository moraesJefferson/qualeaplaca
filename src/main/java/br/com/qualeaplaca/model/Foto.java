package br.com.qualeaplaca.model;

import java.io.Serializable;

public class Foto implements Serializable{

	private static final long serialVersionUID = 7862356817629881461L;
	
	private Long id;
	private String foto;
	private String placa;

	public Foto() {
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
}
