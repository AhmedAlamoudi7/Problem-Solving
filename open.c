// C program to illustrate
// open system call
#include<stdio.h>
#include<fcntl.h>
#include<errno.h>

int main(){
	// if file dose not have in directory
	// then file foo.txt is created
	int fd = open("foo.txt", O_RDONLY | O_CREAT);
	printf("fd = %d", fd);
	if(fd == -1){
		// print error
		printf("Error");
	}
	return 0;
}
