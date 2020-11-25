package com.devops42.progressfit.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "ejercicios")
public class Ejercicio {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nombre;
	private String descripcion;
	private String imagen;
	private String series;
	private String duracion;
	
	@ManyToOne
	@JoinColumn(name="idTipoEjercicio")
	@JsonIgnore
	private TipoEjercicio tipoEjercicio;
	
	public Ejercicio() {
		// TODO AUTO GENERADO CONSTRUCTOR
	}
	
	
}
