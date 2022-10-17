package dominio;

import java.time.LocalDateTime;
import java.time.Period;

public class Empresa {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void tempoDetrabalho() {

		LocalDateTime inicialDate = LocalDateTime.of(2021, 8, 4, 0, 0);
		LocalDateTime finalDate = LocalDateTime.of(2022, 12, 5, 0, 0);

		Period periodo = Period.between(inicialDate.toLocalDate(), finalDate.toLocalDate());
		int years = Math.abs(periodo.getYears());
		int months = Math.abs(periodo.getMonths());
		int days = Math.abs(periodo.getDays());
		System.out.println("Primeiro emprego:");
		System.out.println("Data de entrada:" + inicialDate);
		System.out.println("Data de saida:" + finalDate);
		System.out.println("Periodo de Trabalhado:" + years + "ano" + months + "meses" + days + "dias");
		
		LocalDateTime inicialDate1 = LocalDateTime.of(2022, 4, 4, 0, 0);
		LocalDateTime finalDate1 = LocalDateTime.of(2024, 8, 5, 0, 0);

		Period periodo1 = Period.between(inicialDate1.toLocalDate(), finalDate1.toLocalDate());
		int years1 = Math.abs(periodo1.getYears());
		int months1 = Math.abs(periodo1.getMonths());
		int days1 = Math.abs(periodo1.getDays());

		System.out.println("Segundo Emprego:");
		System.out.println("Data de entrada:" + inicialDate1);
		System.out.println("Data de saida:" + finalDate1);
		System.out.println("Periodo de Trabalho:" + years1 + "ano" + months1 + "meses" + days1 + "dias");

		System.out.println("Tempo Total: " + (years1 + years) + "ano" + (months1 + months) + "meses" + (days1 + days) + "dias");

	}
	
	public void tempoDetrabalho1() {
		
		LocalDateTime inicialDate2 = LocalDateTime.of(2021, 8, 4, 0, 0);
		LocalDateTime finalDate2 = LocalDateTime.of(2021, 12, 12, 0, 0);

		Period periodo2 = Period.between(inicialDate2.toLocalDate(), finalDate2.toLocalDate());
		int years2 = Math.abs(periodo2.getYears());
		int months2 = Math.abs(periodo2.getMonths());
		int days2 = Math.abs(periodo2.getDays());

		System.out.println("Primeiro Emprego:");
		System.out.println("Data de entrada:" + inicialDate2);
		System.out.println("Data de saida:" + finalDate2);
		System.out.println("Periodo de Trabalho: " + years2 + "ano" + months2 + "meses" + days2 + "dias");
		System.out.println("Tempo total: " + years2 + "ano" + months2 + "meses" + days2 + "dias");
		
		
	}
	
	public void tempoDetrabalho2() {
		
		LocalDateTime inicialDate3 = LocalDateTime.of(2008, 8, 4, 0, 0);
		LocalDateTime finalDate3 = LocalDateTime.of(2015, 9, 28, 0, 0);

		Period periodo3 = Period.between(inicialDate3.toLocalDate(), finalDate3.toLocalDate());
		int years3 = Math.abs(periodo3.getYears());
		int months3 = Math.abs(periodo3.getMonths());
		int days3 = Math.abs(periodo3.getDays());

		System.out.println("Primeiro Emprego ao Quarto Emprego:");
		System.out.println("Data de entrada:" + inicialDate3);
		System.out.println("Data de saida:" + finalDate3);
		System.out.println("Periodo de Trabalho: " + years3 + "ano" + months3 + "meses" + days3 + "dias");

		System.out.println("Tempo total:"+ years3 + "ano" + months3 + "meses" + days3 + "dias" );
		
		
	}
	
	public void tempoDetrabalho3() {
		
		LocalDateTime inicialDate4 = LocalDateTime.of(2001, 1, 1, 0, 0);
		LocalDateTime finalDate4 = LocalDateTime.of(2033, 5, 30, 0, 0);

		Period periodo4 = Period.between(inicialDate4.toLocalDate(), finalDate4.toLocalDate());
		int years4 = Math.abs(periodo4.getYears());
		int months4 = Math.abs(periodo4.getMonths());
		int days4 = Math.abs(periodo4.getDays());

		System.out.println("Primeiro Emprego ao setimo emprego:");
		System.out.println("Data de entrada:" + inicialDate4);
		System.out.println("Data de saida:" + finalDate4);
		System.out.println("Periodo de Trabalho: " +years4 + "ano" + months4 + "meses" + days4 + "dias" );

		System.out.println("Tempo total:"+years4 + "ano" + months4 + "meses" + days4 + "dias");
	}
	public void tempoDetrabalho4() {
		
		LocalDateTime inicialDate5 = LocalDateTime.of(1997, 1, 1, 0, 0);
		LocalDateTime finalDate5 = LocalDateTime.of(2017, 8, 25, 0, 0);

		Period periodo5 = Period.between(inicialDate5.toLocalDate(), finalDate5.toLocalDate());
		int years5 = Math.abs(periodo5.getYears());
		int months5 = Math.abs(periodo5.getMonths());
		int days5 = Math.abs(periodo5.getDays());

		System.out.println("Primeiro Emprego ao quinto emprego:");
		System.out.println("Data de entrada:" + inicialDate5);
		System.out.println("Data de saida:" + finalDate5);
		System.out.println("Periodo de Trabalho: " + years5 + "ano" + months5 + "meses" + days5 + "dias");

		System.out.println("Tempo total:" +years5 + "ano" + months5 + "meses" + days5 + "dias");

	}

}
