package object_0220;

import java.io.Serializable;

public class Member implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
}
