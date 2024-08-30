#include <stdio.h>
#include <string.h>

int main(void) {
	char fname[16];
	int x;
	scanf("%s %d", fname, &x);
	printf("Get ready for %d greetings...\n", x);
	for (int i = 0; i < x; i++) {
		printf("Hello %d, %s!\n", i, fname);
	}

	printf("Now my choice\n");
	/*
	fname[0] = 'B';
	fname[1] = 'o';
	fname[2] = 'b';
	fname[3] = '\0';
	*/
	strcpy(fname, "Bob");
	strcat(fname, "seph");
	strcat(fname, " the mighty and glorious");
	printf("Hello, %s!\n", fname);

	return 0;
}
