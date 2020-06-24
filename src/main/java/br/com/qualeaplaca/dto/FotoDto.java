package br.com.qualeaplaca.dto;

import java.io.InputStream;
import java.io.Serializable;

public class FotoDto implements Serializable{

	private static final long serialVersionUID = 6641501648997442359L;
	
	private Long id;
	private String foto;
	private Boolean sucess;
	private String placa;
	private String probability;
	private String code;
	private InputStream videoDto;
	private String videoName;
	private String video;
	
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
	public InputStream getVideoDto() {
		return videoDto;
	}
	public void setVideoDto(InputStream videoDto) {
		this.videoDto = videoDto;
	}
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	
}
