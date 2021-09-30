#include <stdio.h>
#include <stdlib.h>
void filebair();

int main()
{
    filebair();
    return 0;
}

void filebair()
{
    FILE *fp;
    char ch;
    char fnev[50];
    printf("Filenev: ");
    scanf("%s",fnev);
    fp=fopen(fnev, "w");
    printf("Üzenet");
    while((ch=getchar())!='#')
    {
        fputc(ch,fp);
    }
    fclose(fp);

    fp=fopen(fnev, "r");
    while((ch=getc(fp))!=EOF)
    {
        printf("%c",ch);
    }
    fclose(fp);
    return 0;
}
