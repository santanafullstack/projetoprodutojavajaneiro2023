package br.com.cotiinformatica.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter 
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString 
public class PostProdutosDTO {

	
	private String nome;
	private Double preco;
	private Integer quantidade;
}
