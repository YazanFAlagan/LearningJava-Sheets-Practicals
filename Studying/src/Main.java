import java.util.Random;
import java.util.Scanner;
public class Main {

                    //OOP Class
/*
    public static int f1(int x , int y ){
        int z = x % 10 + y % 10;
        return z;
    }
*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



              //For & ForEach
/*
        int[] arr={1,2,3};
        System.out.println("Using For");
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = 20 ;
            System.out.println(arr[i]);
        }
        System.out.println("Using For Each");
        for(int item : arr) {
            item=30;
            System.out.println(item);
        }
        System.out.println("Using For Each 2 ");
        for (int item : arr){
            System.out.println(item);
        }
*/

                //Errors
/*
        int[] arr={1,2,3};
        System.out.println("Hello Yazan");
        try {
            System.out.println(10/1);
            System.out.println(arr[1]);
            System.out.println("HHHHH");
        }
        catch (Exception e){
            System.out.println("Exception");
        }
        finally {
            System.out.println("There was an Exception Error");
        }
        System.out.println("Good Bye");
*/

        //OOP Student Info , Student Class

/*
        Student s1 = new Student();
        s1.print();
        s1.setID(100);
        s1.setName("Yazan");
        s1.setAge(19);
        s1.setGpa(3.27);
        s1.printInfo();
        System.out.println("Counter = " + Student.counter);

        System.out.println(" ");//BreakLine

        Student s2 = new Student(500, "Yazan", 27 , 3.7);//لو عاوز دول يشتغلو اعمل كومنت للتحت
        s2.print();
        s2.setID(101);
        s2.setName("Omnia");
        s2.setAge(18);
        s2.setGpa(3.6);
        s2.printInfo();
        System.out.println("Counter = " + Student.counter);

        System.out.println(" ");//BreakLine

                //With Array
        Student[] stds = new Student[3];
        stds[0] = new Student();
        stds[1] = new Student(500,"WWW",23,2.3);
        stds[2] = new Student();
        System.out.println("Using For");
        for(int i = 0 ; i < stds.length ; i++){
            System.out.println("Students #" + i );
            stds[i].printInfo();
        }

        System.out.println(" ");//BreakLine

        System.out.println("Using ForEach");
        for(Student s : stds){
            s.printInfo();
        }
*/

        //OOP Class
/*
        String s = new String("Welcome");
        System.out.println(s.charAt(2));
        s = s.concat(" Yazan");
        System.out.println(s);
        System.out.println(s.contains("W"));
        int index = s.indexOf("r");
        System.out.println(index);
        System.out.println(s.startsWith("B"));
        s = s.replace("W","X");
        System.out.println(s.replace("W","X"));
        System.out.println(s);
        int x = (int)(Math.random()*100);
        System.out.println(x);
        Random r = new Random();
        int y = r.nextInt(100);
        System.out.println(y);
*/

                    //Java
/*
        System.out.println("Enter Two Numbers");
        int x = input.nextInt();
        int y = input.nextInt();
        int sum = f1(x,y);
        System.out.println(sum);
*/

/*
        System.out.println("Enter 2 Numbers and String");
        double x = input.nextDouble();
        float y = input.nextFloat();
        String name=input.next();
        System.out.println("X="+ x + y + name);
*/

/*
        System.out.println("Enter Grade 1");
        int m1= input.nextInt();
        System.out.println("Enter Grade 2");
        int m2= input.nextInt();
        System.out.println("Enter Grade 3");
        int m3= input.nextInt();
        System.out.println("Enter Grade 4");
        int m4= input.nextInt();
        int grade= (m1+m2+m3+m4 ) /4;
        System.out.println("Your AVG Grade is " + grade);
*/

/*
        System.out.println("Enter the First Num");
        int num1= input.nextInt();
        System.out.println("Enter the Second Num");
        int num2= input.nextInt();
        int area=num1*num2;
        System.out.println("The Area of The Two Nums is " + area);
*/

/*
        System.out.println("Enter a Num");
        int x = input.nextInt();
        if(x<50){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
*/

/*
        System.out.println("Enter a Num");
        int x = input.nextInt();
        String s= x>50 ? "Pass":"Fail" ;
        System.out.println(s);
*/

/*
        System.out.println("Enter Your Grade");
        int g= input.nextInt();
        if (g>=90) {
            System.out.println("Your Grade is A");
        } else if (g>=80) {
            System.out.println("Your Grade is B");
        } else if (g>=70) {
            System.out.println("Your Grade is C");
        } else if (g>=60) {
            System.out.println("Your Grade is D");
        } else {
            System.out.println("Your Grade is F");
        }
*/

/*
        System.out.println("Enter a Day");
        int s= input.nextInt();
        switch (s){
            case 1:
                System.out.println("Sat");break;
            case 2:
                System.out.println("Sun");break;
            case 3:
                System.out.println("Mon");break;
            case 4:
                System.out.println("Thu");break;
            case 5:
                System.out.println("Thur");break;
            case 6:
                System.out.println("Wid");break;
            case 7:
                System.out.println("Fri");break;
            default:
                System.out.println("Invalid");break;
        }
*/

/*
        System.out.println("Enter 2 Nums");
        int x= input.nextInt();
        int y= input.nextInt();
        System.out.println("Choose The Operation + - * /");
        char op= input.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(x+y);break;
            case '-':
                System.out.println(x-y);break;
            case '*':
                System.out.println(x*y);break;
            case '/': if (y!=0)
                System.out.println(x/y);
            else
                System.out.println("Cannot be Divided by Zero");
            break;
            default:
                System.out.println("Invalid");
            }
*/

/*
        int a=1;
        while (a<=10){
            System.out.println(a);
            a++;
        }
        System.out.println("Finish");

*/

/*
        int a=1;
        do{
            System.out.println(a);
            a++;
        } while (a<=10);
        System.out.println("Finish");
*/

/*
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.println(i);
        }
*/

/*
       int sum = 0 ;
       for (int i =2 ; i<=100 ; i++)
           sum +=i;
        System.out.println(sum);
*/

/*
        System.out.println("Enter a Number");
        int x = input.nextInt();
        int f =1;
        for (int i =1 ; i<=x ;i++)
            f = f * i ;
        System.out.println("Factorial"+f);
*/

/*
        int p =1;
        System.out.println("Enter the Numbers");
        int y = input.nextInt();
        for (int i = 1; i<=y ; i++)
            p = p * x;
        System.out.println(p);
*/

/*
        int sum = 0 ;
        int x = 0 ;
        do {
            sum += x ;
            System.out.println("Enter a Num");
            x = input.nextInt();
        }while (x > 0);
        System.out.println(sum);
*/

/*
        int x,y,sum,ans;
        x = (int)(Math.random()*10);
        y = (int)(Math.random()*10);
        sum= x+y;
        System.out.println("What is The Sum Of " + x + " " + y + " ?");
        ans = input.nextInt();
        while (sum!=ans){
            System.out.println("Try Again !,What is The Sum Of " + x + " " + y + " ?");
            ans = input.nextInt();
        }
        System.out.println("Correct!");
*/

/*
        int x ; int sum = 0;
        System.out.println("Enter a Number, you want to stop Enter a Char");
        while (input.hasNext()){
            if(input.hasNextInt()){
                x = input.nextInt();
                sum += x;
            }
            else {
                System.out.println("Sum= " + sum);break;
            }
        }
*/

/*
        int x = 4 ;
        for(int j = 1 ; j<=x ; j++){
            for(int i = 1 ; i<=x ; i++){
                System.out.print("*");
            }
            System.out.println();
        }
*/

/*
        System.out.println("Enter The Number of Rows");
        int x = input.nextInt();
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
*/

/*
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
*/

/*
         int[] arr = new int[5];
        System.out.println(arr.length);
        System.out.println(arr);
        arr[0]=23;
        System.out.println(arr[0]);
        System.out.println(arr.length-1);
*/

/*
        int[] arr=new int[7];
        System.out.println("Enter " + arr.length + " Values");
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("The elements Y'v Entered");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
*/

/*
        int[] arr=new int[7];
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = (int)(Math.random()*20);
        }
        System.out.println("The elements is");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
*/

/*
        int sum = 0 ;
        int[] arr=new int[7];
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = (int)(Math.random()*20);
            sum += arr[i];
        }
        System.out.println("The elements is");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
        System.out.println("The arr Sum is " + sum);
*/

/*
        int[] arr = {1,2,3,4,5};
        System.out.println("Enter Value");
        int x = input.nextInt();
        boolean f = false;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                f = true;
                break;
            }
        }
        if (f==true){
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
*/

/*
        int[] arr = {1, 2, 3, 5, 6, 7};
        int x = 0 ;
        boolean f = false ;
        for (int i = 0 ; i < arr.length-1 ; i++) {
            if (arr[i+1] - arr[i] > 1 ) {
                f = true ;
                x = arr[i]+1;
                break;
            }
        }
        if(f==true){
            System.out.println("Missing");
        }
        System.out.println(x);
*/

/*
        int[] arr = {1, 2, 5, 6, 7};
        int x = 0 ;
        boolean f = false ;
        for (int i = 0 ; i < arr.length-1 ; i++) {
            if (arr[i+1] - arr[i] > 1 ) {
                System.out.println("Missing Values");
                for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
                    System.out.println(j);
                }
                f = true;
            }
        }
        if(f!=true){
            System.out.println("No Missing");
        }
*/

    }
}