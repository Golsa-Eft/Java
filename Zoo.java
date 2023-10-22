public class Zoo {
	public static void main(String[] args){
		System.out.println("the len of inputs: " + args.length);
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
}
/*output:
the len of inputs: 0
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
	at com.company.Main.main(Main.java:7)
	*/
