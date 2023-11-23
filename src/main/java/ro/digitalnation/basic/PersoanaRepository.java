package ro.digitalnation.basic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//Annotation
@Repository
public interface PersoanaRepository
 extends CrudRepository<Persoana, Long> {
}