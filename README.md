# Structure de Donnée Arbre (Abre binaire, ABR, AVL...)

Pour cette Structure de donnée, nous avons choisis la représentation des listes de sous-arbres par chaînage. 

De plus, nous allons considerer que nous stockerons des entier. Nous pouvons bien entudu étendre cette Structure de Donnée pour stocker des objets ou d'autre types de données.

Avant de commencer, nous allons vous rappeler rapidement le vocabulaire lié aux arbres : 

<p align="center">
![Source : Arbres binaires Irena Rusu](C:\Users\billa\Documents\Programmation\Java\Perso\SD_Arbre\Terminologie Arbre.png "Terminologie des Arbres")
</p>
## Classe Tree :

la classe Tree est donc représentée par chainage. 

Elle contient un attribut qui est un pointeur vers la racine et à besoin deux deux autres classes pour fonctionner correctement : 
* **Node** qui correspond  à un noeud quelconque de l'arbre (noeud interne ou externe) 