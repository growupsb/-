package 네트워크.json_0228;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParsseJsonEx {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("c:/temp/member2.json"));
		String json=br.readLine();
		System.out.println(json);
		br.close();
		
		JSONObject root = new JSONObject(json);
		System.out.println("id:" + root.getString("id"));
		System.out.println("name:" + root.getString("name"));
		System.out.println("age:" + root.getInt("age"));
		System.out.println("student:" + root.getBoolean("student"));
		
		JSONObject tel = root.getJSONObject("tel");
		System.out.println("home : " + tel.getString("home"));
		System.out.println("mobile : " + tel.getString("mobile"));
		
		JSONArray skill = root.getJSONArray("skill");
		System.out.println("skill : ");
		for(int i=0;i<skill.length();i++)
			System.out.println(skill.get(i));
	}
}
