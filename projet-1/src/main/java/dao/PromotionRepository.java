package dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.dosi.projet.Promotion;
import com.dosi.projet.PromotionPK;

public interface PromotionRepository extends JpaRepository<Promotion, PromotionPK> {

}