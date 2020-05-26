#include <iostream>
#include <stdio.h>
int main()
{
  char str[100], rev[100];     
  int count = 0, i = 0;
  std::cin.getline(str,100);
  while(str[i++]!='\0');
  for(i=i-2;i>=0;i--) rev[count++]=str[i];
  rev[count]='\0';
  std::cout<<rev;
}