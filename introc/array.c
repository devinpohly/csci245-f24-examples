#include <stdio.h>

int main(void) {
	int arr[10];
	for (int i = 0; i < 10; i++) {
		arr[i] = i * i;
	}

	for (int i = 0; i <= 10; i++) {
		printf("-> [%d] <-\n", arr[i]);
	}

	printf("%d\n", arr[-3]);

	return 0;
}
