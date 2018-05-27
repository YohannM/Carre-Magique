package cavalier;

import ecriture_fichier.Ecriture_fichier;
import force_Brute.ordre3;

public class Cavalier_impair {

public static int[][] ordreImpair(int n) { //création de méthode pour les carrés d'ordre impair
		
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
	{// si n est un multiple de 3 tout en étant différent de 3
		
		double s = Math.random()*50 + 15; //on détermine aléatoirement la somme que devra respecter les carré magiques d'ordre 3
		                     //qui composeront notre grand carré magique d'ordre n (à multiplier par 3 car doit être congrue à 0[3]
		int d = n/3;//on regarde le nombre de carré d'ordre n qu'il faudra utiliser pour couvrir un côté du carré
		
		carre= new int[n][n]; //on crée notre grand carré d'ordre n
			
			for (int j=0, l=0; j<d; j++, l=l+3){//s'éxécute d fois (pour chaque ligne)
				
				//à chaque itération, il faut remplir une nouvelle série de carré de 3*3 sur une ligne, donc on incrémente la valeur
				//la ligne de 3 pour sauter les lignes de carré remplis à l'itération k-1
			
				for ( int u=0, c=0; u<d; u++, c=c+3){ //s'éxécute d fois (pour chaque colonne)
				
				//à chaque itération, il faut remplir un nouveau carré de 3*3 sur une colonne, donc on incrémente la valeur
				//la colonne de 3 pour sauter les carrés remplis à l'itération k-1
				
					int[][] carreVariant= ordre3.ordreTrois1(3*(int) s );//à chaque itération on crée un tableau de dimension 3 ayant pour somme 3*s
			
				//maintenant qu'on a les cordonnées de la case en haut à gauche du tableau de dimension 3 à remplir
				//on remplit le carré de dimension trois relativement à cette première case
				
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
	{//Si n non congrue à 0[3]
		
		double premierligne = Math.random()*n; //On choisit aléatoirement la première case à remplir
		double premiercolonne = Math.random()*n;
		
		carre[(int) premierligne][(int) premiercolonne] = 1; //On affecte 1 à la première case choisie aléatoirement
		
		for (int i =1; i<Math.pow(n,2); i++)
		{ //Boucle qui sert à remplir les n^2 cases
		
			if (i%n==0)
			{ //toutes les n cases, on descend d'une case sur la droite (voir algorithme du cavalier)
				premierligne=(premierligne+1)%n; //une case sur la droite
				premiercolonne=(premiercolonne+1)%n; //une case vers le bas
			}
			else 
			{ //autrement, procédure habituelle
				premierligne= (int) premierligne-1; //on monte d'une case (voir algo)
			
				if ( (int) premierligne <0)
				{ //Si on est sortie du tableau par le haut...
					premierligne= premierligne+n; //On descend de n lignes (revient à faire %n pour les négatifs)
				}
			
			premiercolonne = (int) premiercolonne+2; //Puis on décale de deux colonnes vers la droite (voir algo)
			
				while (carre[((int) premierligne) ][((int) premiercolonne)%n]!=0 )
				{ //Tant que la nouvelle case sur laquelle on tombe est déja occupée...
					premiercolonne++; //On décale d'une case vers la droite
				}
			}
			carre[((int) premierligne)%n ][((int) premiercolonne)%n]= i+1; //Ligne commune pour tous les cas de figure : on affecte la valeure
			                                                           //suivante à la case choisie (voir algo)
		}
		
		sommeMagique = (n*n*n+n)/2;
		
		} //Fin si n%3!=0
	
		Ecriture_fichier.ecrire_carre(n, carre, sommeMagique);
		return carre;	
		
	}// Fin de méthode	
}
