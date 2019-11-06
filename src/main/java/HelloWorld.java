package main.java;

public class HelloWorld {
	
	public String getMessage(String chaine){
		if(chaine==null){
			return ("Hello world");
		}else{
			return (chaine+"Hello world");
		}
	}
	public int sum(int a,int b){
		return (a+b);
	}

}
