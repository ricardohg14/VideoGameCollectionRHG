package edu.saintjoe.cs.ricardog.videogamecollection;

public class VideoGames {
	
	private String name;
	private String favVideoGame;
	private int games;
	
	public VideoGames(String newname, String newFavVideoGame, int newGames) {
		
		favVideoGame = newFavVideoGame;
		games = newGames;
		
	}
	
	public void setName(String newName) {
		name = newName;
	}
	public String getName() {
		return name;
	}
	public void setFavVideoGame(String newFavVideoGame) {
		favVideoGame = newFavVideoGame;
	}
	public String getFavVideoGame() {
		return favVideoGame;
	}
	
	public void setGames(int newGames) {
		games = newGames;
	}
	public int getGames() {
		return games;
	}
	public String toString() {
		return (" Name: " + name + " Favorite Video Game: " + favVideoGame + " Number of owned games: " + games );
	
	}
	

}
