public class HelloWorld{

     public static void main(String []args){
        
        System.out.println(String.format("Hello, myName : %s mySurname : %s and myGender : %c","Mustafa","Kiziltay",'M') );
        //=> Hello, myName : Mustafa mySurname : Kiziltay and myAge : 28
        
        System.out.println(String.format(("%.4fc"), (13.34)));
        //=> 13.3400c
        
        
     }
}

Here, we are providing a table of format specifiers supported by the Java String.

Format Specifier	Data Type	Output
%a	floating point (except BigDecimal)	Returns Hex output of floating point number.
%b	Any type	"true" if non-null, "false" if null
%c	character	Unicode character
%d	integer (incl. byte, short, int, long, bigint)	Decimal Integer
%e	floating point	decimal number in scientific notation
%f	floating point	decimal number
%g	floating point	decimal number, possibly in scientific notation depending on the precision and value.
%h	any type	Hex String of value from hashCode() method.
%n	none	Platform-specific line separator.
%o	integer (incl. byte, short, int, long, bigint)	Octal number
%s	any type	String value
%t	Date/Time (incl. long, Calendar, Date and TemporalAccessor)	%t is the prefix for Date/Time conversions. More formatting flags are needed after this. See Date/Time conversion below.
%x	integer (incl. byte, short, int, long, bigint)	Hex string.
