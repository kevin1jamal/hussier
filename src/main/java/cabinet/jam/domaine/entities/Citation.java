package cabinet.jam.domaine.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class Citation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
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
	
	

}
