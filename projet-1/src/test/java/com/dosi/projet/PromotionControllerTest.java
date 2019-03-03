package com.dosi.projet;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.web.servlet.*;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.http.MediaType;
import static org.mockito.BDDMockito.*;


import controller.PromotionBusiness;
import controller.PromotionController;

@RunWith(SpringRunner.class)
@WebMvcTest(PromotionController.class)
public class PromotionControllerTest {
 /*
    @Autowired
    private MockMvc mvc;
 
    @MockBean
	private PromotionBusiness promotionBusiness;
    
 
    
    @Test
    public void MyControllerTest()
      throws Exception {
         
        given(promotionBusiness.FindPromotionByLieu("LC117B"))
        .willReturn(new Promotion());
     
        mvc.perform(get("promotion/FindPromotion/lieuRentree/{SalleRentree}")
          .contentType(MediaType.APPLICATION_JSON))
          .andExpect(status().isOk());
          
    }*/
    
    
}