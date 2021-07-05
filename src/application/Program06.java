package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class Program06 {

	public static void main(String[] args) {
		Funcionarios funcionarios;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome do funcionario? ");
		String funcinario = sc.nextLine();
		System.out.print("Digite o salario do funcionario!");
		double salario = sc.nextDouble();
		System.out.println("Ofuncionario tem debito? S/N");

		char op = sc.next().charAt(0);
		if (op == 's') {
			System.out.print("Digite o debito do funcionario!");
			double debito = sc.nextDouble();

			funcionarios = new Funcionarios(funcinario, salario, debito);

		} else {

			funcionarios = new Funcionarios(funcinario, salario);
		}
		System.out.println();
		funcionarios.saldoFuncionario();
		System.out.println(funcionarios);


		System.out.println();
		System.out.print("valor do feriado");
		double saldo = sc.nextDouble();
		funcionarios.feriadoTrabalhado(saldo);
		System.out.println("Valor do salario atualizado");
		System.out.println(funcionarios);

		sc.close();

	}

}
