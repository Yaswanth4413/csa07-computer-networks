// Java program to obtain IP Address
// from a given host

import java.io.*;
import java.util.*;
import java.net.*;
class GFG {
	public static void main(String[] args)
	{
		// Host
		String host = "www.geeksforgeeks.org";
		
		// Using try Logic So that if there is an error then
		// easily get the error
		try {
			
			// calling the function which gives the IP
			// Address from the given host
			InetAddress[] iaddress
				= InetAddress.getAllByName(host);

			for (InetAddress ipaddresses : iaddress) {
				System.out.println(ipaddresses.toString());
			}
		}
		catch (UnknownHostException e) {
			System.out.println(e);
		}
	}
}
