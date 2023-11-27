package Controller;

import java.util.ArrayList;

import Model.automovel;
import Model.concessionariaModel;
import Repository.concessionariaRepository;

public class concessionariaController implements concessionariaRepository {
	int numero = 0;

	private ArrayList<automovel>listaCarros = new ArrayList<automovel>();
	@Override
	public void procurarPorRenavam(int Renavam) {
		var automovel = buscarNaCollection(Renavam);
		
		if(automovel != null) {
			automovel.visualizar();
		}else {
			System.out.println("/o carro com renavam " + Renavam+ "não foi encontrado");
		}
	}

	@Override
	public void listarTodas() {
		for(var automovel : listaCarros) {
			automovel.visualizar();
		}
		
	}

	@Override
	public void cadastrarVeiculo(concessionariaModel concessionaria) {
		listaCarros.add((automovel) concessionaria);
		System.out.println("Veiculo cadastradado com sucesso!");
		
	}

	@Override
	public void atualizar(concessionariaModel concessionaria) {
		var buscarCarro = buscarNaCollection(concessionaria.getRenavam());
		
		if(buscarCarro != null) {
			listaCarros.set(listaCarros.indexOf(buscarCarro), (automovel) concessionaria);
			System.out.println("\n Carro com renavam :" + concessionaria.getRenavam() + " foi atualizado com sucesso!");

		}else {
			System.out.println("\n Carro com renavam :" + concessionaria.getRenavam() + "não foi encontrado");
		}
	}

	@Override
	public void deletar(int renavam) {
		var carro = buscarNaCollection(numero);
		
		if(carro != null ) {
			if(listaCarros.remove(carro) == true)
				System.out.println("Conta com o renavam " + renavam + "foi deletado com sucesso");
		}else {
			System.out.println("Conta com renavam " +renavam + " não encontrado");
		}
		
	}

	public void comprar(boolean disponivel,int renavam) {
		var carro = buscarNaCollection(renavam);
		
		if(carro != null) {
			if(carro.comprar(disponivel) == true) {
				System.out.println("\n A compra pode ser realizada com sucesso!");
			}
			else {
				System.out.println("Compra não pode ser efeituada!");
			}
		}
		
	
	}
	
	public int gerarnumero() {

		return ++ numero;
	}

	public automovel buscarNaCollection(int renavam) {
		for(var automovel : listaCarros) {
			if(automovel.getRenavam() == renavam) {
				return automovel;
			}
		}
		return null;
	}

	@Override
	public void comprar(boolean disponivel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vender(boolean doc, boolean licenciamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferirProprietario(String antigoDono, String novoDono, int placa) {
		// TODO Auto-generated method stub
		
	}
	
}
