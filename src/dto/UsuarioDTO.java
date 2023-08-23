package dto;

public class UsuarioDTO {
	
	private String nome;
	private int idade;
	private int hashID;
	
	public UsuarioDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public UsuarioDTO(String nome,int idade,int hashID) {
		setNome(nome);
		setIdade(idade);
		setHashID(hashID);
	}
	
	public String toString() {
		return "Nome: " + nome + " idade: " + idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getHashID() {
		return hashID;
	}
	public void setHashID(int hashID) {
		this.hashID = hashID;
	}


}
