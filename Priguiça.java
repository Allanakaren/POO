package POO;

public class Prigui�a extends Animal{

	
	
	public Prigui�a()
	{
		super("Tipo Animal: Pregui�a");
		
	}

	 @Override 
	 public void nome(String nomeAnimal)
	 {
		 System.out.println("\nNome do seu Pregui�a: "+nomeAnimal);
	 }
	 
	 @Override
	 public void idade(String idadeAnimal)
	 {
		 System.out.println("\nQual a idade do seu Pregui�a: "+idadeAnimal);
	 }
	 
	 @Override
	 public void som(String somAnimal)
	 {
		 System.out.println("\nQual somo sua Pregui�a faz: "+somAnimal);
	 }
	
}
