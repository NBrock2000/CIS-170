package com.nathan.projects.hangman;

public class GameState {
	private boolean win = false;
	private boolean loss = false;
	private boolean newGame = true;
	private boolean inProgress = false;
	
	public boolean getWin() {
		return win;
	}
	public void setWin(boolean win) {
		this.win = win;
	}
	public boolean getLoss() {
		return loss;
	}
	public void setLoss(boolean loss) {
		this.loss = loss;
	}
	public boolean getNewGame() {
		return newGame;
	}
	public void setNewGame(boolean newGame) {
		this.newGame = newGame;
	}
	public boolean getInProgress() {
		return inProgress;
	}
	public void setInProgress(boolean inProgress) {
		this.inProgress = inProgress;
	}

}
