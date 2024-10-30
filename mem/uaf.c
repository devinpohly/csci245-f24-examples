#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	int *arr = malloc(10 * sizeof(int));
	for (int i = 0; i < 10; i++) {
		arr[i] = i;
	}

	free(arr);
	printf("%d\n", arr[3]);

	return 0;
}
