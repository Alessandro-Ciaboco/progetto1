package progetto1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClock {

	public static void main(String[] args) 
	{
		ServerSocket sSocket;
		Socket connessione;
		int porta=3333;
		
		//stream per gestire il flusso di output
		OutputStream out;
		PrintWriter sOut;
		
		try 
		{
			sSocket = new ServerSocket(porta);
			while(true)
			{
				System.out.println("in attesa di connessione...");
				connessione=sSocket.accept();
				System.out.println("connessione stabilita con successo!");
				out=connessione.getOutputStream();
				
			}
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
