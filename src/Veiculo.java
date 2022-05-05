import java.util.ArrayList;

public class Veiculo {

	private int id_veiculo;
	private double preco;
	private String cor;
	private String modelo;
	private String marca;
	private ArrayList<Proprietario> prop = new ArrayList<Proprietario>();
	private ArrayList<Vendedor> vend = new ArrayList<Vendedor>();
	private ArrayList<tipoVeiculo> tipo = new ArrayList<tipoVeiculo>();
	
	public int getId_veiculo() {
		return id_veiculo;
	}
	public void setId_veiculo(int id_veiculo) {
		this.id_veiculo = id_veiculo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void Cadastrar(int id_veiculo, double preco, String cor, String modelo, String marca) {
		this.id_veiculo = id_veiculo;
		this.preco = preco;
		this.cor = cor;
		this.modelo = modelo;
		this.marca = marca;
		this.tipo = tipo;
	}
	
	public void adicionarProprietario(Proprietario prop) {
		this.prop.add(prop);
	}
	public void adicionarVendedor(Vendedor vend) {
		this.vend.add(vend);
	}
	
	public void adicionarTipo(tipoVeiculo tipo) {
		this.tipo.add(tipo);
	}
	
	public String mostrarVeiculo() {
		
		String lista = "\n";
		for(int x =0;x<this.prop.size();x++)
			lista += " Proprietario: " + this.prop.get(x).getNome() + " | CNH:  " + this.prop.get(x).getCnh();
		
		for(int j =0;j<this.vend.size();j++)
			lista += " Vendedor: " + this.vend.get(j).getNome() + " |ID:  " + this.vend.get(j).getId_vend();
		
		for(int h =0;h<this.tipo.size();h++)
			lista +=" Quantidade de Eixos : " + this.tipo.get(h).getQuantidadeDeEixos();
			
		return "ID: "+ this.getId_veiculo() +  "| Cor: " + this.getCor()+ "| Preco: " + this.getPreco() + 
				"| Modelo: " + this.getModelo() +"| Marca: " + this.getMarca() + lista;
	}
		
}
