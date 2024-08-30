#include <stdio.h>
#include <string.h>

#include "length.c"
#include "inputlen.c"

int main(void) {
	char fname[16];
	scanf("%s", fname);

	printf("Your name is %d characters long\n",
			length(fname));

	printf("What's your friend's name? ");
	printf("%d characters\n", inputlen());

	return 0;
}
