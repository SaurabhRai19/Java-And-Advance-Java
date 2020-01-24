public class MainThread{
	public static void main(String args[]){
		Thread t=Thread.currentThread();
		System.out.println("Current thrad: "+t);
		t.setName("mythread");
		System.out.println("After changing: "+t);
		String s=t.getName();
		System.out.println("Thread Name: "+s);
	}
}