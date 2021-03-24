package com.ltts.Player.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ltts.Player.model.Player;





@Repository
public class PlayerDao {
	public List<Player> getAllPlayers()
	{
		List<Player> li=new ArrayList<Player>();
		li.add(new Player(101,"rohit","mi"));
		li.add(new Player(201,"yuvi","mys"));
		return li;
		
	}

}