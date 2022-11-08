package Q27;

class single{
	private static single s=null;
	private single(){}
	
	public static synchronized single abc(){
		return s;
	}
}
