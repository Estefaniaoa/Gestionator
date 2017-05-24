package es.ucm.fdi.negocio;


import es.ucm.fdi.integracion.DAOPedido;
import es.ucm.fdi.integracion.TPedido;

public class BuisnessPedido {
	private DAOPedido daoPedido;
	private TPedido tPedido;
	
	public BuisnessPedido(DAOPedido daoPedido){
		this.daoPedido = daoPedido;
	}
	
	public void Añadir(TPedido ped,String id) {
		this.daoPedido.add(ped, id);
		
	}
	
	public TPedido leer(String id) {
		return this.daoPedido.leer(id);
	}
}
