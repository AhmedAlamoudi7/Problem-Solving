// C program to illustrate
// read system call

#include<stdio.h>
#include<fcntl.h>
#include<string.h>
#include<stdlib.h>
#include<unistd.h>

int main(){
	int fd, sz;
	char c[100];
	fd = open("foo.txt", O_RDONLY | O_CREAT);
	if(fd < 0 ){
		perror("r1");
		exit(1);
	}
	
	sz = read(fd, c , 10);

	printf("Output: %s", c);
}
