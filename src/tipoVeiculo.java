
public class tipoVeiculo {

	private int id_tipo;
	private int quantidadeDeEixos;
	private String vinculadoPublico;
	private String vinculadoPrivado;
	
	public int getId_tipo() {
		return id_tipo;
	}
	public void setId_tipo(int id_tipo) {
		this.id_tipo = id_tipo;
	}
	public int getQuantidadeDeEixos() {
		return quantidadeDeEixos;
	}
	public void setQuantidadeDeEixos(int quantidadeDeEixos) {
		this.quantidadeDeEixos = quantidadeDeEixos;
	}
	public String getVinculadoPublico() {
		return vinculadoPublico;
	}
	public void setVinculadoPublico(String vinculadoPublico) {
		this.vinculadoPublico = vinculadoPublico;
	}
	public String getVinculadoPrivado() {
		return vinculadoPrivado;
	}
	public void setVinculadoPrivado(String vinculadoPrivado) {
		this.vinculadoPrivado = vinculadoPrivado;
	}
	
	public void Cadastrar(int id_tipo, int quantidadeDeEixos, String vinculadoPublico, String vinculadoPrivado) {
		this.id_tipo = id_tipo;
		this.quantidadeDeEixos = quantidadeDeEixos;
		this.vinculadoPublico = vinculadoPublico;
		this.vinculadoPrivado = vinculadoPrivado;
	}
	

}
