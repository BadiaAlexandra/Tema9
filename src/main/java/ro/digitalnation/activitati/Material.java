package ro.digitalnation.activitati;

import javax.persistence.Entity;

@Entity
public class Material implements Activitate {

	@Override
	public String getDescriere() {
		return "Material teoretic pentru insusirea de noi cunostinte";
	}
	
	@Override
	public String getDurata() {
		return "2-4h";
	}
}
