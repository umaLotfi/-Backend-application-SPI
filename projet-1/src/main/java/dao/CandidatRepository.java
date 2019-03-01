package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.dosi.projet.Candidat;

public interface CandidatRepository extends JpaRepository<Candidat, String> {
		//Candidat findByNom(String nom);

}


