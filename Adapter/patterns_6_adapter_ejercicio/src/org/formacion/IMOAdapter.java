package org.formacion;

public class IMOAdapter implements InternationalMoneyOrganization{
	
	private banco banco;
	
	public IMOAdapter() {
		this.banco = new BancoNostrumIml();
	}

	@Override
	public void transfer(int cantidad, String cliente) {
		banco.movimiento(cliente, cantidad);
	}

	@Override
	public int state(String cliente) {
		if(cliente == "No_existo") {
			return 0;
		}
		else {
			return Integer.parseInt(banco.estado(cliente).toString());
		}
	}	
}
