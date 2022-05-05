import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Proprietario> proprietario = new ArrayList<Proprietario>();
		ArrayList<Vendedor> vendedor = new ArrayList<Vendedor>();
		ArrayList<tipoVeiculo> tipo = new ArrayList<tipoVeiculo>();
		ArrayList<Veiculo> veiculo = new ArrayList<Veiculo>();
		
		int esc = 1;
		do {
			Scanner s = new Scanner(System.in);
			System.out.println("\n1 - Cadastrar Vendedor\r\n" + "2 - Cadastrar Proprietario\r\n" + "3 - Cadastrar TipoVeiculo\r\n" +
			"4 - Cadastrar Veiculos\r\n" + "5 - Mostrar Veiculos\r\n" + "0 - Sair");
			esc = s.nextInt();
			
			if(esc==1) {			
				
				System.out.print("Nome: ");
				String nome=s.next();
				
				System.out.print("CPF: ");
				int cpf = s.nextInt();
				
				System.out.print("RG: ");
				int rg = s.nextInt();
				
				System.out.print("Genero: ");
				String genero=s.next();
				
				System.out.print("ID: ");
				int id_vend = s.nextInt();
				
				System.out.print("Comissão: ");
				double comissao = s.nextDouble();
				
				System.out.print("Salario: ");
				double salario = s.nextDouble();
				
				System.out.print("Horas Trabalhadas Semanalmente: ");
				int horasTrabalhadasSemanal = s.nextInt();
				
				Vendedor vend = new Vendedor();
				vend.Cadastrar(nome, cpf, rg, genero, id_vend, comissao, horasTrabalhadasSemanal, salario);
				vendedor.add(vend);
			}
			else if(esc==2) {
	
				
				System.out.print("Nome: ");
				String nome=s.next();
				
				System.out.print("CPF: ");
				int cpf = s.nextInt();
				
				System.out.print("RG: ");
				int rg = s.nextInt();
				
				System.out.print("Genero: ");
				String genero=s.next();
				
				System.out.print("ID: ");
				int id_prop = s.nextInt();
				
				System.out.print("CNH: ");
				int cnh=s.nextInt();
				
				System.out.print("Telefone: ");
				int telefone = s.nextInt();
				
				System.out.print("Endereço: ");
				String endereco = s.next();
		
				Proprietario prop = new Proprietario();
				prop.Cadastrar(nome, cpf, rg, genero, id_prop, cnh, telefone, endereco);
				
				proprietario.add(prop);
			}
			else if(esc==3) {
				
				System.out.print("ID: ");
				int id_tipo=s.nextInt();
				
				System.out.print("Vinculo Publico: ");
				String vinculadoPublico = s.next();
				
				System.out.print("Vinculo Privado: ");
				String vinculadoPrivado = s.next();
				
				System.out.print("Quantidade de Eixos: ");
				int quantidadeDeEixos = s.nextInt();
				
				tipoVeiculo tip = new tipoVeiculo();
				tip.Cadastrar(id_tipo, quantidadeDeEixos, vinculadoPublico, vinculadoPrivado);
		
				tipo.add(tip);

			}
			else if(esc==4) {
				
				
				System.out.print("ID: ");
				int id_veiculo=s.nextInt();
				
				System.out.print("Preco: ");
				double preco = s.nextDouble();
				
				System.out.print("Cor: ");
				String cor = s.next();
				
				System.out.print("Modelo: ");
				String modelo = s.next();
				
				System.out.print("Marca: ");
				String marca = s.next();
				
				
				

				Veiculo veic = new Veiculo();
				veic.Cadastrar(id_veiculo, preco, cor, modelo, marca);
				veiculo.add(veic);
				
				System.out.print("ID Vendedor: ");
				int idVend = s.nextInt();
				
				System.out.print("ID Proprietario: ");
				int idProp = s.nextInt();
				
				System.out.print("ID do tipo do veiculo: ");
				int idtipo = s.nextInt();
				
				for(int i=0;i<vendedor.size();i++) {
					if(idVend == vendedor.get(i).getId_vend());
					veic.adicionarVendedor(vendedor.get(i));
				}
				for(int j=0;j<proprietario.size();j++) {
					if(idProp == proprietario.get(j).getId_prop());
					veic.adicionarProprietario(proprietario.get(j));
				}
				for(int h=0;h<vendedor.size();h++) {
					if(idtipo == tipo.get(h).getId_tipo());
					veic.adicionarTipo(tipo.get(h));
				}
				
			}
			else if(esc==5) {
				
				for(int j=0;j<veiculo.size();j++) {
					System.out.print(veiculo.get(j).mostrarVeiculo());
				}
			}
			
			}while(esc!=0);

	}


	}


