package com.printer.client;

import java.lang.reflect.Method;

public class PrinterClient {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.printer.impl.Printer");
        Object printer = clazz.newInstance();
        Method method = clazz.getDeclaredMethod("print", new Class<?>[]{ String.class });
        method.setAccessible(true);
        method.invoke(printer, new Object[]{ "Hello world!" });
    }
}
