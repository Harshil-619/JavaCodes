#include <stdio.h>
int main()
{
    printf("\n Enter array size");
    int n;
    scanf("%d",&n);
    int a[n];
    for(int i=0; i<n; i++)
    {
        scanf("%d",&a[i]);
    }
    printf("\n Enter key to search");
    int key;
    scanf("%d",&key);
    int flag=0;
    for(int i=0; i<n; i++)
    {
        if(a[i]==key)
        {
            flag=1;
            printf("Key Found at index %d",i);
            break;
        }
    }
    if(flag==0)
    {
        printf("Key not found");
    }
}
