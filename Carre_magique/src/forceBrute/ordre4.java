package forceBrute;

public class ordre4 {

	public static int[][] ordreQuatre ( int max, int n) {
		
		int a = 0, b = 0, c=0, d=0;
				int s = a+b+c+d;
				int[][]nomdutableau= new int[4][4];
				
				while (a<b+d || s!=max || c<d || 2*b<d || a==0|| b==0|| c==0 || d==0){
				 c = (int) (Math.random()*n*50);
				 a = (int) (Math.random()*n*50);
				 b = (int) (Math.random()*n*50);
				 d = (int) (Math.random()*n*50);
				 s = a+b+c+d;
				}
			
				nomdutableau[0][0]=a-b;
				nomdutableau[0][1]=2*b;
				nomdutableau[0][2]=c-d;
				nomdutableau[0][3]=2*d;
				nomdutableau[1][0]=c;
				nomdutableau[1][1]=d;
				nomdutableau[1][2]=a-b;
				nomdutableau[1][3]=2*b;
				nomdutableau[2][0]=2*d;
				nomdutableau[2][1]=c;
				nomdutableau[2][2]=2*b;
				nomdutableau[2][3]=a-b-d;
				nomdutableau[3][0]=2*b-d;
				nomdutableau[3][1]=a-b;
				nomdutableau[3][2]=2*d;
				nomdutableau[3][3]=c;
			
				 System.out.println("repère carré 4");
				
			return nomdutableau;}
}
