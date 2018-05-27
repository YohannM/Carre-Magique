package force_Brute;

public class ordre3 {
	
	public static int[][] ordreTrois1 (int max) {
		
		int x = 0, a = 0, b = 0;
				int s = 3*x+3*a-3*b;
				int[][]tab= new int[3][3];
				
				while (x<2*b || x==2*b || x==0 || b==0|| a==0 || s!=max ){
				 x = (int) (Math.random()*100);
				 a = (int) (Math.random()*100);
				 b = (int) (Math.random()*60);
				 s = 3*x+3*a-3*b;
				}
			
				tab[0][0]=x+a;
				tab[0][1]=x-2*b;
				tab[0][2]=x+2*a-b;
				tab[1][0]=x+2*a-2*b;
				tab[1][1]=x+a-b;
				tab[1][2]=x;
				tab[2][0]=x-b;
				tab[2][1]=x+2*a;
				tab[2][2]=x+a-2*b;
			
			return tab;}
}
