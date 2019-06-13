#include <stdio.h>


void bubbleSort(int param[],int size){
	

	for(int i = 0; i < size-1; i++){

		for(int j = 0; j < size-1;j++){

			if(param[j] > param[j+1]){

				int temp = param[j];
				param[j] = param[j+1];
				param[j+1] = temp;

			}

		}

	}

}


void list(int param[],int size){
	
	
	for(int i =0; i< size; i++){
		printf("%d ",param[i]);
	}

}

int main(){
	
	int length;

	printf("Enter the size of an array: ");
	
	scanf("%d",&length);
	
	int data[length];

	int size = sizeof(data)/sizeof(int);

	for(int i = 0; i < size; i++ ){
		 scanf("%d",&data[i]);
	}
	
	bubbleSort(data,size);

	list(data,size);
}
