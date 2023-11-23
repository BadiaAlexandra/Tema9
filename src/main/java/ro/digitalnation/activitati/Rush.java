package ro.digitalnation.activitati;

import javax.persistence.Entity;

@Entity
public class Rush implements Activitate {

	@Override
	public String getDescriere() {
		return "Activitate de lucru colaborativ & Q&A";
	}

	@Override
	public String getDurata() {
		return "2h";
	}
	
}
