package it.unisannio.tsw.rosariogoglia.modelImpl;

import java.util.List;

import it.unisannio.tsw.rosariogoglia.model.Prodotto;
import it.unisannio.tsw.rosariogoglia.model.Produttore;

public class ProduttoreImpl implements Produttore{

	public ProduttoreImpl() {
		super();
	}
	
	public int getIdProduttore() {
		return idProduttore;
	}
	public void setIdProduttore(int idProduttore) {
		this.idProduttore = idProduttore;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
	public List<Prodotto> getProdotti() {
		return listaProdotti;
	}

	public void setProdotti(List<Prodotto> prodotti) {
		this.listaProdotti = prodotti;
	}

	public String toString(){
		return(this.idProduttore + " " + this.nome + " " + this.website);
	}
	
	public boolean equals(Object nome){
		return(this.nome.equals((String) nome));
	}
	
	private int idProduttore;
	private String nome;
	private String website;
	private List<Prodotto> listaProdotti;
	
}
