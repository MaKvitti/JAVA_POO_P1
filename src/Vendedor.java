
public class Vendedor extends Pessoa {
	
	private int id_vend;
	private double comissao;
	private int horasTrabalhadasSemanal;
	private double salario;
	
	public int getId_vend() {
		return id_vend;
	}
	public void setId_vend(int id_vend) {
		this.id_vend = id_vend;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public int getHorasTrabalhadasSemanal() {
		return horasTrabalhadasSemanal;
	}
	public void setHorasTrabalhadasSemanal(int horasTrabalhadasSemanal) {
		this.horasTrabalhadasSemanal = horasTrabalhadasSemanal;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void Cadastrar(String nome,int cpf,int rg,String genero,int id_vend, double comissao, int horasTrabalhadasSemanal, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.genero = genero;
		this.id_vend = id_vend;
		this.comissao = comissao;
		this.horasTrabalhadasSemanal = horasTrabalhadasSemanal;
		this.salario = salario;
	}
	

}
