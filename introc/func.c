#include <stdio.h>
#include <string.h>

// declaration / signature
#include "inputlen.h"
#include "length.h"

int main(void) {
	char fname[16];
	scanf("%s", fname);

	printf("Your name is %d characters long\n",
			length(16, fname));

	printf("What's your friend's name? ");
	printf("%d characters\n", inputlen());

	return 0;
}
