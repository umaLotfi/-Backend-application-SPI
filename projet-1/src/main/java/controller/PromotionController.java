package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dosi.projet.Promotion;


@CrossOrigin
@RestController
@RequestMapping("/promotion")
public class PromotionController {

	@Autowired
	private PromotionBusiness promotionBusiness;
	@RequestMapping("/getAllPromotion")
	public List<Promotion> getAllPromotion() {
		return promotionBusiness.getAllPromotion();
	}

	@RequestMapping("FindPromotion/lieuRentree/{SalleRentree}")
	public Promotion FindPromotionByLieu(@PathVariable String SalleRentree) {
		return promotionBusiness.FindPromotionByLieu(SalleRentree);
	}
}
