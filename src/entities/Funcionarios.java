package entities;

public class Funcionarios {
	private String nome;
	private double salario;
	private double debito;
	private double saldo;
	private double feriado;

	public double getFeriado() {
		return feriado;
	}

	public void setFeriado(double feriado) {
		this.feriado = feriado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getDebito() {
		return debito;
	}

	public void setDebito(double debito) {
		this.debito = debito;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Funcionarios(String nome, double salario, double debito) {
		this.nome = nome;
		this.salario = salario;
		this.debito = debito;

	}
	

	public Funcionarios(String nome, double salario, double saldo, double feriado) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.saldo = saldo;
		this.feriado = feriado;
	}

	public Funcionarios(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public void saldoFuncionario() {
		saldo = salario -= debito;
	}

	public void feriadoTrabalhado(double saldo) {
		this.saldo  = salario += feriado;
	}

	public String toString() {
		return " Nome: " + nome + ", Saldo  R$ = " + String.format("%.2f", saldo);

	}
}
