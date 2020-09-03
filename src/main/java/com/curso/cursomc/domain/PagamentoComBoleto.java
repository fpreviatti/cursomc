package com.curso.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.curso.cursomc.domain.enums.EstadoPagamento;
import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class PagamentoComBoleto extends Pagamento {
	
		private static final long serialVersionUID = 1L;

	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataPagamento;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataVencimento;
	
	public PagamentoComBoleto(){
		
	}

	public PagamentoComBoleto(Date dataPagamento, Date dataVencimento,Integer id, EstadoPagamento estado, Pedido pedido) {
		super(id, estado, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
		// TODO Auto-generated constructor stub
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}


	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}


	public Date getDataVencimento() {
		return dataVencimento;
	}


	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

}
