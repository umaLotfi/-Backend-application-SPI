package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dosi.projet.Enseignant;


@RestController
@RequestMapping(path = "/enseignant")
public class EnseignantController {

	@Autowired
	private EnseignantBusiness enseignantBusiness;
	
	/*@Autowired
	public EnseignantController(EnseignantBusiness enseignantbusiness) {
		this.enseignantbusiness = enseignantbusiness;
	}*/
	
	@RequestMapping(method = RequestMethod.POST)
	public Enseignant AddEnseignant(@RequestBody Enseignant enseignant) {
		return enseignantBusiness.AddEnseignant(enseignant);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void UpdateEnseignant(@RequestBody Enseignant enseignant) {
		this.enseignantBusiness.UpdateEnseignant(enseignant);
	}
	
	@RequestMapping(value="/FindEnseignantByNumeroEns/{numeroEnseignant}", method = RequestMethod.GET)
	public Enseignant FindEnseignantByNumeroEns(@PathVariable int numeroEnseignant) {
		return enseignantBusiness.FindEnseignantByNumeroEns(numeroEnseignant);
	}
	
	@RequestMapping("/FindEnseignantByName/{nomEnseignant}")
  	public Enseignant FindEnseignantByName(@PathVariable String nomEnseignant) {
		return enseignantBusiness.FindEnseignantByName(nomEnseignant);
  	}

	@RequestMapping("/FindEnseignantByEmail/{emailEnseignant}")
  	public Enseignant FindEnseignantByEmail(@PathVariable String emailEnseignant) {
		return enseignantBusiness.FindEnseignantByEmail(emailEnseignant);
  	}
	
  	@RequestMapping("/getAllEnseignant")
  	public List<Enseignant> getAllEnseignant(){
  		return enseignantBusiness.getAllEnseignant();
  	}

	@RequestMapping("/deleteAllEnseignant")
  	public void deleteAllEnseignant() {
		enseignantBusiness.deleteAllEnseignant();
	}
	
	@RequestMapping(value="/delete/{numeroEnseignant}" ,method = RequestMethod.DELETE)
	public void DeleteEnseignant(@PathVariable("numeroEnseignant") String numeroEnseignant){
		this.enseignantBusiness.DeleteEnseignant(numeroEnseignant);
	}
}
