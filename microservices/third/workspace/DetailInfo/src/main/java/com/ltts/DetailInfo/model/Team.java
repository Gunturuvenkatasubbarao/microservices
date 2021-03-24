package com.ltts.DetailInfo.model;

public class Team {

	private int tno;
	private String teamname;
	private String towner;
	
	
	
	public Team(int tno, String teamname, String towner) {
		super();
		this.tno = tno;
		this.teamname = teamname;
		this.towner = towner;
	}
	public Team() {
		super();
	}
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getTowner() {
		return towner;
	}
	public void setTowner(String towner) {
		this.towner = towner;
	}
	
	
	
}
