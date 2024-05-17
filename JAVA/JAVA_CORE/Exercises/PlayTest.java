package Exercises;
 
interface Playable{
	void play();
}
 
class Football implements Playable{
	public void play() {
		System.out.println("play Football");
	}
}
 
class Volleyball implements Playable{
	public void play() {
		System.out.println("Play Volleyball");
	}
}
 
class  Basketball implements Playable{
	public void play() {
		System.out.println("Play Basketball");
	}
	
}
public class PlayTest {
 
	public static void main(String[] args) {
		Playable p;
		p = new Basketball();
		p.play();
		p = new Volleyball();
		p.play();
		p = new Football();
		p.play();
 
 
	}
 
}
 