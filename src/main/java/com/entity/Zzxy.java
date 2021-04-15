package com.entity;

public class Zzxy {

    private Integer id;
	private String bianhao;
	private Integer sbzt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBianhao() {
		return bianhao;
	}
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	public Integer getSbzt() {
		return sbzt;
	}
	public void setSbzt(Integer sbzt) {
		this.sbzt = sbzt;
	}
	@Override
	public String toString() {
		return "Zzxy [id=" + id + ", bianhao=" + bianhao + ", sbzt=" + sbzt + "]";
	}	
}
