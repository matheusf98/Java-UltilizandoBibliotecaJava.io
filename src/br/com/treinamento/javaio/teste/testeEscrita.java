package br.com.treinamento.javaio.teste;

import java.io.FileWriter;
import java.io.IOException;

public class testeEscrita {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter writer = new FileWriter("Lorem2.txt");
		
		writer.write("Aluno: Matheus Ferreira");
		writer.write(System.lineSeparator());
		writer.write(System.lineSeparator());
		writer.write("Curso: Analise de desenvolvimento de sistemas");
		
		writer.close();
	}
}
