public class HelloWorld{

     public static void main(String []args){
        
        System.out.println(String.format("Hello, myName : %s mySurname : %s and myGender : %c","Mustafa","Kiziltay",'M') );
        //=> Hello, myName : Mustafa mySurname : Kiziltay and myAge : 28
        
        System.out.println(String.format(("%.4fc"), (13.34)));
        //=> 13.3400c
        
        
     }
}