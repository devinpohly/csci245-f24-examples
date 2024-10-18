#include <stdio.h>

struct mystruct {
	int x;
	int y;
	int z[1000];
};

void foo(struct mystruct *ms) {
	printf("%d %d\n", ms->x, ms->y);
}

int main(void)
{
	struct mystruct a;
	a.x = 10;
	a.y = 333;

	foo(&a);

	return 0;
}
