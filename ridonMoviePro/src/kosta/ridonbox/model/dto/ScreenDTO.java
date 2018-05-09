package kosta.ridonbox.model.dto;

public class ScreenDTO {
	
	private String screenNum; //�󿵹�ȣ
	private String movieNum; //��ȭ��ȣ
	private String theaterName; //�󿵰��̸�
	private String screenDate; //�󿵳�¥
	private int	screenTime;//�󿵽ð�
	private int revTotal; //�ѿ��ż�
	
	public ScreenDTO(String screenNum, String movieNum, String theaterName, String screenDate, int screenTime,
			int revTotal) {
		super();
		this.screenNum = screenNum;
		this.movieNum = movieNum;
		this.theaterName = theaterName;
		this.screenDate = screenDate;
		this.screenTime = screenTime;
		this.revTotal = revTotal;
	}
	public ScreenDTO() {
		super();
	}
	public String getScreenNum() {
		return screenNum;
	}
	public void setScreenNum(String screenNum) {
		this.screenNum = screenNum;
	}
	public String getMovieNum() {
		return movieNum;
	}
	public void setMovieNum(String movieNum) {
		this.movieNum = movieNum;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getScreenDate() {
		return screenDate;
	}
	public void setScreenDate(String screenDate) {
		this.screenDate = screenDate;
	}
	public int getScreenTime() {
		return screenTime;
	}
	public void setScreenTime(int screenTime) {
		this.screenTime = screenTime;
	}
	public int getRevTotal() {
		return revTotal;
	}
	public void setRevTotal(int revTotal) {
		this.revTotal = revTotal;
	}
	
}
