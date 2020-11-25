package com.devops42.progressfit.modelo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "personas")
public class Persona {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String documento;
	private String nombre;
	private String telefono;
	
	@OneToMany(mappedBy = "persona")
	@JsonIgnore
	private Set<Rutina> rutina;
	
	public Persona() {
		// TODO AUTO GENERADO CONSTRUCTOR
	}

}
