package view;

import control.Animal;
import control.Sheep;
import control.World;

public class ViewWorldConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		World w1 = new World(4, 6);
		Animal a1 = new Sheep(10, 1, w1, 0, 0);
		w1.animal = a1;
		a1.start();
		w1.start();
		while (true) {
			double[][] view = new double[w1.nRow][w1.nColumn];
			for(int i = 0; i<w1.nRow; i++) {
				for(int j=0; j<w1.nColumn; j++) {
					view[i][j] = w1.getGrass(i,j);
				}
			}
			view[a1.getCurrentRow()][a1.getCurrentColumn()] = 2;
			for(int i =0; i<w1.nRow; i++) {
				for(int j=0; j<w1.nColumn; j++) {
					System.out.print( String.format( "%.2f ", view[i][j] ) );
				}
				System.out.println();
			}
			try {
				Thread.sleep(1500);
			} catch (Exception e) {

			}
		}
	}
}
