package Multithreading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Company c=new Company();
        Producer p=new Producer(c);
        Consumer c1=new Consumer(c);
        p.start();
        c1.start();
	}

}
