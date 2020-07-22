package br.com.treinamento.javaio.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class TesteEncodignEUnicode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String c = "ç";
		System.out.println(c.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		//System.out.println(charset.displayName());
		
		byte[] bytes = c.getBytes("windows-1252");
		System.out.println(bytes.length + " windows-1252");
		
		bytes = c.getBytes("UTF-16");
		System.out.println(bytes.length + " UTF-16");
		
		bytes = c.getBytes("UTF-8");
		System.out.println(bytes.length + " UTF-8");

	}

}
