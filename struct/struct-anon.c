#include <stdio.h>

int main(void)
{
	struct {
		double x;
		double y;
	} p, q;
	p.x = 3.9;
	p.y = -0.12;

	q = p;

	p.x = 999;

	printf("P: (%g, %g)\n",
		p.x, p.y);
	printf("Q: (%g, %g)\n",
		q.x, q.y);

	return 0;
}
