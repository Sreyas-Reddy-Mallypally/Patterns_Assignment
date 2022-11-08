package Q19;

class abc extends Thread{
	public void run(){
		System.out.println();
	}
	public static void main(String args[]){
		abc a=new abc();
		a.start();
	}
}
