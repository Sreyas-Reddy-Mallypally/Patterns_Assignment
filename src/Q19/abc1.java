package Q19;

class abc1 implements Runnable{
	public void run(){
		System.out.println();
	}
	public static void main(String args[]){
		abc a=new abc();
Thread t=new Thread(a);
		t.start();
	}
}
