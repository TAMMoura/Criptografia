import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;

public class Sha1 {

	public static void main(String[] args) {
		
		String frase = "why do we never have time to do it right, but always have time to do it over? unknown";
		String sha1 = "";
		
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-1");
	        digest.reset();
	        digest.update(frase.getBytes("utf8"));
	        sha1 = String.format("%040x", new BigInteger(1, digest.digest()));
		} catch (Exception e){
			e.printStackTrace();
		}

		System.out.println(sha1);
		
		File arquivo = new File("answer.json");
		try{
			FileWriter fw = new FileWriter(arquivo);
			BufferedWriter escrever = new BufferedWriter(fw);
			escrever.write(sha1);
			escrever.close();
		}
		catch(IOException ex){
			
		}
		
		
		}
}