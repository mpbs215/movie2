package kosta.ridonbox.model.dto;

public class MovieDTO {

	private String movieNum;		//pk
	private String movieTitle;		//����
	private String movieEtitle;//��������
	private String movieDir;	//����
	private String movieAct;		//���
	private String movieDate;	//������
	private int movieRat;				//����
	private String moviePath;			//�̹������
	private String movieYoutube;		//��Ʃ����
	private int movieState;				//��ȭ ����(���� 1, ������ 0)
	
	public MovieDTO(String movieNum, String movieTitle, String movieEtitle, String movieDir, String movieAct,
			String movieDate, int movieRat, String moviePath, String movieYoutube, int movieState) {
		super();
		this.movieNum = movieNum;
		this.movieTitle = movieTitle;
		this.movieEtitle = movieEtitle;
		this.movieDir = movieDir;
		this.movieAct = movieAct;
		this.movieDate = movieDate;
		this.movieRat = movieRat;
		this.moviePath = moviePath;
		this.movieYoutube = movieYoutube;
		this.movieState = movieState;
	}
	public MovieDTO() {
		super();
	}
	public String getMovieNum() {
		return movieNum;
	}
	public void setMovieNum(String movieNum) {
		this.movieNum = movieNum;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getMovieEtitle() {
		return movieEtitle;
	}
	public void setMovieEtitle(String movieEtitle) {
		this.movieEtitle = movieEtitle;
	}
	public String getMovieDir() {
		return movieDir;
	}
	public void setMovieDir(String movieDir) {
		this.movieDir = movieDir;
	}
	public String getMovieAct() {
		return movieAct;
	}
	public void setMovieAct(String movieAct) {
		this.movieAct = movieAct;
	}
	public String getMovieDate() {
		return movieDate;
	}
	public void setMovieDate(String movieDate) {
		this.movieDate = movieDate;
	}
	public int getMovieRat() {
		return movieRat;
	}
	public void setMovieRat(int movieRat) {
		this.movieRat = movieRat;
	}
	public String getMoviePath() {
		return moviePath;
	}
	public void setMoviePath(String moviePath) {
		this.moviePath = moviePath;
	}
	public String getMovieYoutube() {
		return movieYoutube;
	}
	public void setMovieYoutube(String movieYoutube) {
		this.movieYoutube = movieYoutube;
	}
	public int getMovieState() {
		return movieState;
	}
	public void setMovieState(int movieState) {
		this.movieState = movieState;
	}
	
	
}