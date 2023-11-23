package ro.digitalnation.activitati;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//Annotation
@Repository
public interface CursRepository
 extends CrudRepository<Curs, Long> {
}