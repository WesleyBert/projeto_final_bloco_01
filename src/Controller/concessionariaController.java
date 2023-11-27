package Controller;

import java.util.ArrayList;

import Model.automovel;
import Model.concessionariaModel;
import Repository.concessionariaRepository;

public class concessionariaController implements concessionariaRepository {

	private ArrayList<automovel>listaCarros = new ArrayList<automovel>();
	@Override
	public void procurarPorPlaca(int placa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTodas() {
		for(var automovel : listaCarros) {
			automovel.visualizar();
		}
		
	}

	@Override
	public void cadastrarVeiculo(concessionariaModel concessionaria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(concessionariaModel concessionaria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int placa) {
		// TODO Auto-generated method stub
		
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
	
	public int gerarPlaca() {
		int placa = 0;
		return ++ placa;
	}

}
