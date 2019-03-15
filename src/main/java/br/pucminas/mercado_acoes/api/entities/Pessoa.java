package br.pucminas.mercado_acoes.api.entities;

import java.util.Calendar;

import javax.persistence.Entity;

import br.pucminas.mercado_acoes.api.enums.TipoPessoa;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Pessoa
{
	private Long id;
	private Long nome;
	private TipoPessoa tipoPessoa;
	private Endereco endereco;
	private Calendar dataCadastro;
}