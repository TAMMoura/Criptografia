import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;

public class Decodificando {

	public static void main(String[] args) {
		
		File arquivo = new File("answer.json");
		try {
			FileReader ler = new FileReader(arquivo);
			BufferedReader lerb = new BufferedReader(ler);
			String linha = lerb.readLine();
			
			while(linha != null) {
				System.out.println(linha);
				linha = lerb.readLine();
			
			}
		}
		catch(IOException ex){
	}
		char ascii,  x, y;
		String cifrado = "zkb gr zh qhyhu kdyh wlph wr gr lw uljkw, exw dozdbv kdyh wlph wr gr lw ryhu? xqnqrzq";
		for (int i = 0; i < cifrado.length(); i++) {
			if (cifrado.charAt(i) >= 97 && cifrado.charAt(i) <= 99) {
				ascii = (char) (cifrado.charAt(i) + 23);
				System.out.print(ascii + "");
			} else {
	            if (cifrado.charAt(i) >= 100 && cifrado.charAt(i) <= 122) {
	                if ((int) (cifrado.charAt(i) - 3) > 122) {
	                    x = (char) (cifrado.charAt(i) - 3);
	                    y = (char) (x - 122);
	                    ascii = (char) (96 + y);
	                    System.out.print(ascii + "");
	                } else {
	                    ascii = (char) (cifrado.charAt(i) - 3);
	                    System.out.print(ascii + "");

	                }
	            }
	            else {
	            	ascii = (char) (cifrado.charAt(i));
	            	System.out.print(ascii + "");
	            }
			}
}
}
}