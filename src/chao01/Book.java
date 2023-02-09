package chao01;

public class Book {
	private String name;
	private String author;
	private int ISBN;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}
	public int getISBN() {
		return ISBN;
	}
	
	public static void main(String[] args) {
		Book booktest = new Book();
		booktest.setName("자바");
		booktest.setAuthor("자바");
		booktest.setISBN(12345);
		
		System.out.println("책 이름 : "+booktest.name);
		System.out.println("저자 : "+booktest.author);
		System.out.println("ISBN : "+booktest.ISBN);
	}
	public String toString() {
		return "책 이름 : " + name + ", 저자 : " + author + ", ISBN : " + ISBN;
	}
}
