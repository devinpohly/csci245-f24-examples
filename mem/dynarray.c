#include <stdio.h>
#include <stdlib.h>

int * new_array(int n) {
	return malloc(sizeof(int) * n);
}

int main(void)
{
	int *arr;
	int *arr3;
	for (int i = 0; i < 1000000000; i++) {
		arr = new_array(20);
		arr3 = new_array(20);
		for (int i = 0; i < 20; i++) {
			arr[i] = i * i;
		}
		for (int i = 0; i < 20; i++) {
			arr3[i] = i * i * i;
		}
	}
	for (int i = 0; i < 20; i++) {
		printf("%d ", arr[i]);
	}
	printf("\n");
	for (int i = 0; i < 20; i++) {
		printf("%d ", arr3[i]);
	}
	printf("\n");
	return 0;
}
