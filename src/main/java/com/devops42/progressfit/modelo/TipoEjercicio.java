package com.devops42.progressfit.modelo;

import java.util.Set;

import javax.persistence.Entity;
//import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "tipo_ejercicio")
public class TipoEjercicio {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nombre;
	private String descripcion;
	
	@OneToMany(mappedBy = "tipoEjercicio")
	@JsonIgnore
	private Set<Ejercicio> ejercicios;
	
	public TipoEjercicio() {
		// TODO AUTO GENERADO CONSTRUCTOR
	}
	
}
