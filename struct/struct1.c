#include <stdio.h>

struct point {
	double x;
	double y;
};

int main(void)
{
	struct point p;
	p.x = 3.9;
	p.y = -0.12;

	struct point q;
	q = p;

	p.x = 999;

	printf("P: (%g, %g)\n",
		p.x, p.y);
	printf("Q: (%g, %g)\n",
		q.x, q.y);

	return 0;
}
