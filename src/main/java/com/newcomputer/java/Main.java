package com.newcomputer.java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c = new Computer();
		c.getComputerDetails();
		Mouse m = new Mouse("USB");
		c.setMouse(m);
		
		CPU cpu = new CPU("WINDOWS", "Intel-I9", 32);
		c.setCpu(cpu);
		
		Keyboard k = new Keyboard("Wired");
		c.setKeyboard(k);
		
		Monitor monitor = new Monitor("FULL HD", "LED");
		c.setMonitor(monitor);

		
        System.out.println(c.getComputerDetails()+c.getMonitor()+"\n"+c.getMouse()+"\n"+c.getKeyboard()+"\n"+c.getCpu());
      
	}

}
