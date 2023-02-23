package Synchronizationdemo;

class Demo {
	public void sendMessage(String message)        // class for Sending message with out threading
	{
		System.out.println("\n Sending " + message);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Thread interrupted.");
		}
		System.out.println("\n" + message + "Sent");
	}
}

														// for sending a message  we are using Threads
class SendThreads extends Thread {
	private String message;
	Demo send;

													// Receives a message object and a string message to be sent
	SendThreads(String msg, Demo object) {
		message = msg;
		send = object;
	}

	public void run() {

		synchronized (send)                    // only one thread sends a message at a time.
		{

			send.sendMessage(message);
		}
	}
}

public class Sample {
	public static void main(String args[]) {
		Demo sender = new Demo();
		SendThreads sender1 = new SendThreads(" Hello ", sender);
		SendThreads sender2 = new SendThreads(" Welcome to java learning  ", sender);

		sender1.start();          			 // Starting two threads of SendThreads type
		sender2.start();

		try { 		
			sender1.join();                // It will wait for threads to end
			sender2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}
}