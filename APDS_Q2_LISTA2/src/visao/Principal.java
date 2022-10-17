package visao;

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
		e.tempoDetrabalho();
		
		System.out.println("Qual é o Nome do segundo titular:");
		c.setNome(ler.next());
		System.out.println("nome:" + c.getNome());
		System.out.println("Ele(a)Trabalhou em 1 empresa");
		c.tempoDetrabalho1();
		
		System.out.println("Qual é o nome do terceiro titular:");
		d.setNome(ler.next());
		System.out.println("nome:" + d.getNome());
		System.out.println("ele(a) trablhou em 4 empresas:");
		d.tempoDetrabalho2();
		
		System.out.println("Qual é o nome do Quarto titular:");
		f.setNome(ler.next());
		System.out.println("nome:" + f.getNome());
		System.out.println("ele(a) trablhou em 7 empresas:");
		f.tempoDetrabalho3();
		
		System.out.println("Qual é o nome do Quinto titular:");
		g.setNome(ler.next());
		System.out.println("nome:" + g.getNome());
		System.out.println("ele(a) trablhou em 5 empresas:");
		g.tempoDetrabalho4();
	}

}
