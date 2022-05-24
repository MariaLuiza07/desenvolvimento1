/**
 * 
 */
package br.com.maria.domain.pessoa;

/**
 * @author ferreira.5903
 * @see https://github.com/MariaLuiza07
 */
public class PessoaFisica extends Pessoa {

	private String cpf;
	
	private String rg;
	
	private Integer reservista;
	
	private TipoPagamentoEnum tipo;
	
	public PessoaFisica() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the tipo
	 */
	public TipoPagamentoEnum getTipo() {
		return tipo;
	}
	
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoPagamentoEnum tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}

	/**
	 * @return the reservista
	 */
	public Integer getReservista() {
		return reservista;
	}

	/**
	 * @param reservista the reservista to set
	 */
	public void setReservista(Integer reservista) {
		this.reservista = reservista;
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		
		System.out.println(super.getNome() + ", " +
		super.getEndereco().get(0).getCidade() + ", " + getCpf() + ", " + tipo);
	}
  	
}