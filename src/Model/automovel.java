package Model;

public class automovel extends concessionariaModel {


	    public automovel(int renavam, String modelo, String cambio, String titular, boolean disponivel, int doc, int ano) {
		super(renavam, modelo, cambio, titular, disponivel, doc,ano);
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
	        System.out.println("\n\n***********************************************************");
			System.out.println("Dados da Conta:");
			System.out.println("***********************************************************");
			System.out.println("Numero do renavam: " + this.getRenavam());
			System.out.println("modelo: " + this.getModelo());
			System.out.println("Tipo de cambio: " + getCambio());
			System.out.println("Titular: " + this.getTitular());
			System.out.println("Disponivel " + this.getDisponivel());
			System.out.println("documento: " + this.getDoc());
			System.out.println("ano: " + this.getAno());
	        System.out.println("Licenciamento: " + (this.licenciamento ? "Licenciado" : "Não licenciado"));
	    }
	}



