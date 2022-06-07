//atividade 10 da lista 2 - 03/05
import java.util.Scanner;
public class lista2_10 { //Função 
	
	public static char categoria(int num1) { //parâmetro da idade
		char opcao;
			 if ((num1 >= 5) && (num1 <= 7)) 
		 	{
				 opcao = 'F';
				 return (opcao);
			}
		 
			else if ((num1 >= 8) && (num1 <= 10)) 
			{
				 opcao = 'E';
				 return (opcao);
			}
		 
			else if ((num1 >= 11) && (num1 <= 13))  
			{
				 opcao = 'D';
				 return (opcao);
			}
		 
			else if ((num1 >= 14) && (num1 <= 15))  
			{
				 opcao = 'C';
				 return (opcao);
			}
		 
			else if ((num1 >= 16) && (num1 <= 17)) 
			{
				 opcao = 'B';
				 return (opcao);
			}
		 
			else {
				 opcao = 'A';
				 return (opcao);
			}
		//por ser tratar de uma função o void não pode ser colocado
 	}

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		 int num1;
		 
		 System.out.println("Digite a idade do nadador: ");
		 num1 = ent.nextInt();
		 
		 System.out.println("A categoria será: " + categoria(num1)); //chamar o módulo
	
ent.close();
	}

}
