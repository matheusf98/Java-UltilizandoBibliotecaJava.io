package br.com.treinamento.javaio.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class testeCopiaArquivo {
	
	public static void main(String[] args) throws IOException {
		
		//Socket rede = new Socket(); // instancia para rede

		InputStream file = System.in; //rede.getInputStream();//Entrada Rede | //System.in;//Entrada Console | //new FileInputStream("Lorem.txt");//Entrada Teclado
		Reader inp = new InputStreamReader(file);
		BufferedReader buf = new BufferedReader(inp);
		
		OutputStream put = new FileOutputStream("Lorem2.txt"); //rede.getOutputStream();//Saida rede | //System.out;//Saida console | //new FileOutputStream("Lorem2.txt");//Saida Teclado 
		Writer wri = new OutputStreamWriter(put);
		BufferedWriter bufw = new BufferedWriter(wri);
		
		String linha = buf.readLine();
		
		while(linha != null && !linha.isEmpty()) {
			bufw.write(linha);
			bufw.newLine();
			linha = buf.readLine();
		}
		
		buf.close();
		bufw.close();
	}
}
