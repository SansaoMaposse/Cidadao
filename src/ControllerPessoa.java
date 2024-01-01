import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ControllerPessoa {
	
	public static void escreverNoFiche (int id, String nome, String genero, String estadoCivil, int anoNascimento, int anoActual) throws IOException{
		
		BufferedWriter buffer = new BufferedWriter(new FileWriter("pessoa.txt", true));
		Pessoa pessoa = new Pessoa(id, nome, genero, estadoCivil, anoNascimento, anoActual);
		buffer.write(pessoa.toString());
		buffer.newLine();
		buffer.close();
	}

}
