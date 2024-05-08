package Day3;

interface Playable {
	void play();
}


class Football implements Playable {
	
	public void play() {
		System.out.println("Playing football!");
	}
}

class Volleyball implements Playable {
	
	public void play() {
		System.out.println("Playing volleyball!");
	}
}

class Basketball implements Playable {
	
	public void play() {
		System.out.println("Playing basketball!");
	}
}

public class Sports {
	public static void main(String[] args) {
		Football football = new Football();
		Volleyball volleyball = new Volleyball();
		Basketball basketball = new Basketball();

		football.play();
		volleyball.play();
		basketball.play();
	}
}
