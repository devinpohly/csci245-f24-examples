#include <stdio.h>

int main(void)
{
	int a[5];
	for (int i = 0; i < 5; i++) {
		a[i] = i * i * i;
	}

	int *px = &a[0];

	printf("%ld\n", *px);
	printf("%ld\n", *(px + 1));
	printf("%ld\n", *(px + 2));
	printf("%ld\n", *(px + 3));
	printf("%ld\n", *(px + 4));

	printf("%d %d\n", a[3], 3[a]);

	return 0;
}
