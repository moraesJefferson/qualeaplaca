package br.com.qualeaplaca.model;

import java.io.Serializable;

public class Foto implements Serializable{

	private static final long serialVersionUID = 7862356817629881461L;
	
	private Long id;
	private String foto;
	private Boolean sucess;
	private String placa;
	private String probability;
	private String code;

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

	public Boolean getSucess() {
		return sucess;
	}
	public void setSucess(Boolean sucess) {
		this.sucess = sucess;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getProbability() {
		return probability;
	}
	public void setProbability(String probability) {
		this.probability = probability;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
