package POO;

public class Cliente {

	// declara��o dos atributos
	
	private String nome;
	private String cpf;
	
	// declara��o dos m�todos construtor
	
	public Cliente (String nome, String cpf)
	{
		this.nome = nome;
		this.cpf = cpf;
	}

	// declara��o dos m�todos gerais
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void imprima()
	{
		System.out.println("\nNome do cliente: "+nome+"\tE o seu CPF: "+cpf);
	}
	
	
	
	
	
	
	
	
}
