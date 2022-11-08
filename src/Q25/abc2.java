package Q25;

class abc2 {
    public static void main(String args[]){
        new Thread(new Runnable() {
           public void run()
            {
                System.out.println("thread created");
            }
        }).start();
    }
}

