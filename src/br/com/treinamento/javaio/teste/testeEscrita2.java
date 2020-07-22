package br.com.treinamento.javaio.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class testeEscrita2 {
	
	public static void main(String[] args) throws IOException {
		
		OutputStream put = new FileOutputStream("Lorem2.txt");//Criando fluxo do arquivo binário
		Writer wri = new OutputStreamWriter(put);// transformando em caracteres
		BufferedWriter bufw = new BufferedWriter(wri);//Fazer a leitura de linha por linha
		
		bufw.write("Aluno: Matheus Ferreira");
		bufw.newLine();
		bufw.write("Curso: Analise de desenvolvimento de sistemas");
		
		bufw.close();
	}
}
