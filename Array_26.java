public class Array_26 {

	public static void main(String[] args) {
		//create a 5 students- you have to store marks of these 500 students
		// you have 2 options 
		// create 5 different variables 
		// create an Array
		// three ways to create an array in java
		// Method 1-->declaration+Memory Allocation
      //int []marks=new int[5];
     // Method 2-->declaration +initialization
      int[]marks1;
      marks1=new int[5];
      marks1[0]=100;
      marks1[1]=97;
      marks1[2]=67;
      marks1[3]=87;
      marks1[4]=77;
      System.out.println(marks1[2]);
      //Method 3
      int [] marks2= {100,97,67,87,77};
      System.out.println(marks2[3]);
	}

}

// 1.-->declaration
//    --> memeory allocation
// 3. int[]marks={100,70,98,77,67}-d->declaration+ initialization
