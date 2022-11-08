package Q9;

import java.io.File;

class abc{
	void abc(){
		try(File f=new File("file.txt")){
			System.out.println("hello");
		}
		catch(Exception e) {}
	}
	}
