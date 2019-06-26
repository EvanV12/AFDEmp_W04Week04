package p01Pets;

public abstract class J01Pet {
// public abstract class Pet	
	
	private String name;
	private String breed;
	private int age;
	private char gender;
	
	//private String sound;

	public J01Pet() {}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
	public abstract void getSound();
	
	
	
	/*
	public String getSound() {
		System.out.println("default");
		return sound;
	}
	
	public void setSound(String sound) {
		this.sound = sound;
	}
	*/
	
	
	

}
