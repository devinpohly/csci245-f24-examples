#include <stdio.h>
#include <string.h>

int length(char str[]);

int main(void) {
	char myname[] = "Abe the Computer";

	printf("My name is %d characters long\n",
			length(myname));

	return 0;
}
