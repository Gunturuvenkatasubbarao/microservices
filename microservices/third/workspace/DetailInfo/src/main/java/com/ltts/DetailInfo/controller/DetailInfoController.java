package com.ltts.DetailInfo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ltts.DetailInfo.model.Player;
import com.ltts.DetailInfo.model.Team;
import com.ltts.DetailInfo.model.combined;
@RestController
public class DetailInfoController {
	@Autowired
	RestTemplate rt;
	@Autowired
	RestTemplate pt;
	@Autowired
	RestTemplate lt;
	
	@RequestMapping("/detail")
	public List<Team> getExternalTeam()
	{
		ResponseEntity<Team[]> response=rt.getForEntity("http://localhost:8083/teams", Team[].class);
		Team[] teams=response.getBody();
		List<Team> li=Arrays.asList(teams);
		return li;
	}
	
	@RequestMapping("/details")
	public List<Player> getExternalPlayer()
	{
		ResponseEntity<Player[]> response=pt.getForEntity("http://localhost:8086/player", Player[].class);
		Player[] Players=response.getBody();
		List<Player> li=Arrays.asList(Players);
		return li;
}
	


	
	
}