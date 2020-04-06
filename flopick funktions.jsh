/**
 * Initializing JShell environment
 */

import static java.lang.System.*;

import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.nio.*;
import java.nio.file.*;

BufferedReader stdin = new BufferedReader(new InputStreamReader(in));

void printf(String s) {
    System.out.print(s);
}

void printf(int i) {
    System.out.print("" + i);
}

void printf(boolean i) {
    System.out.print("" + i);
}

String read() {
    try {
        return stdin.readLine();
    } catch (Exception e) {
        e.printStackTrace();
        return "";
    }
}

int readInt() {
    try {
        return new Scanner(in).nextInt();
    } catch (Exception e) { 
        e.printStackTrace();
        return 0;
    }
}

int rand(int m) {
    return (int)(Math.random() * m);
}

/**
 * HelloJShell
 */

void k() {
   printf("Hello Smarlik\n");
   printf(12*123);
}


void DoGood(String name) {    
   printf( name+", " );
   printf("Do the good you know, \nLet compassion show,\nYou can't save the world, alone but,\nYou can do the good you know!!!");
}

void River() {
    printf("Hello santa\n\n\n       Peace Like a River\n\nI've got peace like a river,\nI've got peace like a river,\nI've got peace like a river in my soul");
}


void hello(String name,int age) {
   printf("Hello "+name+"\n");
   printf("You are " +age+" years old");
}


 void hello (String name,int age,String color) { 
     printf("Hello "+name);
	 printf("\nYou are "+age+" years old ");
	 printf("\nYour favorit color is "+color);
 }
 
 
 void rogi() {
     printf (BOO);
 }
 
 
 void IsMyCat(String name) {
	 printf("Bite"==name);
 }
 
 void IsMyCat2(String name) {
	 if ("Bite"==name){
		 printf("kitty,kitty,kitty!!!yay!");
	 } else {
		 printf ("bad kitty!BAD!!!");
	 }
 }  
 
 
void whichGrade() {  
	printf("How old are you? ");
	printf("\n");
	int age=readInt();
	if(age==6){
		printf("You are in 1st grade");
	}
	if(age==7) {
		printf("You are in 2nd grade");
	}
	if(age==8) {
		printf("You are in 3rd grade");
	}
	if (age>8) {
		printf("You are in another grade or you are not in school");
	}
}
  
void min2sec() {
	printf("Write minutes: ");
	int min=readInt();
	printf(min*60+" seconds");
}

void DaysToHours() {
    printf("Write days: ");
    int day=readInt();
    printf(day*24+" hours");
}

void Birthday(int n, String name ) {
	n=n+1;
    for(int c=1;c<n;c=c+1) {
		printf(c);
		printf(" Happy b-day "+name+"!!!!\n");
	}
}

void Sandwitch(int layers, int tomatos) {
	printf(layers-tomatos);
	printf("that is how many layers of other food is left in the sandwitch");
}

// This funktion draws a line length of S
void lines(int s) {
	for(int c=0;c<s;c=c+1) {
		printf("- ");
	}
}

// This funktion draws a square
void square(int s) {
	for(int c=0;c<s;c=c+1) {
		lines(s);
		printf("\n");
	}
}

// This funktion draws a rectangle
void rect(int h, int l) {
    for(int c=0;c<h;c=c+1) {
		lines(l);
		printf("\n");
	}
}

void PrintNums(int n) {
	for(int c=1;c<n;c=c+1){
		printf(c);
		if(c<n-1) {
			printf(",");
		}	
	}
}

// This function prints odd numbers.
void PrintOdd(int n) {
	for(int c=1;c<n;c=c+2){
		printf(c);
		if(c<n-2) {
			printf(","); 
		}
	}
}

// Create Empty Int Array
int[] CEIA() {
	printf("size: ");
	int s=readInt();
	int[] a;
	a=new int[s];
	return a;
}
// Create Int Array
int[] CIA() {
	int[] a=CEIA();
	printf("values:\n");
	int s=a.length;
	for(int c=0;c<s;c=c+1) {
		a[c]=readInt();
		}
	return  a;
}

void printArray(int[] a) {
	for(int c=0;c<a.length;c=c+1) {
		printf(a[c]);
		if(c<a.length-1) {
			printf(",");
		}
	}
}

void printSum( int[] a) {
	int sum=0;
	for(int c=0;c<a.length;c=c+1) {
		sum=a[c]+sum;
	}
	printf(sum);
}

int find(int n,int[] a) {
	for(int c=0;c<a.length;c=c+1) {
		if(n==a[c]) {
			return c;
		}
	}
	return -1;
}

String WhichColor() {
	String[] a=new String[]{"red","pink","purple"};
	int i= rand(3);
	return a[i];
}

void Beetween1and2() {
	printf("1\n");
	for(int c=1;c<10;c=c+1) {
		printf("1." + c + "\n");		
	}
	printf("2");
}

void Beetween1and2() {
	printf("1\n");
	for(int c1=0;c1<10;c1=c1+1) {
		for(int c2=0;c2<10;c2=c2+1){
			for(int c3=0;c3<10;c3=c3+1) {
				printf("1."+c1);
				printf(c2);
				printf(c3);
				printf("\n");
			}
		}
	}
}