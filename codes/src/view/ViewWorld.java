package view;

import control.World;

public class ViewWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		World w1 = new World(4,6);
		for(int i = 0; i < w1.nRow ; i++) {
			for(int j=0; j < w1.nColumn; j++)
				System.out.print( String.format("%.2f ",w1.getGrass(i,j)));
			System.out.print("\n");
		}
	}
}
