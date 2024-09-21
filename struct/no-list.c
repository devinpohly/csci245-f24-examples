#include <stdio.h>

// This does not work!
struct list_node {
	int datum;
	// We need a reference here!
	struct list_node next;
};

int main(void)
{
	struct list_node n1;
	n1.datum = 1;

	struct list_node n0;
	n0.datum = 5;
	n0.next = n1;

	return 0;
}
