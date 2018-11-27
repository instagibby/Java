package model;

public class Madlib {
	private String name, item1, item2, item3, verb, adjective;
	

	public Madlib() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Madlib(String name, String item1, String item2, String item3, String verb, String adjective) {
		super();
		this.setName(name);
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.verb = verb;
		this.adjective = adjective;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		StringBuilder sb = new StringBuilder();
		sb.append(name.substring(0, 1).toUpperCase());
		sb.append(name.substring(1));
		
		this.name = sb.toString();
	}

	public String getItem1() {
		return item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getItem2() {
		return item2;
	}

	public void setItem2(String item2) {
		this.item2 = item2;
	}

	public String getItem3() {
		return item3;
	}

	public void setItem3(String item3) {
		this.item3 = item3;
	}

	public String getVerb() {
		return verb;
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}

	public String getAdjective() {
		return adjective;
	}

	public void setAdjective(String adjective) {
		this.adjective = adjective;
	}
	
	public String reciteMadLib() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " had a little " + item1);
		sb.append("\nIts " + item2 + " was " + adjective + " as snow");
		sb.append("\nand everywhere that " + name + " " + verb);
		sb.append("\nThe " + item3 + " was sure to go.");
		
		return sb.toString();
	}
	
}
