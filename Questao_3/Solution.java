public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        int[] flowerbed = {1,0,0,0,1}; //Caso deseje, modifique aqui a lista com o campo de flores.
        int quantidade_flores = 1; //Caso deseje, modifique aqui a quantidade de flores.

        System.out.println("Resposta:\n");
        System.out.println(canPlaceFlowers(flowerbed,quantidade_flores));

	}
	
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int tam = flowerbed.length;
        int[] lista = new int [tam+2];
        
        for(int i = 0; i<tam; i++){
            lista[i+1] = flowerbed[i];
        }
        
        int pos = 1;
        
        while(pos <= tam){
            if(lista[pos] == 0 && lista[pos-1] == 0 && lista[pos+1] == 0){
                n--;
                lista[pos] = 1;
            }
            pos++;
            
            if(n <= 0)
                return true;
        }
        return false;
    }
}