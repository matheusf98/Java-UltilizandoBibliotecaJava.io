package br.com.treinamento.javaio.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class testeLeitura {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("Lorem.txt");//Criando fluxo do arquivo binário
		InputStreamReader inp = new InputStreamReader(file);// transformando em caracteres
		BufferedReader buf = new BufferedReader(inp);//Fazer a leitura de linha por linha
		
		String linha = buf.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = buf.readLine();
		}
		
		
		buf.close();
	}
}
