package com.generation.lojadegames1.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo Titulo é obrigatório!")
	@Size(min = 3, max = 100, message = "O atributo Titulo deve conter no minimo 03 e no máximo 100 caracteres")
	private String titulo;
	
	@NotBlank(message = "O atributo Desenvolvedor é obrigatório!")
	@Size(min = 3, max = 100, message = "O atributo Desenvolvedor deve conter no minimo 03 e no máximo 100 caracteres")
	private String desenvolvedor;
	
	@NotBlank(message = "O atributo Valor é obrigatório!")
	private Double valor;
	
	
	@NotBlank(message = "O atributo Avaliação  é obrigatório!")
	private Double avaliacao;
	
	@NotBlank(message = "O atributo Classificação  é obrigatório!")
	private int classificacao;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDesenvolvedor() {
		return desenvolvedor;
	}

	public void setDesenvolvedor(String desenvolvedor) {
		this.desenvolvedor = desenvolvedor;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Double avaliacao) {
		this.avaliacao = avaliacao;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
	
	
}
