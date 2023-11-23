package ro.digitalnation.restuflWebService;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ro.digitalnation.activitati.Activitate;
import ro.digitalnation.activitati.Curs;
import ro.digitalnation.basic.Explorer;
import ro.digitalnation.basic.Persoana;
import ro.digitalnation.structure.Track;

@RestController
public class TrackController {

	private final Track track = new Track();
	
	@GetMapping("/curs")
	public Curs curs() {
		return track.getCurs();
	}
	
	@GetMapping("/exploreri")
	public List<Persoana> exploreri(){
		return track.getCurs().getExploreri();
	}
	
	@GetMapping("/trainer")
	public Persoana trainer() {
		return track.getCurs().getTrainer();
	}
	
	@GetMapping("/activitati")
	public LinkedHashMap<String, Activitate> activitati(){
		return track.getCurs().getActivitati();
	}
	
	@GetMapping("/activitate")
	public Activitate activitate(@RequestParam(value = "name") String name) {
		return track.getCurs().getActivitati().get(name);
	}
	
	@GetMapping("/explorer/{id}")
	public Activitate exploreri(@PathVariable String id){
		return track.getCurs().getActivitati().get(id);
	}
	
	@PostMapping("/adaugaExplorer")
	public ResponseEntity adaugaExplorer(@RequestBody Explorer explorer) {
		
		String identificatorCurent = explorer.obtineIdentificator();
		ArrayList<Persoana> exploreri = track.getCurs().getExploreri();
		
		for (Persoana e : exploreri)
		{
			Explorer itExplorer = new Explorer(e.getNume()
					, e.getPrenume(), e.getOras(), e.getVarsta(), e.isCasatorita());
			
			if (itExplorer.obtineIdentificator().compareToIgnoreCase(identificatorCurent) == 0)
			{
				System.out.println("Am gasit deja.");
				return ResponseEntity.ok(HttpStatus.OK);
			}
		}
		
		exploreri.add(explorer);
		track.getCurs().setExploreri(exploreri);
		return ResponseEntity.ok(HttpStatus.OK);
	}
}