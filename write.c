// C program to illustrate
// write system call
#include<stdio.h>
#include<fcntl.h>
#include<string.h>
#include<stdlib.h>
#include<unistd.h>

int main(){
	int fd = open("foo.txt", O_WRONLY | O_CREAT, 0644);
	if (fd < 0){
		perror("error");
		exit(1);
	}
	
	int size = write(fd, "Hello", strlen("Hello"));
	if (size < 0){
		perror("error");
		exit(1);
	}
	
	if (size > 0){
		printf("write done");
	}
	
	close(fd);	
}
