package ro.digitalnation.restuflWebService;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ro.digitalnation.activitati.Activitate;
import ro.digitalnation.activitati.CursRepository;
import ro.digitalnation.activitati.Curs;
import ro.digitalnation.basic.Explorer;
import ro.digitalnation.basic.Persoana;
import ro.digitalnation.basic.PersoanaRepository;
import ro.digitalnation.structure.Track;

@RestController
public class TrackController {

	private final Track track = new Track();
	
	//@Autowired
    //private CursRepository cursRepository;
	
	@Autowired
    private PersoanaRepository persoanaRepository;
	
	//@GetMapping("/cursuri")
	//public List<Curs> curs() {
	//	return (List<Curs>)cursRepository.findAll();
	//}
	
	@GetMapping("/persoane")
	public List<Persoana> persoane() {
		return (List<Persoana>)persoanaRepository.findAll();
	}
	
//	@GetMapping("/exploreri")
//	public List<Persoana> exploreri(){
//		return track.getCurs().getExploreri();
//	}
//	
//	@GetMapping("/trainer")
//	public Persoana trainer() {
//		return track.getCurs().getTrainer();
//	}
//	
//	@GetMapping("/activitati")
//	public LinkedHashMap<String, Activitate> activitati(){
//		return track.getCurs().getActivitati();
//	}
//	
//	@GetMapping("/activitate")
//	public Activitate activitate(@RequestParam(value = "name") String name) {
//		return track.getCurs().getActivitati().get(name);
//	}
//	
//	@GetMapping("/explorer/{id}")
//	public Activitate exploreri(@PathVariable String id){
//		return track.getCurs().getActivitati().get(id);
//	}
	
	@PostMapping("/adaugaPersoana")
	public ResponseEntity adaugaExplorer(@RequestBody Persoana p) {
		persoanaRepository.save(p);
		return ResponseEntity.ok(HttpStatus.OK);
	}
}