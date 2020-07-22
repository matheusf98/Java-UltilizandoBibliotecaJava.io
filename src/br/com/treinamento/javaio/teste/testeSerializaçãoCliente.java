package br.com.treinamento.javaio.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class testeSerializaçãoCliente {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Matheus");
		cliente.setProfissao("Dev");
		cliente.setCpf("555.555.555-55");
		
		ObjectInputStream cli = new ObjectInputStream(new FileInputStream("cliente.bin"));//Transformar em string
		Cliente nomeCliente = (Cliente) cli.readObject();
		System.out.println(nomeCliente.getCpf());
		cli.close();
		
//		ObjectOutputStream cli = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		cli.writeObject(cliente);
//		cli.close();
		
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
