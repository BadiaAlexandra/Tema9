package ro.digitalnation.activitati;

import javax.persistence.Entity;

@Entity
public class Tema implements Activitate {

	@Override
	public String getDescriere() {
		return "Exercitii practice pentru aplicarea cunostintelor noi";
	}

	@Override
	public String getDurata() {
		return "4-6h";
	}

}
