package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dosi.projet.Candidat;

@RestController
@RequestMapping(value = "/candidat")
public class CandidatController {

	@Autowired
    private CandidatBusiness candidatBusiness;
	
	@RequestMapping(value = "/getAllCandidat", method = RequestMethod.GET)
	public List<Candidat> ListCandidat() {
		return candidatBusiness.getAllCandidat();
	}
	
	@RequestMapping(value="/FindCandidatByNoCandidat/{NumeroCandidat}", method = RequestMethod.GET)
	public Optional<Candidat> FindCandidatByNoCandidat(@PathVariable String NumeroCandidat) {
		return candidatBusiness.FindCandidatByNoCandidat(NumeroCandidat);
	}
	@RequestMapping(method = RequestMethod.POST)
	public Candidat AddCandidat(@RequestBody Candidat candidat) {
		return candidatBusiness.AddCandidat(candidat);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void UpdateCandidat(@RequestBody Candidat candidat) {
		this.candidatBusiness.UpdateCandidat(candidat);
	}
	
	@RequestMapping("/deleteAllCandidat")
  	public void deleteAllCandidat() {
		candidatBusiness.deleteAllCandidat();
	}
	
	@RequestMapping(value="/delete/{NumeroCandidat}" ,method = RequestMethod.DELETE)
	public void DeleteCandidat(@PathVariable("NumeroCandidat")  String NumeroCandidat){
		this.candidatBusiness.DeleteCandidat(NumeroCandidat);
	}
	
	@RequestMapping(value="/FindCandidatByUniv/{Univ}" ,method = RequestMethod.GET)
	public Candidat FindCandidatByUniv(@PathVariable("Univ") String Univ){
		return candidatBusiness.FindCandidatByUniv(Univ);
	}
	
	@RequestMapping(value="/FindCandidatByName/{nom}", method = RequestMethod.GET)
	public Candidat FindCandidatByName(@PathVariable("nom") String nom){
		return candidatBusiness.FindCandidatByName(nom);
	}
	

}
