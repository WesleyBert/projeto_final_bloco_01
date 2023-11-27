package Repository;

import Model.concessionariaModel;

public interface concessionariaRepository {

	// CRUD da Conta
		public void procurarPorRenavam(int renavam);
		public void listarTodas();
		public void cadastrarVeiculo(concessionariaModel concessionaria);
		public void atualizar(concessionariaModel concessionaria);
		public void deletar(int placa);
		
		// Métodos Bancários
		public void comprar(boolean disponivel);
		public void vender(boolean doc, boolean licenciamento);
		public void transferirProprietario(String antigoDono, String novoDono, int placa);
		
}
