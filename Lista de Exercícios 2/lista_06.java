//lista de atividades da Rosilane - 28/04
import java.util.Scanner;
public class lista_06 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		//variáveis utilizadas
		double valor, lucro, compra, venda;
		double porcent, a=0, b=0 , c=0;
		double totalCompra = 0, totalLucro = 0, totalVenda = 0;
		
		System.out.println("Digite o valor da compra:");
		compra = ent.nextDouble();
		//e estrutura while foi utilizada, pois não havia um limite 
		// o if foi usado para calcular os valores do lucro
		while (compra != 0) {
			System.out.println("Digite o valor da venda:");
			venda = ent.nextDouble();
			
			lucro = venda - compra;
			porcent =(compra/100)*lucro;
			
			if (lucro < 10) {
				a++;
			}
			else if (10 <= lucro && lucro <= 20) {
				b++;
			}
			else {
				c++;
			}
			
			totalCompra += compra; // totalCompra = compra + totalCompra
			totalVenda += venda; 
			totalLucro = totalVenda - totalCompra;
			
			System.out.println("Digite o valor da compra: (Digite 0 para parar)");
			compra = ent.nextDouble();
					
		}
		System.out.println("A quantidade do lucro menor que 10% será: " +a);
		
		System.out.println("A quantidade do lucro maio que 10% e menor que 20% será: " +b);
		
		System.out.println("A quantidade do lucro maior que 20% será: " +c);
		
		System.out.println("O valor total de compra será: " +totalCompra);
		
		System.out.println("O valor total de venda será: " +totalVenda);
		
		System.out.println("O valor total de lucro será: " +totalLucro);
		
ent.close();		
	}

}
