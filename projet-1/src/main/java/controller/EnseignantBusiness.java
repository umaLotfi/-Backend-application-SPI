package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dosi.projet.Enseignant;

import dao.EnseignantRepository;

@Service
@Component
public class EnseignantBusiness {

	@Autowired
	private EnseignantRepository enseignantRepository;
	
	/*public EnseignantBusiness(EnseignantRepository enseignantRepository) {
		this.enseignantRepository = enseignantRepository;
	}*/
	
	public List<Enseignant> getAllEnseignant() {
		return enseignantRepository.findAll();
	}

	public Enseignant AddEnseignant(Enseignant enseignant) {
		 this.enseignantRepository.save(enseignant);
	     return enseignant;
	}

	public void UpdateEnseignant(Enseignant enseignant) {
		this.enseignantRepository.save(enseignant);		
	}

	public void DeleteEnseignant(String numeroEnseignant) {
        this.enseignantRepository.deleteById(numeroEnseignant);		
	}

 	public void deleteAllEnseignant() {
 		enseignantRepository.deleteAll();
	}
	
	public Enseignant FindEnseignantByName(String nomEnseignant) {
		List<Enseignant> listeEnseignant = enseignantRepository.findAll();
		return listeEnseignant.stream().filter(t -> t.getNom().equals(nomEnseignant)).findFirst().get();
	}
 	
	public Enseignant FindEnseignantByNumeroEns(int numeroEnseignant) {
		return this.enseignantRepository.findBynoEnseignant(numeroEnseignant);
	}
	
	
	public Enseignant FindEnseignantByEmail(String emailEnseignant) {
		List<Enseignant> listeEnseignant = enseignantRepository.findAll();
		return listeEnseignant.stream().filter(t -> t.getEmailUbo().equals(emailEnseignant)).findFirst().get();
	}
}
