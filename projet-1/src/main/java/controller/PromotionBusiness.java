package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dosi.projet.Promotion;

import dao.PromotionRepository;

@Service
public class PromotionBusiness {
	
	@Autowired
	PromotionRepository promotionRepository;

	public List<Promotion> getAllPromotion() {
		return promotionRepository.findAll();
	}
	
	public Promotion FindPromotionByLieu(String SalleRentree) {
		List<Promotion> listPromotion = promotionRepository.findAll();
		return listPromotion.stream().filter(t -> t.getLieuRentree().equals(SalleRentree)).findFirst().get();
	}

}
