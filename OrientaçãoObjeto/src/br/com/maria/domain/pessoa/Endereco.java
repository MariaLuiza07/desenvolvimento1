/**
 * 
 */
package br.com.maria.domain.pessoa;

/**
 * Classe abstrata do tipo pessoa
 * @author ferreira.5903
 * @see https://github.com/MariaLuiza07
 */
public class Endereco {
	
	private String nome;
	
	private String endereco;
	
	private String bairro;
	
	private String cidade;
	
	private String uf;
	
	private String pais;

	private String email;
	
	private Object Telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.Telefone = Telefone;
	}
	
	public void imprimir() {
	}

}
