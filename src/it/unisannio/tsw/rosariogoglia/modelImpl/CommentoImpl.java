package it.unisannio.tsw.rosariogoglia.modelImpl;

import java.util.Date;

import it.unisannio.tsw.rosariogoglia.model.Commento;
import it.unisannio.tsw.rosariogoglia.model.Inserzione;
import it.unisannio.tsw.rosariogoglia.model.UtenteRegistrato;



public class CommentoImpl implements Commento{
	
	private int idcommento;
	private String commento;
	private Date dataPubblicazione;
	private Integer idUtenteCommenta;
	private UtenteRegistrato utenteCommenta;
	private Integer idInserzione;
	private Inserzione inserzione;	
	
	public CommentoImpl() {
	}

	public int getIdCommento() {
		return idcommento;
	}
	public void setIdCommento(int idcommento) {
		this.idcommento = idcommento;
	}
	public String getCommento() {
		return commento;
	}
	public void setCommento(String commento) {
		this.commento = commento;
	}
	public Date getDataPubblicazione() {
		return dataPubblicazione;
	}
	public void setDataPubblicazione(Date dataPubblicazione) {
		this.dataPubblicazione = dataPubblicazione;
	}
	public Integer getIdUtenteCommenta() {
		return idUtenteCommenta;
	}
	public void setIdUtenteCommenta(Integer idUtenteCommenta) {
		this.idUtenteCommenta = idUtenteCommenta;
	}
	public UtenteRegistrato getUtenteCommenta() {
		return utenteCommenta;
	}
	public void setUtenteCommenta(UtenteRegistrato utenteCommenta) {
		this.utenteCommenta = utenteCommenta;
	}
	public Integer getIdInserzione() {
		return idInserzione;
	}
	public void setIdInserzione(Integer idInserzione) {
		this.idInserzione = idInserzione;
	}
	public Inserzione getInserzione() {
		return inserzione;
	}
	public void setInserzione(Inserzione inserzione) {
		this.inserzione = inserzione;
	}

	public String toString(){
		return(this.commento + " " + this.dataPubblicazione + " " + this.idUtenteCommenta + " " + this.idInserzione);
	}

	public boolean equals(Object commento){
		return(this.commento.equals((String) commento));
	}

}
