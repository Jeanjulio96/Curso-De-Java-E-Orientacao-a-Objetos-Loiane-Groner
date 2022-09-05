package ExerciciosAula36;

public class Contato {

	private String nome;
	private String telefone;
	private String email;

	Contato(){
		
	}

	public Contato(String nome, String telefone, String email) {

		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String obterInfo() {
		
		return "Nome: " +"\n" + nome +"\n" + "Telefone: " + "\n" + telefone + "Email: " + "\n" + email;
	}

}
