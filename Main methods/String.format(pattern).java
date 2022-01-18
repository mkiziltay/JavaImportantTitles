import java.text.MessageFormat;

public class HelloWorld{

     public static void main(String []args){
        
        System.out.println(String.format("Hello, myName : %s mySurname : %s and myGender : %c","Mustafa","Kiziltay",'M') );
        //=> Hello, myName : Mustafa mySurname : Kiziltay and myAge : 28
        
        System.out.println(String.format(("%.4fc"), (13.34)));
        //=> 13.3400c
        
        System.out.println(MessageFormat.format("Best {0} of {1}", "FILM", "THE YEAR"));
         //Best FILM of THE YEAR
          
        System.out.println(String.format("Local Date: %tD", Calendar.getInstance()));
          //Local Date: 01/18/22
        System.out.println(String.format("Local Time: %tT", Calendar.getInstance()));
          //Local Time: 22:13:00
        System.out.println(String.format("Local Year: %tY", Calendar.getInstance()));
          //Local Year: 2022
     }
}
/*
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
*/
