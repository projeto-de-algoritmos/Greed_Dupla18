import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] g = {1,2,3}; //Caso deseje, modifique aqui o tamanho mínimo do cookie.
        int[] s = {1,1}; //Caso deseje, modifique aqui a lista de tamanhos dos cookies.

        System.out.println("Resposta:\n");
        System.out.println(findContentChildren(g, s));
	}
	
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
            
        int count_1 = 0;
        int count_2 = 0;
        
        while(count_1 < g.length && count_2 < s.length){
            if(g[count_1] <= s[count_2]){
                count_1++;
                count_2++;
            }
            else{
                count_2++;
            }
        }
        
        return count_1;
    }

}