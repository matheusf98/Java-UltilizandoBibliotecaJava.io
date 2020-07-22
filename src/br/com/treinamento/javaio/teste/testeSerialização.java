package br.com.treinamento.javaio.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class testeSerialização {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
//		String nome = "Matheus";
		
//		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("objeto.bin"));//Transformar em binario
//		
//		obj.writeObject(nome);
//		obj.close();
		
		ObjectInputStream obj = new ObjectInputStream(new FileInputStream("objeto.bin"));//Transformar em string
		String nome = (String) obj.readObject();
		System.out.println(nome);
		obj.close();
	}

}
