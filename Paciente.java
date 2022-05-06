package POO;

public class Paciente {

	//atributos 
	public String nome;
	public String doenca;
	public String remedio;
	
	// métodos construtor 
	public Paciente(String nome, String doenca, String remedio) {
		super();
		this.nome = nome;
		this.doenca = doenca;
		this.remedio = remedio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDoenca() {
		return doenca;
	}

	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}

	public String getRemedio() {
		return remedio;
	}

	public void setRemedio(String remedio) {
		this.remedio = remedio;
	}
	
	public void imprima()
	{
		System.out.println("\nNome do Paciente: "+nome+"\nDoença do Paciente: "+doenca+"\nRemédio: "+remedio);
	}
	
	
	
	
	
	
	
	
}
