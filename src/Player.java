
public class Player {
	
	String name;
	//skill level will be translated to int values. 
	//Beginner = 1, Novice=2, intermediate=3, advanced=4, expert=5, dontfwitme=100
	Integer skill;
	String city;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setskill(Integer skill){
		this.skill = skill;
	}
	
	public Integer getSkill(){
		return skill;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	
	public String getCity(){
		return city;
	}
	
}
