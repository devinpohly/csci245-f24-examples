#include <stdio.h>
#include <stdlib.h>

struct array_stack {
	int *arr;
	int capacity;
	int size;
};

void as_init(struct array_stack *as) {
	as->arr = malloc(2 * sizeof(int));
	as->capacity = 2;
	as->size = 0;
}

// if you call this on an empty stack,
// be it on your own head
int as_peek(struct array_stack *as) {
	return as->arr[as->size - 1];
}

void as_push(struct array_stack *as, int item) {

}

int as_pop(struct array_stack *as) {

}

void as_destroy(struct array_stack *as) {
	free(as->arr);
}

int main(void) {
	struct array_stack s;
	as_init(&s);
	as_push(&s, 1);
	as_push(&s, 2);
	as_push(&s, 3);
	printf("%d\n", as_pop(&s));
	as_push(&s, 4);
	as_push(&s, 5);
	printf("%d\n", as_pop(&s));
	printf("%d\n", as_pop(&s));
	printf("%d\n", as_pop(&s));
	as_destroy(&s);
	return 0;
}
