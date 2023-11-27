package Model;

public class automovel extends concessionariaModel {


	    public automovel(int placa, String modelo, String cambio, String titular, boolean disponivel, int doc) {
		super(placa, modelo, cambio, titular, disponivel, doc);
		// TODO Auto-generated constructor stub
	}

		private boolean licenciamento;

	    public boolean getLicenciamento() {
	        return licenciamento;
	    }

	    public void setLicenciamento(boolean licenciamento) {
	        this.licenciamento = licenciamento;
	    }

	    public boolean vender() {
	        if (this.getDisponivel() && this.getLicenciamento()) {
	            System.out.println("\nO veículo está disponível para venda!");
	            return true;
	        } else {
	            System.out.println("Veículo não está disponível para venda!");
	            return false;
	        }
	    }

	    public void visualizar() {
	        super.visualizar();
	        System.out.println("Licenciamento: " + (this.licenciamento ? "Licenciado" : "Não licenciado"));
	    }
	}



