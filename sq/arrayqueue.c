#include <stdio.h>
#include <stdlib.h>

struct array_queue {
	int *arr;
	int capacity;
	int head;
	int size;
};

void aq_init(struct array_queue *aq) {
	aq->capacity = 10;
	aq->arr = malloc(aq->capacity * sizeof(int));
	aq->head = 0;
	aq->size = 0;
}

// if you call this on an empty queue,
// be it on your own head
int aq_peek(struct array_queue *aq) {
	int last = (aq->head + aq->size - 1) % aq->capacity;
	return aq->arr[last];
}

void aq_ensure_capacity(struct array_queue *aq, int size) {
	if (size <= aq->capacity) {
		return;
	}

	printf("SEVERED CATERPILLAR :(\n");

	int newcap = aq->capacity * 2;
	while (newcap < size)
		newcap *= 2;

	/* // allocate new array */
	/* int *newarr = malloc(newcap * sizeof(int)); */
	/* // copy old data over */
	/* for (int i = 0; i < aq->size; i++) { */
	/* 	newarr[i] = aq->arr[i]; */
	/* } */
	/* // free old array */
	/* free(aq->arr); */
	/* aq->arr = newarr; */
	/* aq->capacity = newcap; */

	aq->capacity = newcap;
	aq->arr = realloc(aq->arr, aq->capacity * sizeof(int));
}

void aq_enqueue(struct array_queue *aq, int item) {
	aq_ensure_capacity(aq, aq->size + 1);

	aq->size++;
	int last = (aq->head + aq->size - 1) % aq->capacity;
	aq->arr[last] = item;
}

int aq_dequeue(struct array_queue *aq) {
	int remember = aq->arr[aq->head];
	aq->size--;
	aq->head++;
	aq->head %= aq->capacity;
	return remember;
}

void aq_destroy(struct array_queue *aq) {
}

int main(void) {
	struct array_queue s;
	aq_init(&s);
	aq_enqueue(&s, 1);
	aq_enqueue(&s, 2);
	aq_enqueue(&s, 3);
	printf("%d\n", aq_dequeue(&s));
	aq_enqueue(&s, 4);
	aq_enqueue(&s, 5);
	printf("%d\n", aq_dequeue(&s));
	printf("%d\n", aq_dequeue(&s));
	printf("%d\n", aq_dequeue(&s));
	aq_destroy(&s);
	return 0;
}
