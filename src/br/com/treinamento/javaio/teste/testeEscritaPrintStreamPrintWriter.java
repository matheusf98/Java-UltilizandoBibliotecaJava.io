package br.com.treinamento.javaio.teste;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class testeEscritaPrintStreamPrintWriter {
	
	public static void main(String[] args) throws IOException {
	
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while(scanner.hasNext()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);
			
			Scanner scannerLinha = new Scanner(linha);
			scannerLinha.useLocale(Locale.US);
			scannerLinha.useDelimiter(",");

            String tipoConta = scannerLinha.next();
            int agencia = scannerLinha.nextInt();
            int numero = scannerLinha.nextInt();
            String titular = scannerLinha.next();
            double saldo = scannerLinha.nextDouble();

            System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %10s: %05.2f %n",tipoConta, agencia, numero, titular, saldo);
			
			scannerLinha.close();
//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
		}
			
			scanner.close();
	}
}
