package ro.digitalnation.activitati;

import javax.persistence.Entity;

@Entity
public interface Activitate {
	
	public String getDescriere();
	public String getDurata();
}
