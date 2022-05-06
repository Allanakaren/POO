package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		    int op;
		    try(Scanner leia = new Scanner (System.in)){
			ArrayList<String> estoque = new ArrayList<String>();
			
			    do
			    {
				System.out.println("\n_______________________________________________");
				System.out.println("\n(1) Armazenar dados da list.");
				System.out.println("\n(2) Remover dados da liste.");
				System.out.println("\n(3) Atualizar dados da list.");
				System.out.println("\n(4) Apresentar todos os dados da list.");
				System.out.println("\n(0) Encerrar o sistema... ");
				System.out.println("\n______________________________________________");
				System.out.println("\nDigite sua op��o: ");
				
				op = leia.nextInt();
				
				switch(op)
				{
				case 1: 
					leia.nextLine();
					System.out.println("\nQual o dado deseja armazenar? ");
					String dado = leia.nextLine();
					estoque.add(dado);
					break;
				case 2:
				     leia.nextLine();
				     System.out.println("\nQual dado deseja remover? ");
				     String dados = leia.nextLine();
				     if(estoque.contains(dados))
				     {
				    	 estoque.remove(dados);
				     }
				     else
				     {
				    	 System.out.println("\nDado n�o encontrado...");
				     }
				     System.out.println(estoque);
				     break;
			  case 3:
					leia.nextLine();
					System.out.println("\nDigite o produto que quer atualizar: ");
					String verifica = leia.nextLine();
					System.out.println("\nDigite o produto que entrar� no lugar de "+verifica+" : ");
					String novo = leia.nextLine();
					if(estoque.contains(verifica))
					{
						estoque.remove(verifica);
						estoque.add(novo);
					}
					else
					{
						System.out.println("\nProduto n�o existente...");
					}
					System.out.println(estoque);
					break;

			  case 4:
				  leia.nextInt();
				  System.out.println("\nEsses s�o os produtos armazenados.");
				  System.out.println(estoque);
				  break;  
			default:
				if(op<0 || op>4)
				{
					System.out.println("\nOp��o errada... Digitar novamente...");
				}
				else
				{
					System.out.println("\nPrograma finalizado...");
				}
				 
}
				
}
			while(op != 0);
			    
		
		    } 
		    
	}

}
