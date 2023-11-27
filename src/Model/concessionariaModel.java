package Model;

public abstract class concessionariaModel {
  
	private int renavam;
	private String modelo;
	private String cambio;
	private String titular;
	private int ano;
	private boolean disponivel;
	private int doc;

	public concessionariaModel(int renavam, String modelo, String cambio, String titular, boolean disponivel, int doc, int ano) {
		this.renavam = renavam;
		this.modelo = modelo;
		this.cambio = cambio;
		this.titular = titular;
		this.disponivel = disponivel;
		this.doc = doc;
		this.ano = ano;
	}

	public int getDoc() {
		return doc;
	}

	public void setDoc(int doc) {
		this.doc = doc;
	}

	public int getRenavam() {
		return renavam;
	}

	public void setRenava(int renavam) {
		this.renavam = renavam;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public boolean getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public boolean comprar(boolean disponivel) { 
		
		if(this.getDisponivel() == true) {
			System.out.println("\n Dispovel para venda!");
			return true;
		}
			
		this.setDisponivel(this.getDisponivel() == false);
		return false;
	}

	public void vender(int doc) {

		switch(this.doc) {
		case 1:
			System.out.println( "Adorariamos comprar seu carro!");
		break;
		case 2:
			System.out.println( "documentos do veiculos estão atrasados, volte com documentos em ordem!");
		break;
		}

	}
	
	public void visualizar() {
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados da Conta:");
		System.out.println("***********************************************************");
		System.out.println("Numero da Conta: " + this.renavam);
		System.out.println("Agência: " + this.modelo);
		System.out.println("Tipo da Conta: " + cambio);
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo: " + this.comprar(disponivel));

	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
  
}