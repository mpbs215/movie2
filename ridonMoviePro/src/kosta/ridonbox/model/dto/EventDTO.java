package kosta.ridonbox.model.dto;

public class EventDTO {
	   private int eventNo;     //pk 
	   private String eventTitle;//����
	   private String context;     //����
	   private String date;     //��¥
	   private String imgsrc;	//�̺�Ʈ �̹��� ���
	   
	public EventDTO() {}
	
	public EventDTO(int eventNo, String eventTitle, String context, String date, String imgsrc) {
		super();
		this.eventNo = eventNo;
		this.eventTitle = eventTitle;
		this.context = context;
		this.date = date;
		this.imgsrc = imgsrc;
	}
	
	public int getEventNo() {
		return eventNo;
	}
	public void setEventNo(int eventNo) {
		this.eventNo = eventNo;
	}
	public String getEventTitle() {
		return eventTitle;
	}
	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getImgsrc() {
		return imgsrc;
	}
	public void setImgsrc(String imgsrc) {
		this.imgsrc = imgsrc;
	}
	 
	
}
