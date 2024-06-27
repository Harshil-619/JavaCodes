
#include<stdio.h>
#include<stdlib.h>
struct node
{
int data;
struct node * left;
struct node * right;
};
struct node* root=NULL;

void append() //Adding new node at the end//
{
struct node* temp;
temp=(struct node*)malloc(sizeof(struct node));
printf("Enter new node data: ");
scanf("%d",&temp->data);
temp->left=NULL;
temp->right=NULL;

if(root==NULL)
   root=temp;
else
  {
   struct node* p=root;
     while(p->right!=NULL)
       {
        p=p->right;
       }
   p->right=temp;
   temp->left=p;
   }
}

void display()
{
struct node * temp=root;
if(root==NULL)
  printf("List is empty\n");
else
  {
      printf("elements are: ");
   while(temp!=NULL)
    {
     printf("%d ",temp->data);
     temp=temp->right;
    }
  }
}


void length()
{
struct node* temp=root;
int count=0;
if(root==NULL)
printf("list is empty\n");
else
{
while(temp!=NULL)
{
count++;
temp=temp->right;
}
printf("length is: %d\n",count);
}
}

void main()
{
    int ch;
    while(1)
    {
        printf("Available choices are: \n");
        printf("1.Append\n");
        printf("2.Display\n");
        printf("3.Length\n");

        printf("Enter your choice:");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1: append();
            break;
            case 2: display();
            break;
            case 3: length();
            break;
            case 4: exit(0);
            default: printf("Invalid choice\n");
        }
        printf("\n");
    }
}

