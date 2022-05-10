import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Program program = new Program();
		
		System.out.println("Entre com o nome do titular da conta: ");
		String nome = sc.nextLine();
		program.SetNome(nome);
		
		System.out.println("Entre com o número da conta: ");
		int NroConta = sc.nextInt();
		program.setNroConta(NroConta);
		
		System.out.println("Quer depositar quanto: ");
		double valor = sc.nextDouble();
		program.Depositar(valor);
		
		System.out.println("Deseja sacar digite 'S' para sim e 'N' não: ");
        char opcao = sc.next().charAt(0);
        
        
		while(opcao == 'S' || opcao == 's') {
			System.out.println("Quer sacar quanto: ");
			valor = sc.nextDouble();
			program.Sacar(valor);
		
			System.out.println("Deseja sacar digite 'S' para sim e 'N' não: ");
	        opcao = sc.next().charAt(0);
			
		}
		System.out.println("Você sacou: " +valor);
		
		
		System.out.println("Nome do titular: " + program.GetNome() + "\nNumero conta: " + program.getNroConta() + "\nSaldo:" + program.getSaldo());
		
		
		sc.close();
	}

}
