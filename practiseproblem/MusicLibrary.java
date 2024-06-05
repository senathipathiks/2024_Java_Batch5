package com.practiseproblem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Music {
	String song;
	

	public Music(String song) {
		super();
		this.song = song;
		
	}
}

class AddRemov {

	ArrayList<Music> list = new ArrayList<>();

	void add(Music s) {
		list.add(s);
	}

	void remove(String s) {
		for (Music i : list) {
			if (i.song.equals(s)) {
				list.remove(i);

				System.out.println("Removed successfully");
				return;
			}
		}
		System.out.println("Data not found");
	}
	void display() {
		for(Music i : list) {
			System.out.println(i.song);
		
			
			System.out.println("----------------------------------------------");
		}
	}
	
	void play() {
		
		Random rand = new Random();
		int random = rand.nextInt(3);
		System.out.println("Song playing...."+random);
		System.out.println(list.get(random));
	}
}

public class MusicLibrary {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Music m1 = new Music("song1");
		Music m2 = new Music("song2");
		Music m3 = new Music("song3");
		Music m4 = new Music("song4");
		Music m5 = new Music("song5");
		
		
		AddRemov obj = new AddRemov();
		obj.add(m1);
		obj.add(m2);
		obj.add(m3);
		obj.add(m4);
		obj.add(m5);
		
		obj.display();
		
		System.out.println("Enter the song to remove : ");
		String s = sc.next();
		obj.remove(s);
		
		obj.display();
		
		
		obj.play();
	}

}
