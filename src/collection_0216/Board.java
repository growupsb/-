package collection_0216;

public class Board {
	private String subject;
	private String content;
	private String writer;
	
	public Board(String subject, String content, String writer) {
		super();
		setSubject(subject);//this.subject = subject;
		setContent(content);//this.content = content;
		setWriter(writer);//this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
}
