package multithreading;

import java.util.ArrayList;
import java.util.Vector;

public class Example03 {
	    public static void main(String[] args) throws Exception {
	        // Creating a Vector
	        ArrayList<Integer> vector = new ArrayList<>();
	        //Vector<Integer> vector = new Vector<>();
            //int a=5;
	        // Creating threads to concurrently add elements to the vector
	        Thread thread1 = new Thread(() -> {
	            for (int i = 0; i < 100; i++) {
	                vector.add(i);
	            }
	        });

	        Thread thread2 = new Thread(() -> {
	            for (int i = 100; i < 200; i++) {
	                vector.add(i);
	            }
	        });

	        // Starting the threads
	        thread1.start();
	        thread2.start();

	        // Waiting for threads to finish
	        thread1.join();
	        thread2.join();

	        // Output the size of the vector
	        //System.out.println("Vector size: " + vector);
	        System.out.println(vector);// Should be 2000
	    }
	}
