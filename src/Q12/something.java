package Q12;
class something{
	public static void main(String args[]){
		final int n=0;
		try{
			System.out.println();
		}
		finally{
			System.out.println("finally");
		}
	}
	protected void finalize(){
		System.out.println("finalize");
	} 
}
