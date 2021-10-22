package Practice;
//Something needs to be added in the "public class VideoGames" area for this to work properly (think about generics)
public class VideoGames implements {
	
	private String gameName;
	private String gameCreator;
	private String numOfCopies;
	
	public VideoGames(String gameName, String gameCreator, String numOfCopies) {
		
		this.gameName = gameName;
		this.gameCreator = gameCreator;
		this.numOfCopies = numOfCopies;
		
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameCreator() {
		return gameCreator;
	}

	public void setGameCreator(String gameCreator) {
		this.gameCreator = gameCreator;
	}

	public String getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(String numOfCopies) {
		this.numOfCopies = numOfCopies;
	}
	
	public String toString() {
		return String.format("Game Name: " + gameName + "\n" +"Game Creator: " 
						+ gameCreator + "\n" + "Number of Copies: " + numOfCopies);
	}

	@Override
	public int compareTo(VideoGames o) {
		
		return gameName.compareTo(o.getGameName());
	}
	
}
