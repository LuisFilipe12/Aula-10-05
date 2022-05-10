
public class Program {

	private String nome;
	private int nroConta;
	private double saldo;
	
	
	public Program() {
		
	}
	public String GetNome() {
		return nome;
	}
	public String SetNome(String nome) {
		return this.nome = nome;
	}
	 public int getNroConta() {
		 return nroConta;
	 }

	public void setNroConta(int NroConta) {
		this.nroConta = nroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void Sacar(double valor) {
		saldo = saldo - valor;
	}
	
	public void Depositar(double valor) {
		saldo = saldo + valor;
	}
}