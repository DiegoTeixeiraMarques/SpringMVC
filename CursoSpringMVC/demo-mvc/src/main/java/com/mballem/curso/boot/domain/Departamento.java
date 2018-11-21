package com.mballem.curso.boot.domain;

import java.util.List;
import javax.persistence.*;   		// Notações JPA

@SuppressWarnings("serial")
@Entity						  		// Informa que esta classe é mapeada pela JPA
@Table(name = "DEPARTAMENTOS")		// Atribui o nome DEPARTAMENTOS a classe criada no BD
public class Departamento extends AbstractEntity<Long> {
	
	//ID herdado da super classe
	@Column(name = "nome", nullable = false, unique = true, length = 60)   // se não atribuir o nome a tabela será o nome do atributo
	private String nome;
	
	@OneToMany(mappedBy = "departamento")	// Um Departamento para muitos Cargos. mappedBy --> para relacionamentos bidirecionais. Informa qual o lado fraco da relação, neste caso o lado fraco é departamento
	private List<Cargo> cargos;
	
	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}