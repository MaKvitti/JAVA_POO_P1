
public class Proprietario extends Pessoa {
	
	private int id_prop;
	private int cnh;
	private int telefone;
	private String endereco;

	public int getId_prop() {
		return id_prop;
	}
	public void setId_prop(int id_prop) {
		this.id_prop = id_prop;
	}
	public int getCnh() {
		return cnh;
	}
	public void setCnh(int cnh) {
		this.cnh = cnh;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void Cadastrar(String nome,int cpf,int rg,String genero,int id_prop, int cnh, int telefone, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.genero = genero;
		this.id_prop = id_prop;
		this.cnh = cnh;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	

}
