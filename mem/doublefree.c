#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	int *arr = malloc(10 * sizeof(int));
	for (int i = 0; i < 10; i++) {
		arr[i] = i;
	}

	int *arr2 = arr;

	free(arr);
	free(arr2);

	return 0;
}
