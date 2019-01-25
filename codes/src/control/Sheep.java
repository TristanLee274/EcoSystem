package control;

import java.util.Random;

public class Sheep extends Animal {
	public static double LOSS_ENERGY;
	public Sheep(double energy, int speed, World world, int currentRow, int currentColumn) { 
		this.energy = energy;
		this.speed = speed;
		this.world = world;
		this.currentRow = currentRow;
		this.currentColumn = currentColumn;
		this.ran = new Random();
		this.iMale = ran.nextBoolean();
	}
	public Object move(Object o) { 
		currentRow += ran.nextInt(2 * speed +1 )-speed;
		currentColumn += ran.nextInt(2 * speed +1 )-speed;
	
		currentRow = (currentRow >= world.nRow) ? currentRow -= world.nRow : currentRow ;	
		currentRow = (currentRow < world.nRow) ? currentRow += world.nRow : currentRow ;
		currentColumn = (currentColumn >= world.nColumn) ? (currentColumn -= world.nColumn) : currentColumn;
		currentColumn = (currentColumn < world.nColumn) ? (currentColumn += world.nColumn) : currentColumn;
		
		energy -= LOSS_ENERGY * speed;
		
		return null;
	}
	public void run() {
		while (true) { 
			move(new Object());
			try {
				Thread.sleep(World.TIME_STEP);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	

}
