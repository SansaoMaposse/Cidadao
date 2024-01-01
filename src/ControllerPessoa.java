import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ControllerPessoa {
	
	public static void escreverNoFicheiro (int id, String nome, String genero, String estadoCivil, int anoNascimento, int anoActual) throws IOException{
		
		BufferedWriter buffer = new BufferedWriter(new FileWriter("pessoa.txt", true));
		Pessoa pessoa = new Pessoa(id, nome, genero, estadoCivil, anoNascimento, anoActual);
		buffer.write(pessoa.toString());
		buffer.newLine();
		buffer.close();
	}
	
	public static ArrayList<Pessoa> listarPessoas () throws IOException{
		
		BufferedReader buffer = new BufferedReader(new FileReader("pessoa.txt"));
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		String linha, pessoa[];
		
		linha = buffer.readLine();
		
		while(linha != null && !linha.isEmpty()) {
			pessoa = linha.split("-");
			int id = Integer.parseInt(pessoa[0]);
			String nome = pessoa [1];
			String genero = pessoa [2];
			String estadoCivil = pessoa [3];
			int anoNascimento = Integer.parseInt(pessoa[4]);
			int anoActual = Integer.parseInt(pessoa[5]);
			
			pessoas.add(new Pessoa(id, nome, genero, estadoCivil, anoNascimento, anoActual));
			linha = buffer.readLine();
		}
		buffer.close();
		return pessoas;
	}
	
	public static void actualizarNoFicheiro (ArrayList<Pessoa> pessoas) throws IOException{
		BufferedWriter buffer = new BufferedWriter(new FileWriter("pessoa.txt", true));
		
		for (Pessoa pessoa : pessoas) {
			buffer.write(pessoa.toString());
			buffer.newLine();
			
		}
		buffer.close();
	}
	
	public static void actualizarPessoa (int id, String nome, String genero, String estadoCivil, int anoNascimento, int anoActual) throws IOException{
		
		ArrayList<Pessoa> pessoas = listarPessoas();
		
		for (Pessoa pessoa : pessoas) {
			if (id == pessoa.getId()) {
				pessoa.setNome(nome);
				pessoa.setGenero(genero);
				pessoa.setEstadoCivil(estadoCivil);
				pessoa.setAnoNascimento(anoNascimento);
				pessoa.setAnoActual(anoActual);
				
			}
			
		}
		actualizarNoFicheiro(pessoas);
	}

}
