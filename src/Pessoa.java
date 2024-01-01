
public class Pessoa {

	private int id;
	private String nome;
	private String genero;
	private String estadoCivil;
	private int anoNascimento;
	private int anoActual;
	
	
	public Pessoa(int id, String nome, String genero, String estadoCivil, int anoNascimento, int anoActual) {
		
		this.id = id;
		this.nome = nome;
		this.genero = genero;
		this.estadoCivil = estadoCivil;
		this.anoNascimento = anoNascimento;
		this.anoActual = anoActual;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	public int getAnoNascimento() {
		return anoNascimento;
	}


	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}


	public int getAnoActual() {
		return anoActual;
	}


	public void setAnoActual(int anoActual) {
		this.anoActual = anoActual;
	}
	
	
	public int calcularIdade () {
		return anoActual - anoNascimento;
	}

	public String toString() {
		return nome + "-" + genero + "-" + estadoCivil + "-" + anoNascimento + "-" + anoActual + "-" + calcularIdade();
	}
	
	
}
