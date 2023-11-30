//public class WrapperClass {
//        Byte b = 127;
//        Short s = 1020;
//        Integer i = 10;
//        Long l = 100L;
//        Float f = 10.0F;
//        Double d = 1005.0;
//        Character c = '#';
//        Boolean b2 = true;
//
//
//        Byte byteobj=b;
//        Short shortobj=s;
//        Integer intobj=i;
//        Long longobj=l;
//        Float floatobj=f;
//        Double doubleobj=d;
//        Character charobj=c;
//        Boolean boolobj=b2;
//
//        System.out.println("---Printing object values---");
//        System.out.println("Byte object: "+byteobj);
//        System.out.println("Short object: "+shortobj);
//        System.out.println("Integer object: "+intobj);
//        System.out.println("Long object: "+longobj);
//        System.out.println("Float object: "+floatobj);
//        System.out.println("Double object: "+doubleobj);
//        System.out.println("Character object: "+charobj);
//        System.out.println("Boolean object: "+boolobj);
//
//        byte bytevalue=byteobj;
//        short shortvalue=shortobj;
//        int intvalue=intobj;
//        long longvalue=longobj;
//        float floatvalue=floatobj;
//        double doublevalue=doubleobj;
//        char charvalue=charobj;
//        boolean boolvalue=boolobj;
//
//        System.out.println("---Printing primitive values---");
//        System.out.println("byte value: "+bytevalue);
//        System.out.println("short value: "+shortvalue);
//        System.out.println("int value: "+intvalue);
//        System.out.println("long value: "+longvalue);
//        System.out.println("float value: "+floatvalue);
//        System.out.println("double value: "+doublevalue);
//        System.out.println("char value: "+charvalue);
//        System.out.println("boolean value: "+boolvalue);
//
//        //Converting Integer to int
//        Integer a=new Integer(3);
//        int ii=a.intValue();//converting Integer to int explicitly
//        int j=a;//unboxing, now compiler will write a.intValue() internally
//        System.out.println(a+" "+ii+" "+j);
//
//        String ss = "10.1";
//        Double td = Double.parseDouble(ss);
//        System.out.println(td);
//          public class Main {
//          public static void main(String[] args) {
//              Character ch = 'c';
////            ch = 'N';
//          test(ch);
//
//
//
//        String s = ch.toString();
//        System.out.println(s);
//        String n = "12.5234";
//        double number = strtodouble.strtoDouble(n);
//        System.out.println(number);
//
//    }
//
//    static void test(Character a) {
////        ch = 'N';
//    }
//}
//    static class strtodouble {
//    private final int value;
//    strtodouble(int value){
//        this.value = value;
//    }
//            static double strtoDouble(String str) {
//                double result = 0.0;
//                boolean isnegative = false;
//                int startind = 0;
//                if (str.charAt(0) == '-') {
//                    isnegative = true;
//                    startind = 1;
//                }
//                for (int i = startind; i < str.length(); i++) {
//                    if (str.charAt(i) == '.') {
//                        break;
//                    }
//                    result = result * 10 + (str.charAt(i) - '0');
//                }
//                if (str.indexOf('.') != -1) {
//                    double dec = 0.1;
//                    for (int i = str.indexOf('.') + 1; i < str.length(); i++) {
//                        result = result + (str.charAt(i) - '0') * dec;
//                        dec = dec / 10;
//                    }
//                }
//                if (isnegative) {
//                    result = -result;
//                }
//                return result;
//            }
//
//    }
//}