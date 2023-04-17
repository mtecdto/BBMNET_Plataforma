package com.api.bbmnet.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="edital")
public class EditalEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="chave_edital")
	@NotNull
	private Integer chaveEdital;
	
	@Column(name="numero_pregao")
	@NotNull
	private Long numeroPregao;
	
	@Column(name="lote")
	@NotNull
	private Integer lote;
	
	@ManyToOne
	@JoinColumn(name="sistema_id")
	private SistemaEntity sistema;

	public Long getId() {
		return id;
	}

	public Integer getChaveEdital() {
		return chaveEdital;
	}

	public Long getNumeroPregao() {
		return numeroPregao;
	}

	public Integer getLote() {
		return lote;
	}

	public SistemaEntity getSistema() {
		return sistema;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setChaveEdital(Integer chaveEdital) {
		this.chaveEdital = chaveEdital;
	}

	public void setNumeroPregao(Long numeroPregao) {
		this.numeroPregao = numeroPregao;
	}

	public void setLote(Integer lote) {
		this.lote = lote;
	}

	public void setSistema(SistemaEntity sistema) {
		this.sistema = sistema;
	}

	@Override
	public int hashCode() {
		return Objects.hash(chaveEdital, id, lote, numeroPregao, sistema);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EditalEntity other = (EditalEntity) obj;
		return Objects.equals(chaveEdital, other.chaveEdital) && Objects.equals(id, other.id)
				&& Objects.equals(lote, other.lote) && Objects.equals(numeroPregao, other.numeroPregao)
				&& Objects.equals(sistema, other.sistema);
	}
	
}
