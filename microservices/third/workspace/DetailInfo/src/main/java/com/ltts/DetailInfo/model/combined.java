package com.ltts.DetailInfo.model;

public class combined {
	private int playerno;
	private String playername;
	private String teamname;
	private int tno;
	private String towner;
	
	
	public combined() {
		super();
	}
	public combined(int playerno, String playername, String teamname, int tno, String towner) {
		super();
		this.playerno = playerno;
		this.playername = playername;
		this.teamname = teamname;
		this.tno = tno;
		this.towner = towner;
	}
	public int getPlayerno() {
		return playerno;
	}
	public void setPlayerno(int playerno) {
		this.playerno = playerno;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getTowner() {
		return towner;
	}
	public void setTowner(String towner) {
		this.towner = towner;
	}
	
}
