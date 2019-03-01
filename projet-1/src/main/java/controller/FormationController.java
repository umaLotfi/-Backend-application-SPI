package controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.dosi.projet.Formation;

@RestController
@RequestMapping(path = "/formation")
public class FormationController {

	@Autowired
	private FormationBusiness formationBusiness;
	
	@Autowired
	public FormationController(FormationBusiness formationBusiness) {
		this.formationBusiness = formationBusiness;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Formation AddFormation(@RequestBody Formation formation) {
		return formationBusiness.AddFormation(formation);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void UpdateCandidat(@RequestBody Formation formation) {
		this.formationBusiness.UpdateFormation(formation);
	}
	
	@RequestMapping(value="/FindFormationByCodeFormation/{codeFormation}", method = RequestMethod.GET)
	public Optional<Formation> FindFormationByCodeFormation(@PathVariable String codeFormation) {
		return formationBusiness.FindFormationByCodeFormation(codeFormation);
	}
	
	@RequestMapping("/FindFormationByName/{nomFormation}")
  	public Formation FindFormationByName(@PathVariable String nomFormation) {
		return formationBusiness.FindFormationByName(nomFormation);
  	}
	
  	@RequestMapping("/getAllFormation")
  	public List<Formation> getAllFormation(){
  		return formationBusiness.getAllFormation();
  	}

	@RequestMapping("/deleteAllFormation")
  	public void deleteAllCandidat() {
		formationBusiness.deleteAllFormation();
	}
	
	@RequestMapping(value="/delete/{codeFormation}" ,method = RequestMethod.DELETE)
	public void DeleteCandidat(@PathVariable("codeFormation") String codeFormation){
		this.formationBusiness.DeleteFormation(codeFormation);
	}
}
