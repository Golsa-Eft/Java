import java.util.Random;
//import tells us where to find Random
//import java.util.*;
//java.lang automatically imported

public class ImportExample{
	public static void main(String args[]){
		Random r = new Random();
		System.out.println(r.nextInt(10));
		//it prints out a random number between 0-9
}	
}