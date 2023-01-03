package main;

import java.util.Random;

public class Runner{
	
	public static void main(String[] args) {
		final Runner m = new Runner();
		final Account account = m.new Account(false, false,5);
		m.run(account);
	}
	
	
	public void LogIn() {
		System.out.println("LoggedIn at: " + System.currentTimeMillis());
	}
	public void UploadAlerts() {
		System.out.println("Alerts uploaded at: " + System.currentTimeMillis());
	}
	public void RemoveAlerts() {
		System.out.println("Alerts Removed  at: " + System.currentTimeMillis());
	}
	public void ViewingAlerts() {
		System.out.println("Viewing Alerts at: " + System.currentTimeMillis());
	}
	
	public void run(final Account account) {
		final Random rand = new Random();
		
		for(int i=0;i<25;i++){
			final int num = rand.nextInt(10);
			// if the random number is less than 5, increment the total number of alerts 
			if (num < 5){
				account.setTotAlerts(account.getTotAlerts() + 1);
				if(account.getTotAlerts() <5 ){
					 // if the total number of alerts is less than 5, print a message indicating that alerts are being uploaded
					System.out.println("Alerts uploaded at: " + System.currentTimeMillis());
					System.out.println("Viewing Alerts at: " + System.currentTimeMillis());
					account.setViewingAlerts(true);
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					account.setTotAlerts(5);
					
					
				}else{
					account.setTotAlerts(0);
					account.setLoggedIn(true);
					System.out.println("Alerts Removed  at: " + System.currentTimeMillis());
					account.setViewingAlerts(false);
				}
		
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public class Account{
		//stores number of invalidLogins
		private int TotAlerts;
		private boolean ViewingAlerts;
		private boolean LoggedIn;
		
		public Account(final boolean ViewingAlerts, final boolean LoggedIn, final int TotAlerts) {
			super();
			this.LoggedIn = LoggedIn;
			this.ViewingAlerts = ViewingAlerts;
			this.TotAlerts = TotAlerts;
		}


		public boolean isLoggedIn() {
			return LoggedIn;
		}

		public void setLoggedIn(boolean LoggedIn) {
			if(LoggedIn){
				System.out.println("Logged In");
			} else {
				System.out.println("Viewing Alerts");
			}
			this.LoggedIn = LoggedIn;
		}
		
		public boolean isViewingAlerts() {
			return ViewingAlerts;
		}

		public void setViewingAlerts(boolean ViewingAlerts) {
			if(ViewingAlerts){
				System.out.println("Viewing Alerts");
			} else {
				System.out.println("Logged In");
			}
			this.ViewingAlerts = ViewingAlerts;
		}

		
		public Integer getTotAlerts() {
			return TotAlerts;
		}

		public void setTotAlerts(Integer TotAlerts) {
			this.TotAlerts = TotAlerts;
		}
	}
}