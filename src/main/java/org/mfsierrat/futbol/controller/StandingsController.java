package org.mfsierrat.futbol.controller;

import java.io.IOException;

import org.mfsierrat.futbol.model.StandingsData;
import org.mfsierrat.futbol.model.TeamsData;
import org.mfsierrat.futbol.service.impl.FutbolDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.ObjectMapper;


@Controller
@RequestMapping("/standings")
public class StandingsController {
    
    @Autowired
    private FutbolDataService futbolDataService;

    
    /*@GetMapping("/teams")
    public String getFootballData(Model model) throws IOException {
        String json = futbolDataService.getTeams(); 

        ObjectMapper objectMapper = new ObjectMapper();
        FootballData footballData = objectMapper.readValue(json, FootballData.class); 

        model.addAttribute("footballData", footballData); 
        return "leagues"; 
    }
*/
    @GetMapping("/{id}/standings")
    public String getStandings(@PathVariable("id") String leagueId, Model model) throws IOException {
        
        String json = futbolDataService.getStandings(leagueId);
        ObjectMapper objectMapper = new ObjectMapper();
        StandingsData footballData = objectMapper.readValue(json, StandingsData.class); 
       
        model.addAttribute("standings", json);

        return "standings"; 
    }
}
