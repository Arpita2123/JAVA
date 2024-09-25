//Program to implement Threads

import java.io.*;
import java.util.*;

class MyThread extends Thread
{
	public void run()
	{
		for(int i = 1 ; i <= 5; i++)
		{
			System.out.println("Thread A : "+i);
		
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}

class AnotherThread extends Thread
{
	public void run()
	{
		for(int i = 1 ; i <= 5; i++)
		{
			System.out.println("Thread B : "+i);
		
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}

public class ThreadExample
{
	public static void main(String a[])
	{
		MyThread tA = new MyThread();
		AnotherThread tB = new AnotherThread();
		tA.start();
		tB.start();
	}
}