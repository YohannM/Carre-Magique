package cavalier;

import ecriture_fichier.Ecriture_fichier;
import force_Brute.ordre3;

public class Cavalier_impair {

public static int[][] ordreImpair(int n) { //cr�ation de m�thode pour les carr�s d'ordre impair
		
	int carre[][] = new int[n][n];
	int sommeMagique;
		
	if (n==3){ //si n =3
		
		int x = 0, a = 0, b = 0;
		
		
		while (x<2*b || x==2*b || x==0 || b==0|| a==0){
		 x = (int) (Math.random()*20);
		 a = (int) (Math.random()*20);
		 b = (int) (Math.random()*6);
		
		}
	
		carre[0][0]=x+a;
		carre[0][1]=x-2*b;
		carre[0][2]=x+2*a-b;
		carre[1][0]=x+2*a-2*b;
		carre[1][1]=x+a-b;
		carre[1][2]=x;
		carre[2][0]=x-b;
		carre[2][1]=x+2*a;
		carre[2][2]=x+a-2*b;
		
		sommeMagique = 3*x+3*a-3*b;
		
	}//Fin si n=3
	
	
	else if (n%3==0)
	{// si n est un multiple de 3 tout en �tant diff�rent de 3
		
		double s = Math.random()*50 + 15; //on d�termine al�atoirement la somme que devra respecter les carr� magiques d'ordre 3
		                     //qui composeront notre grand carr� magique d'ordre n (� multiplier par 3 car doit �tre congrue � 0[3]
		int d = n/3;//on regarde le nombre de carr� d'ordre n qu'il faudra utiliser pour couvrir un c�t� du carr�
		
		carre= new int[n][n]; //on cr�e notre grand carr� d'ordre n
			
			for (int j=0, l=0; j<d; j++, l=l+3){//s'�x�cute d fois (pour chaque ligne)
				
				//� chaque it�ration, il faut remplir une nouvelle s�rie de carr� de 3*3 sur une ligne, donc on incr�mente la valeur
				//la ligne de 3 pour sauter les lignes de carr� remplis � l'it�ration k-1
			
				for ( int u=0, c=0; u<d; u++, c=c+3){ //s'�x�cute d fois (pour chaque colonne)
				
				//� chaque it�ration, il faut remplir un nouveau carr� de 3*3 sur une colonne, donc on incr�mente la valeur
				//la colonne de 3 pour sauter les carr�s remplis � l'it�ration k-1
				
					int[][] carreVariant= ordre3.ordreTrois1(3*(int) s );//� chaque it�ration on cr�e un tableau de dimension 3 ayant pour somme 3*s
			
				//maintenant qu'on a les cordonn�es de la case en haut � gauche du tableau de dimension 3 � remplir
				//on remplit le carr� de dimension trois relativement � cette premi�re case
				
					carre[l][c]=carreVariant[0][0]; 
					carre[l][c+1]=carreVariant[0][1];
					carre[l][c+2]=carreVariant[0][2];
					
					carre[l+1][c]=carreVariant[1][0];
					carre[l+1][c+1]=carreVariant[1][1];
					carre[l+1][c+2]=carreVariant[1][2];
					
					carre[l+2][c]=carreVariant[2][0];
					carre[l+2][c+1]=carreVariant[2][1];
					carre[l+2][c+2]=carreVariant[2][2];
				}
			}//Fin du remplissage du grand tableau
			
			sommeMagique = 3 * (d*(int) s);
			
	}//Fin si n%3=0
	
	
	//ALGORITHME DU CAVALIER
	
	
		
	else 
	{//Si n non congrue � 0[3]
		
		double premierligne = Math.random()*n; //On choisit al�atoirement la premi�re case � remplir
		double premiercolonne = Math.random()*n;
		
		carre[(int) premierligne][(int) premiercolonne] = 1; //On affecte 1 � la premi�re case choisie al�atoirement
		
		for (int i =1; i<Math.pow(n,2); i++)
		{ //Boucle qui sert � remplir les n^2 cases
		
			if (i%n==0)
			{ //toutes les n cases, on descend d'une case sur la droite (voir algorithme du cavalier)
				premierligne=(premierligne+1)%n; //une case sur la droite
				premiercolonne=(premiercolonne+1)%n; //une case vers le bas
			}
			else 
			{ //autrement, proc�dure habituelle
				premierligne= (int) premierligne-1; //on monte d'une case (voir algo)
			
				if ( (int) premierligne <0)
				{ //Si on est sortie du tableau par le haut...
					premierligne= premierligne+n; //On descend de n lignes (revient � faire %n pour les n�gatifs)
				}
			
			premiercolonne = (int) premiercolonne+2; //Puis on d�cale de deux colonnes vers la droite (voir algo)
			
				while (carre[((int) premierligne) ][((int) premiercolonne)%n]!=0 )
				{ //Tant que la nouvelle case sur laquelle on tombe est d�ja occup�e...
					premiercolonne++; //On d�cale d'une case vers la droite
				}
			}
			carre[((int) premierligne)%n ][((int) premiercolonne)%n]= i+1; //Ligne commune pour tous les cas de figure : on affecte la valeure
			                                                           //suivante � la case choisie (voir algo)
		}
		
		sommeMagique = (n*n*n+n)/2;
		
		} //Fin si n%3!=0
	
		Ecriture_fichier.ecrire_carre(n, carre, sommeMagique);
		return carre;	
		
	}// Fin de m�thode	
}
