package org.mfsierrat.futbol.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;

@Service
public class FutbolDataService {
	
	@Autowired
    private RestTemplate restTemplate;

    private static final String BASE_URL = "https://api.football-data.org";
    private static final String AUTH_TOKEN = "6e5ae9af3580486084a5d26af6af3150";

    private String consumir(String endPoint) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Auth-Token", AUTH_TOKEN);

        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(BASE_URL + endPoint, HttpMethod.GET, entity, String.class);

        return response.getBody();
    }
    public String getCompetitions() {
		return consumir("/v4/competitions/");
	}
    public String getTeams() {
    	return consumir("/v4/competitions/{id}/standings");
    }
	public String getStandings(String id) {
		String url = "/v4/competitions/" + id + "/standings";
		return consumir(url);
	}
	
    
}
