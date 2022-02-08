package com.devsuperior.dscliente.dto;

import java.io.Serializable;
import java.time.Instant;

import com.devsuperior.dscliente.entities.Client;

public class ClientDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String cpf;
	private Instant birthDate;
	private Integer children;
	
	
	public ClientDTO() {}


	public ClientDTO(Long id, String name, String cpf, Instant birthDate, Integer children) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.birthDate = birthDate;
		this.children = children;
	}
	
	public ClientDTO(Client entity) {
		super();
		this.id = entity.getId();
		this.name = entity.getName();
		this.cpf = entity.getCpf();
		this.birthDate = entity.getBirthDate();
		this.children = entity.getChildren();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Instant getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}


	public Integer getChildren() {
		return children;
	}


	public void setChildren(Integer children) {
		this.children = children;
	}

}
