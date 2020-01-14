package com.cj.exception;

public class DivTest {
    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 0;
            int c = a / b;
            System.out.println(c);
            return;
//            System.exit(1);
        } catch (IndexOutOfBoundsException ie) {
            System.out.println("index out of bounds exception");
        } catch (NumberFormatException ne) {
            System.out.println("number format exception");
        } catch (ArithmeticException ae) {
            System.out.println("arithmetic exception");
//            return;
            System.exit(1);
        } catch (java.lang.Exception e) {
            System.out.println("unknow exception");
        } finally {
            System.out.println("finally");
        }
    }
}
