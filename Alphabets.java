public class Launch {

    public static void main(String[] args) {

        

	int n=7;	for(int i=0; i<=n-1; ++i){

		//to print letter J

		for(int j=0; j<=n-1; ++j){

		   if(i==0|| j==n/2|| i-j==n/2){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter A

		for(int j=0; j<=n-1; ++j){

		   if(j==0 && i!=0|| j==n-1 && i!=0|| i==n/2|| i==0 && j!=0 && j!=n-1){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter V

		for(int j=0; j<=n-1; ++j){

		   if((i==j || i+j==n-1) && i<=n/2){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter A

		for(int j=0; j<=n-1; ++j){

		   if(j==0 && i!=0|| j==n-1 && i!=0|| i==n/2|| i==0 && j!=0 && j!=n-1){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		System.out.print(" ");

		System.out.print(" ");

		System.out.print(" ");

		//to print letter I

		for(int j=0; j<=n-1; ++j){

		   if(i==0|| i==n-1|| j==n/2){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

        //to print letter S

		for(int j=0; j<=n-1; ++j){

		   if(i==0 && j!=0 || i==n/2 && j!=0 && j!=n-1|| i==n-1 && j!=n-1|| j==0 && i!=0 && i<n/2|| j==n-1 && i!=n-1 && i>n/2){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		System.out.print(" ");

		System.out.print(" ");

		System.out.print(" ");

		//to print letter A

		for(int j=0; j<=n-1; ++j){

		   if(j==0 && i!=0|| j==n-1 && i!=0|| i==n/2|| i==0 && j!=0 && j!=n-1){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter M

		for(int j=0; j<=n-1; ++j){

		   if(j==0|| j==n-1|| i==j && i<=n/2|| i+j==n-1 && i<=n/2){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter A

		for(int j=0; j<=n-1; ++j){

		   if(j==0 && i!=0|| j==n-1 && i!=0|| i==n/2|| i==0 && j!=0 && j!=n-1){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

        //to print letter z

		for(int j=0; j<=n-1; ++j){

		   if(i==0|| i+j==n-1|| i==n-1){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter I

		for(int j=0; j<=n-1; ++j){

		   if(i==0|| i==n-1|| j==n/2){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter N

		for(int j=0; j<=n-1; ++j){

		   if(j==0|| i==j|| j==n-1){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter G

		for(int j=0; j<=n-1; ++j){

		   if(i==0|| j==0|| i==n/2 && j>=n/2|| j==n/2 && i>=n/2|| i==n-1 && j<=n/2|| j==n-1 && i!=n/2-1){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		   System.out.println();

	}

    //to move cursor to next line

	System.out.println();

	for(int i=0; i<=n-1; ++i){

		//to print letter P

		for(int j=0; j<=n-1; ++j){

		   if((i==0|| i==n/2)&&(j!=n-1)|| j==0|| j==n-1 && i>0 && i<n/2){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter R

		for(int j=0; j<=n-1; ++j){

		   if((i==0|| i==n/2)&&(j!=n-1)|| j==0|| j==n-1 && i>0 && i<n/2|| i-j==n/2){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter O

		for(int j=0; j<=n-1; ++j){

		   if((i==0|| i==n-1)&& j!=n-1 && j!=0|| (j==0|| j==n-1)&& i!=0 && i!=n-1){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter U

		for(int j=0; j<=n-1; ++j){

		   if((j==0|| j==n-1)&& i!=n-1|| i==n-1 && j!=0 && j!=n-1){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter D

		for(int j=0; j<=n-1; ++j){

		   if((i==0|| i==n-1)&& j!=n-1|| j==0|| j==n-1 && i!=0 && i!=n-1){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		System.out.print(" ");

		System.out.print(" ");

		System.out.print(" ");

		//to print letter G

		for(int j=0; j<=n-1; ++j){

		   if(i==0|| j==0|| i==n/2 && j>=n/2|| j==n/2 && i>=n/2|| i==n-1 && j<=n/2|| j==n-1 && i!=n/2-1){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter Q

		for(int j=0; j<=n-1; ++j){

		   if((i==0 && j!=0 && j<=n/2)|| (j==0 && i!=0 && i<=n/2) || (i==j && i>=n/2)||(i==n/2+1 && j!=0 && j<=n/2)||(j==n/2+1 && i!=0 && i<=n/2)){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter T

		for(int j=0; j<=n-1; ++j){

		   if(i==0|| j==n/2){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter I

		for(int j=0; j<=n-1; ++j){

		   if(i==0|| i==n-1|| j==n/2){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter A

		for(int j=0; j<=n-1; ++j){

		   if(j==0 && i!=0|| j==n-1 && i!=0|| i==n/2|| i==0 && j!=0 && j!=n-1){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter N

		for(int j=0; j<=n-1; ++j){

		   if(j==0|| i==j|| j==n-1){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter S

		for(int j=0; j<=n-1; ++j){

		   if(i==0 && j!=0 || i==n/2 && j!=0 && j!=n-1|| i==n-1 && j!=n-1|| j==0 && i!=0 && i<n/2|| j==n-1 && i!=n-1 && i>n/2){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.println( );

	}

	//to move cursor to next line

	System.out.println();

	for(int i=0; i<=n-1; ++i){

		//to print letter T

		for(int j=0; j<=n-1; ++j){

		   if(i==0|| j==n/2){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter H

		for(int j=0; j<=n-1; ++j){

		   if(j==0|| j==n-1|| i==n/2){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter A

		for(int j=0; j<=n-1; ++j){

		   if(j==0 && i!=0|| j==n-1 && i!=0|| i==n/2|| i==0 && j!=0 && j!=n-1){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter N

		for(int j=0; j<=n-1; ++j){

		   if(j==0|| i==j|| j==n-1){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter K

		for(int j=0; j<=n-1; ++j){

		   if(j==0|| i-j==n/2|| i+j==n/2){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		System.out.print(" ");

		System.out.print(" ");

		System.out.print(" ");

		//to print letter Y

		for(int j=0; j<=n-1; ++j){

		   if(i==j && i<=n/2|| i+j==n-1){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter O

		for(int j=0; j<=n-1; ++j){

		   if((i==0|| i==n-1)&& j!=n-1 && j!=0|| (j==0|| j==n-1)&& i!=0 && i!=n-1){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter U

		for(int j=0; j<=n-1; ++j){

		   if((j==0|| j==n-1)&& i!=n-1|| i==n-1 && j!=0 && j!=n-1){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		System.out.print(" ");

		System.out.print(" ");

		System.out.print(" ");

		//to print letter G

		for(int j=0; j<=n-1; ++j){

		   if(i==0|| j==0|| i==n/2 && j>=n/2|| j==n/2 && i>=n/2|| i==n-1 && j<=n/2|| j==n-1 && i!=n/2-1){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter R

		for(int j=0; j<=n-1; ++j){

		   if(j==0 || (i==0 || i==n/2) && j<n/2 ||i-j==n/2 || j==n/2 && i<n/2 && i!=0){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		System.out.print(" ");

		System.out.print(" ");

		//to print letter S

		for(int j=0; j<=n-1; ++j){

		   if(i==0 && j!=0 || i==n/2 && j!=0 && j!=n-1|| i==n-1 && j!=n-1|| j==0 && i!=0 && i<n/2|| j==n-1 && i!=n-1 && i>n/2){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter I

		for(int j=0; j<=n-1; ++j){

		   if(i==0|| i==n-1|| j==n/2){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.print(" ");

		//to print letter R

		for(int j=0; j<=n-1; ++j){

		   if(j==0 || (i==0 || i==n/2) && j<n/2 ||i-j==n/2 || j==n/2 && i<n/2 && i!=0){

		   System.out.print("*");

		}

		else{

		   System.out.print(" ");

		}

		}

		System.out.println( );

	}

    } 

}
