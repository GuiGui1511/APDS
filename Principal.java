package visao;

import java.time.LocalDateTime;
import java.time.Period;
import java.util.Scanner;

import dominio.Empresa;

public class Principal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Empresa e = new Empresa();
		Empresa c = new Empresa();
		Empresa d = new Empresa();
		Empresa f = new Empresa();
		Empresa g = new Empresa();

		System.out.println("Qual o Nome do primeiro titular:");
		e.setNome(ler.next());
		System.out.println("nome:" + e.getNome());
		System.out.println("Ele(a)Trabalhou em 2 empresas");

		LocalDateTime inicialDate = LocalDateTime.of(2021, 8, 4, 0, 0);
		LocalDateTime finalDate = LocalDateTime.of(2022, 12, 5, 0, 0);

		Period periodo = Period.between(inicialDate.toLocalDate(), finalDate.toLocalDate());

		System.out.println("Primeiro emprego:");
		System.out.println("Data de entrada:" + inicialDate);
		System.out.println("Data de saida:" + finalDate);
		System.out.println("Periodo de Trabalhado:" + periodo);

		LocalDateTime inicialDate1 = LocalDateTime.of(2022, 4, 4, 0, 0);
		LocalDateTime finalDate1 = LocalDateTime.of(2024, 8, 5, 0, 0);

		Period periodo1 = Period.between(inicialDate1.toLocalDate(), finalDate1.toLocalDate());

		System.out.println("Segundo Emprego:");
		System.out.println("Data de entrada:" + inicialDate1);
		System.out.println("Data de saida:" + finalDate1);
		System.out.println("Periodo de Trabalho:" + periodo1);

		System.out.println("Tempo Total: 3 anos/ 8 meses / 2 dias");

		System.out.println("Qual é o Nome do segundo titular:");
		c.setNome(ler.next());
		System.out.println("nome:" + c.getNome());
		System.out.println("Ele(a)Trabalhou em 1 empresa");

		LocalDateTime inicialDate2 = LocalDateTime.of(2021, 8, 4, 0, 0);
		LocalDateTime finalDate2 = LocalDateTime.of(2021, 12, 12, 0, 0);

		Period periodo2 = Period.between(inicialDate2.toLocalDate(), finalDate2.toLocalDate());

		System.out.println("Primeiro Emprego:");
		System.out.println("Data de entrada:" + inicialDate2);
		System.out.println("Data de saida:" + finalDate2);
		System.out.println("Periodo de Trabalho: " + periodo2);
		System.out.println("Tempo total: 4 meses/ 8 dias");

		System.out.println("Qual é o nome do terceiro titular:");
		d.setNome(ler.next());

		System.out.println("nome:" + d.getNome());
		System.out.println("ele(a) trablhou em 4 empresas:");

		LocalDateTime inicialDate3 = LocalDateTime.of(2008, 8, 4, 0, 0);
		LocalDateTime finalDate3 = LocalDateTime.of(2015, 9, 28, 0, 0);

		Period periodo3 = Period.between(inicialDate3.toLocalDate(), finalDate3.toLocalDate());
		System.out.println("Primeiro Emprego ao Quarto Emprego:");
		System.out.println("Data de entrada:" + inicialDate3);
		System.out.println("Data de saida:" + finalDate3);
		System.out.println("Periodo de Trabalho: " + periodo3);

		System.out.println("Tempo total 7 anos / 1 meses / 24 dias");

		System.out.println("Qual é o nome do Quarto titular:");
		f.setNome(ler.next());

		System.out.println("nome:" + f.getNome());
		System.out.println("ele(a) trablhou em 7 empresas:");

		LocalDateTime inicialDate4 = LocalDateTime.of(2001, 1, 1, 0, 0);
		LocalDateTime finalDate4 = LocalDateTime.of(2033, 5, 30, 0, 0);

		Period periodo4 = Period.between(inicialDate4.toLocalDate(), finalDate4.toLocalDate());

		System.out.println("Primeiro Emprego ao setimo emprego:");
		System.out.println("Data de entrada:" + inicialDate4);
		System.out.println("Data de saida:" + finalDate4);
		System.out.println("Periodo de Trabalho: " + periodo4);

		System.out.println("Tempo total 32 anos / 4 meses / 29 dias");

		System.out.println("Qual é o nome do Quinto titular:");
		g.setNome(ler.next());

		System.out.println("nome:" + g.getNome());
		System.out.println("ele(a) trablhou em 5 empresas:");

		LocalDateTime inicialDate5 = LocalDateTime.of(1997, 1, 1, 0, 0);
		LocalDateTime finalDate5 = LocalDateTime.of(2017, 8, 25, 0, 0);

		Period periodo5 = Period.between(inicialDate5.toLocalDate(), finalDate5.toLocalDate());

		System.out.println("Primeiro Emprego ao quinto emprego:");
		System.out.println("Data de entrada:" + inicialDate5);
		System.out.println("Data de saida:" + finalDate5);
		System.out.println("Periodo de Trabalho: " + periodo5);

		System.out.println("Tempo total 20 anos / 7 meses / 24 dias");

	}

}
