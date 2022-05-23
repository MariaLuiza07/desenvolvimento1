/**
 * 
 */
package br.com.maria.domain.pessoa;

/**
 * @author ferreira.5903
 * @see https://github.com/MariaLuiza07
 */
public class PessoaFisica extends Pessoa {

	public PessoaFisica() {
		super();
	}
	
	private String cpf;
	
	private String rg;
	
	private Integer reservista;
	
	private TipoPagamentoEnum tipo;
	
	public void PessoaFisica1() {
		System.out.println(super.getNome() + ", " + 
	    super.getCidade() + ", " + this.cpf);
	}
	
	PessoaFisica pf = new PessoaFisica();

	public void setCpf(String string) {
		// TODO Auto-generated method stub
		
	}
	
	//Dados classe abstrata (Modelo)
	pf.setNome("Maria");
	pf.setEndereco("Rua Stephano Rudeck");
	pf.setBairro("Jardim dos Bancarios");
	pf.setCiade("Castro/PR");
	pf.setPais("Brasil");
	
	//Dados especificos
	pf.setCpf("13746605903");
	pf.setRg("152720351");
	pf.setReservista();
	
	pf.imprimir();
	
}
