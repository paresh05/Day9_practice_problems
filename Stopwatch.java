package com.bridgelabzd9;

import java.util.Scanner;

//Program to compute a Stop Watch

public class Stopwatch {

long startTime = 0;
long stopTime = 0;
boolean running = false;

public void start() {
    startTime = System.currentTimeMillis();
    running = true;
}

public void stop() {
    stopTime = System.currentTimeMillis();
    running = false;
}

//elaspsed time in milliseconds
public long getElapsedTime() {
    long elapsed; 
    elapsed = (stopTime - startTime);
    return elapsed;
}

//elaspsed time in seconds
public long getElapsedTimeSecs() {
    long elapsed;
    elapsed = ((stopTime - startTime) / 1000);
    return elapsed;
}

public static void main(String[] args) {
	//Object Creation
    Stopwatch s = new Stopwatch();
    s.start();
    System.out.println("The stop watch has started");
    
    int a=0;
	System.out.println("Press any number and press enter to stop the stopwatch");
	Scanner sc = new Scanner(System.in);
	a=sc.nextInt();
	
	if(a!=0)
		s.stop();
    System.out.println("elapsed time in milliseconds: " + s.getElapsedTime());
    System.out.println("elapsed time in seconds: " + s.getElapsedTimeSecs());
}
}