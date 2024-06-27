#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 100

// stack implementation
typedef struct {
    int arr[MAX_SIZE];
    int top;
} Stack;

void init(Stack *s) {
    s->top = -1;
}

void push(Stack *s, int value) {
    s->top++;
    s->arr[s->top] = value;
}

int pop(Stack *s) {
    int value = s->arr[s->top];
    s->top--;
    return value;
}

int is_empty(Stack *s) {
    return s->top == -1;
}

// queue implementation
typedef struct {
    Stack s1, s2;
} Queue;

void enqueue(Queue *q, int value) {
    push(&q->s1, value);
}

int dequeue(Queue *q) {
    if (is_empty(&q->s2)) {
        while (!is_empty(&q->s1)) {
            int value = pop(&q->s1);
            push(&q->s2, value);
        }
    }
    return pop(&q->s2);
}

void display(Queue *q) {
    if (is_empty(&q->s1) && is_empty(&q->s2)) {
        printf("Queue is empty\n");
    } else {
        int i;
        printf("Queue: ");
        for (i = q->s2.top; i >= 0; i--) {
            printf("%d ", q->s2.arr[i]);
        }
        for (i = 0; i <= q->s1.top; i++) {
            printf("%d ", q->s1.arr[i]);
        }
        printf("\n");
    }
}

int main() {
    Queue q;
    init(&q.s1);
    init(&q.s2);

    int n, i, value, choice;

    printf("Enter the number of elements to insert into the queue: ");
    scanf("%d", &n);

    for (i = 0; i < n; i++) {
        printf("Enter element %d: ", i+1);
        scanf("%d", &value);
        enqueue(&q, value);
    }

    Stack s;
    init(&s);

    do {
        printf("\n\n");
        printf("1. Push an element onto the stack\n");
        printf("2. Pop an element from the stack\n");
        printf("3. Display the stack\n");
        printf("4. Enqueue an element into the queue\n");
        printf("5. Dequeue an element from the queue\n");
        printf("6. Display the queue\n");
        printf("7. Exit\n");
        printf("\n");

        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter the element to push onto the stack: ");
                scanf("%d", &value);
                push(&s, value);
                break;
            case 2:
                if (is_empty(&s)) {
                    printf("Stack is empty\n");
                } else {
                    printf("Popped element: %d\n", pop(&s));
                }
                break;
            case 3:
                if (is_empty(&s)) {
                    printf("Stack is empty\n");
                } else {
                    printf("Stack: ");
                    for (i = s.top; i >= 0; i--) {
                        printf("%d ", s.arr[i]);
                    }
                    printf("\n");
                }
        case 4:
            printf("Enter the element to enqueue into the queue: ");
            scanf("%d", &value);
            enqueue(&q, value);
            break;
        case 5:
            if (is_empty(&q.s1) && is_empty(&q.s2)) {
                printf("Queue is empty\n");
            } else {
                printf("Dequeued element: %d\n", dequeue(&q));
            }
            break;
        case 6:
            display(&q);
            break;
        case 7:
            printf("Exiting...\n");
            break;
        default:
            printf("Invalid choice\n");
            break;
    }
} while (choice != 7);

return 0;
}