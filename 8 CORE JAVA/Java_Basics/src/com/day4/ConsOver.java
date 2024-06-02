package com.day4;

public class ConsOver {

	
		int rollno;
		String name;
		ConsOver(){
			rollno = 0;
			name = "";
			System.out.println(rollno + name);
		}
		ConsOver(int r){
			rollno =r;
			name="";
			System.out.println(rollno + name);
		}
		ConsOver(int r,String name){
			rollno=r;
			this.name=name;
			System.out.println(rollno + this.name);
		}
		public static void main(String[] args) {
			ConsOver obj1 = new ConsOver();
			ConsOver obj2 = new ConsOver(2);
			ConsOver obj3 = new ConsOver(3,"gopi");
	}

}
