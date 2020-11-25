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
@Table(name = "rutina_dia")
public class RutinaDia {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String series;
	private String duracion;
	private Integer dia;
	
	
	@ManyToOne
	@JoinColumn(name="idRutina")
	@JsonIgnore
	private Rutina rutina;
	
	@ManyToOne
	@JoinColumn(name="idEjercicio")
	@JsonIgnore
	private Ejercicio ejercicio;
	
	
	

}