package org.zerhusen.model.usuario;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "HORAS_USUARIO")
public class HoraDoUsuario {

	@Id
    @Column(name = "HORA_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_hora_seq")
    @SequenceGenerator(name = "usuario_hora_seq", sequenceName = "usuario_hora_seq", allocationSize = 1)
    private Long id;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DIA")
	private Date dia;
	
	@Column(name = "HORAS")
	private Integer horasTrabalhadas;
	
	@JsonIgnore
	@JoinColumn(referencedColumnName="USUARIO_ID",name="USUARIO_ID")
	@ManyToOne(fetch=FetchType.LAZY)
	private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
