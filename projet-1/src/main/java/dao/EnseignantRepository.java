package dao;

import com.dosi.projet.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnseignantRepository extends JpaRepository<Enseignant, String> {


	Enseignant findBynoEnseignant(int numeroEnseignant);
	
}


