import java.net.*;
import org.json.simple.JSONObject;
import java.io.*;

public class Criptografia {

	public static void main(String[] args) throws Exception {
		
		URL code = new URL("https://api.codenation.dev/v1/challenge/dev-ps/generate-data?token=26638ee40bce0e009473dba93a68d2e1ee4b3516");
		URLConnection cn = code.openConnection();
		File arquivo = new File("answer.json");
		try {
			arquivo.createNewFile();
			BufferedReader in = new BufferedReader(new InputStreamReader(cn.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				FileWriter fw = new FileWriter(arquivo);
				BufferedWriter escrever = new BufferedWriter(fw);
				escrever.write(inputLine);
				escrever.close();
				fw.close();
			}
			in.close();
		}
		catch(IOException ex) {
			
		}
		
	}
}