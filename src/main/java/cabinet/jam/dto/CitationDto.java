package cabinet.jam.dto;

import java.io.Serializable;
import java.sql.Date;

public class CitationDto implements Serializable{
	
	private int numero;
	private String num_rrm ;
	private int num_parquet ;
	private String date_an;
	private String date_mois;
	private String tribunal;
	private String instance;
	private String pers_nom;
	private String pers_prof;
	private String pers_num;
	private String pers_dom;
	private Date tribunal_date;
	private String tribunal_lieu;
	private String tribunal_dest;
	private String instance_lieu;
	private String matiere ;
	private String motif;
	private int prix_e;
	private int prix_t;
	private int prix_o;
	private int prix_c;
	private int prix_p;
	private int  prix_tva;
	
	private int prix_tr;
	private int prix_affr;
	private int prix_rcp;
	private int prix_total;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNum_rrm() {
		return num_rrm;
	}
	public void setNum_rrm(String num_rrm) {
		this.num_rrm = num_rrm;
	}
	public int getNum_parquet() {
		return num_parquet;
	}
	public void setNum_parquet(int num_parquet) {
		this.num_parquet = num_parquet;
	}
	public String getDate_an() {
		return date_an;
	}
	public void setDate_an(String date_an) {
		this.date_an = date_an;
	}
	public String getDate_mois() {
		return date_mois;
	}
	public void setDate_mois(String date_mois) {
		this.date_mois = date_mois;
	}
	public String getTribunal() {
		return tribunal;
	}
	public void setTribunal(String tribunal) {
		this.tribunal = tribunal;
	}
	public String getInstance() {
		return instance;
	}
	public void setInstance(String instance) {
		this.instance = instance;
	}
	public String getPers_nom() {
		return pers_nom;
	}
	public void setPers_nom(String pers_nom) {
		this.pers_nom = pers_nom;
	}
	public String getPers_prof() {
		return pers_prof;
	}
	public void setPers_prof(String pers_prof) {
		this.pers_prof = pers_prof;
	}
	public String getPers_num() {
		return pers_num;
	}
	public void setPers_num(String pers_num) {
		this.pers_num = pers_num;
	}
	public String getPers_dom() {
		return pers_dom;
	}
	public void setPers_dom(String pers_dom) {
		this.pers_dom = pers_dom;
	}
	public Date getTribunal_date() {
		return tribunal_date;
	}
	public void setTribunal_date(Date tribunal_date) {
		this.tribunal_date = tribunal_date;
	}
	public String getTribunal_lieu() {
		return tribunal_lieu;
	}
	public void setTribunal_lieu(String tribunal_lieu) {
		this.tribunal_lieu = tribunal_lieu;
	}
	public String getTribunal_dest() {
		return tribunal_dest;
	}
	public void setTribunal_dest(String tribunal_dest) {
		this.tribunal_dest = tribunal_dest;
	}
	public String getInstance_lieu() {
		return instance_lieu;
	}
	public void setInstance_lieu(String instance_lieu) {
		this.instance_lieu = instance_lieu;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public int getPrix_e() {
		return prix_e;
	}
	public void setPrix_e(int prix_e) {
		this.prix_e = prix_e;
	}
	public int getPrix_t() {
		return prix_t;
	}
	public void setPrix_t(int prix_t) {
		this.prix_t = prix_t;
	}
	public int getPrix_o() {
		return prix_o;
	}
	public void setPrix_o(int prix_o) {
		this.prix_o = prix_o;
	}
	public int getPrix_c() {
		return prix_c;
	}
	public void setPrix_c(int prix_c) {
		this.prix_c = prix_c;
	}
	public int getPrix_p() {
		return prix_p;
	}
	public void setPrix_p(int prix_p) {
		this.prix_p = prix_p;
	}
	public int getPrix_tva() {
		return prix_tva;
	}
	public void setPrix_tva(int prix_tva) {
		this.prix_tva = prix_tva;
	}
	public int getPrix_tr() {
		return prix_tr;
	}
	public void setPrix_tr(int prix_tr) {
		this.prix_tr = prix_tr;
	}
	public int getPrix_affr() {
		return prix_affr;
	}
	public void setPrix_affr(int prix_affr) {
		this.prix_affr = prix_affr;
	}
	public int getPrix_rcp() {
		return prix_rcp;
	}
	public void setPrix_rcp(int prix_rcp) {
		this.prix_rcp = prix_rcp;
	}
	public int getPrix_total() {
		return prix_total;
	}
	public void setPrix_total(int prix_total) {
		this.prix_total = prix_total;
	}
	

}
