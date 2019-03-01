package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dosi.projet.Formation;

import dao.FormationRepository;


@Service
@Component
public class FormationBusiness {

	@Autowired
	private FormationRepository formationRepository;
	
	public FormationBusiness(FormationRepository formationRepository) {
		this.formationRepository = formationRepository;
	}
	
	public List<Formation> getAllFormation() {
		return formationRepository.findAll();
	}

	public Optional<Formation> FindFormationByCodeFormation(String codeFormation) {
		return this.formationRepository.findById(codeFormation);
	}

	public Formation AddFormation(Formation formation) {
		 this.formationRepository.save(formation);
	     return formation;
	}

	public void UpdateFormation(Formation formation) {
		this.formationRepository.save(formation);		
	}

	public void DeleteFormation(String codeFormation) {
        this.formationRepository.deleteById(codeFormation);		
	}

 	public void deleteAllFormation() {
 		formationRepository.deleteAll();
	}
	
	public Formation FindFormationByName(String nomFormation) {
		List<Formation> listeFormation = formationRepository.findAll();
		return listeFormation.stream().filter(t -> t.getNomFormation().equals(nomFormation)).findFirst().get();
	}
 	
	
}
