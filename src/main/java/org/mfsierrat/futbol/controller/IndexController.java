package org.mfsierrat.futbol.controller;

import org.mfsierrat.futbol.model.CompetitionsData;
import org.mfsierrat.futbol.service.impl.FutbolDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping(value={"/","/home"})
public class IndexController {
	
	@Autowired
	FutbolDataService futbolDataService;
	
	@GetMapping
	public String home(Model model) {
		String competitions = futbolDataService.getCompetitions();
		ObjectMapper objectMapper = new ObjectMapper();
		CompetitionsData footballData;
		try {
			footballData = objectMapper.readValue(competitions, CompetitionsData.class);
			model.addAttribute("competitions", footballData);
		} catch (JsonProcessingException e) {
            e.printStackTrace();
            model.addAttribute("errorMessage", "Error al procesar los datos de la API.");
            return "error";
        }
		
		return "home";
	}

}
