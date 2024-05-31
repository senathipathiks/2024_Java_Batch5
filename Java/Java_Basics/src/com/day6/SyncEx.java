package com.day6;

import java.io.*;
import java.util.*;

class File{
	synchronized public void print() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
		}
	}
}

class ThreadA extends Thread{
	File f = new File();
	ThreadA(File f){
		this.f = f;
	}
	public void run() {
		f.print();
	}
}

class ThreadB extends Thread{
	File f = new File();
	ThreadB(File f){
		this.f = f;
	}
	public void run() {
		f.print();
	}
}

public class SyncEx {

	public static void main(String[] args) {
		File f1 = new File();
		
		ThreadA t1 = new ThreadA(f1);
		ThreadB t2 = new ThreadB(f1);
		
		t1.start();
		t2.start();
	}

}
