import java.io.*;

public class FileLeak {

	public static void main(String[] args) throws IOException {
		try (FileWriter leaked = new FileWriter("fic.txt")) {
			leaked.write("Bonjour Limoges !\n");
		}
		catch(IOException e)
		{
			System.out.println("Erreur");
		}
	}
}

