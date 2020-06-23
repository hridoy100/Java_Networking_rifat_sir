package com.company.lectures.tcpstring;

public class ReadThread implements Runnable {
	private Thread thr;
	private NetworkUtil nc;

	public ReadThread(NetworkUtil nc) {
		this.nc = nc;
		this.thr = new Thread(this);
		thr.start();
	}
	
	public void run() {
		try {
			while(true) {
				String s=(String)nc.read();
				if(s==null)
					break;
				System.out.println(s);
			}
		} catch(Exception e) {
			System.out.println (e);                        
		}
		nc.closeConnection();
	}
}



