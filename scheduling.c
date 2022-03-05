#include<stdio.h>
#include<stdlib.h>

struct scheduling
{
    int ini;
    int final;
};

struct scheduling s[1000000] = {};

/*void bubble_sort (scheduling vetor[], int n) {
    int k, j;
    scheduling aux;

    for (k = 1; k < n; k++) {
        //printf("\n[%d] ", k);

        for (j = 0; j < n - 1; j++) {
            //printf("%d, ", j);

            if (vetor[j].final > vetor[j + 1].final) {
                aux          = vetor[j];
                vetor[j]     = vetor[j + 1];
                vetor[j + 1] = aux;
            }
        }
    }
} */



int compara(const void *a, const void *b) {
	struct scheduling *x = (struct scheduling *)a;
	struct scheduling *y = (struct scheduling *)b;

	return x->final - y->final;

}


int main(){
    int flag;
    
    scanf("%d",&flag);
    
    for(int i = 0;i<flag;i++){
        int n;
        scanf("%d",&n);
        
        
        for (int j = 0; j < n; j++){
            scanf("%d",&s[j].ini);
            scanf("%d",&s[j].final);
        }
        
        qsort(s,n,sizeof(struct scheduling),compara);
        
        //int vetor[1000000]={};
        int concatena = 0,pos = 0;
        //vetor[pos] = 0;
        pos++;
        for(int k = 1;k<=n;k++){
            if(s[concatena].final <= s[k].ini){
                concatena = k;
                //vetor[pos] = k;
                pos++;
            }
        }
        printf("%d\n",pos);
        
        
    } 


    return 0;
}