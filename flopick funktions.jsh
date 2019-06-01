void k() {
   printf("Hello Smarlik\n");
   printf(12*123);
}


void DoGood(String name) {    
   printf( name+" " );
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