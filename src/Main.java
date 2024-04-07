//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Java has two categories of data types:
        //Primitive data types - includes byte, short, int, long, float, double, boolean and char
        //Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)

        //Primitive Data Types: These are the most basic data types in Java, and they are not objects. They include:

        //byte:1 byte, 8-bit signed integer. Range: -128 to 127.
        //short:2 bytes, 16-bit signed integer. Range: -32,768 to 32,767.
        //int:4 bytes, 32-bit signed integer. Range: -2^31 to 2^31-1.
        //long:8 bytes, 64-bit signed integer. Range: -2^63 to 2^63-1.
        //float:4 bytes, 32-bit floating point. Example: 3.14f.
        //double:8 bytes, 64-bit floating point. Example: 3.14.
        //boolean:1 bit, Represents true or false.
        //char:	2 bytes, 16-bit Unicode character. Example: 'A', '\u0041'.

        byte age=127;//byte ko hm -128 to 127 hi 0 to 127 hi kr sakte hai
        int phone=1234567890;//int me 10 se jyada number ko print nhi kra skte hai
        long phoneLong=5677687899809807897L;//LONG me 10 se jyada number ko print kra skte last me L add krne se error show nhi hota hai
        float point=65656.98989f;// point ke liye use hota hai
        char letter='a';//character me single quests ke ander koie ak letter/number ko print kra skte hai
        boolean cct=true;//boolean ke ander hmlog true or false ko print kra skte hai

        System.out.println(age);
        System.out.println(phone);
        System.out.println(phoneLong);
        System.out.println(point);
        System.out.println(letter);
        System.out.println(cct);
        }
    }
