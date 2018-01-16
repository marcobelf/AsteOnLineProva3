package it.unisannio.tsw.rosariogoglia.modelImpl;

import java.util.Date;


import it.unisannio.tsw.rosariogoglia.model.MessaggioPrivato;
import it.unisannio.tsw.rosariogoglia.model.UtenteRegistrato;


public class MessaggioPrivatoImpl implements MessaggioPrivato{
	
	private Integer idMessaggioPrivato;
	private String testo;
	private String nomeUtente;
	private String oggetto;
	private Date dataInvio;
	private Integer idUtenteRegistratoMittente; //Mittente del messaggio
	private UtenteRegistrato utenteRegistratoMittente;
	private Integer idUtenteRegistratoDestinatario;
	private UtenteRegistrato utenteRegistratoDestinatario;	//Destinatario del messaggio
	
	public MessaggioPrivatoImpl() {
	}
	
	public Integer getIdMessaggioPrivato() {
		return idMessaggioPrivato;
	}

	public void setIdMessaggioPrivato(Integer idMessaggioPrivato) {
		this.idMessaggioPrivato = idMessaggioPrivato;
	}

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	public String getNomeUtente() {
		return nomeUtente;
	}

	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}

	public String getOggetto() {
		return oggetto;
	}

	public void setOggetto(String oggetto) {
		this.oggetto = oggetto;
	}

	public Date getDataInvio() {
		return dataInvio;
	}

	public void setDataInvio(Date dataInvio) {
		this.dataInvio = dataInvio;
	}

	public Integer getIdUtenteRegistratoMittente() {
		return idUtenteRegistratoMittente;
	}

	public void setIdUtenteRegistratoMittente(Integer idUtenteRegistratoMittente) {
		this.idUtenteRegistratoMittente = idUtenteRegistratoMittente;
	}

	public UtenteRegistrato getUtenteRegistratoMittente() {
		return utenteRegistratoMittente;
	}

	public void setUtenteRegistratoMittente(
			UtenteRegistrato utenteRegistratoMittente) {
		this.utenteRegistratoMittente = utenteRegistratoMittente;
	}

	public Integer getIdUtenteRegistratoDestinatario() {
		return idUtenteRegistratoDestinatario;
	}

	public void setIdUtenteRegistratoDestinatario(
			Integer idUtenteRegistratoDestinatario) {
		this.idUtenteRegistratoDestinatario = idUtenteRegistratoDestinatario;
	}

	public UtenteRegistrato getUtenteRegistratoDestinatario() {
		return utenteRegistratoDestinatario;
	}

	public void setUtenteRegistratoDestinatario(
			UtenteRegistrato utenteRegistratoDestinatario) {
		this.utenteRegistratoDestinatario = utenteRegistratoDestinatario;
	}

	public String toString() {
		return (this.idMessaggioPrivato + " " + this.testo + " "
				+ this.nomeUtente + " " + this.oggetto + " " + this.dataInvio
				+ " " + this.idUtenteRegistratoMittente + " " + this.idUtenteRegistratoDestinatario);
	}

	public boolean equals(Object messPrivato) {
		return (this.testo.equals((String) messPrivato));
	}
	

}
