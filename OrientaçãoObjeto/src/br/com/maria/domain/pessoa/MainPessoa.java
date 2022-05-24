package br.com.maria.domain.pessoa;

import java.util.ArrayList;
import java.util.List;

public class MainPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		manipularPessoaFisica();
	}
	
	private static void manipularPessoaFisica() {
		
		PessoaFisica pf = new PessoaFisica();
		
		Endereco endereco1 = new Endereco();
		
		endereco1.setEndereco("Rua tal");
		
		endereco1.setBairro("Invernada do Mataudoro");
		
		endereco1.setCidade("Pirai do Sul");
		
		endereco1.setUf("PR");
		
		endereco1.setPais("Brasil");
		
		Endereco endereco2 = new Endereco();
		
		endereco2.setEndereco("Rua tal");
		
		endereco2.setBairro("Invernada do Mataudoro");
		
		endereco2.setCidade("Castro");
		
		endereco2.setUf("PR");
		
		endereco2.setPais("Brasil");
		
		List<Endereco> enderecos = new ArrayList<>();
		
		//Integer numeros[] = new Integer[15];
		//numero[0] = 1;
		
		enderecos.add(endereco1);
		
		enderecos.add(endereco2);
		
		// ou
		// pf.getEndereco().setCidade("Castro");
		
		pf.setNome("Maria");
		
		pf.setEndereco(enderecos);
		
		pf.setCpf("111,222,222-89");
		
		pf.setTipo(TipoPagamentoEnum.CADERNO);
		
		pf.imprimir();
		
	}

}
