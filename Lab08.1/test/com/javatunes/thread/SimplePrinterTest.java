/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.thread;

import java.awt.*;

public class SimplePrinterTest {

  public static void main(String[] args) {
    //Thread thd1 = new Thread(new SimplePrinter());
    //thd1.start();
    
    // Done: create another Thread, passing in a lambda as its Runnable - then start it
    Thread thd2 = new Thread(() -> System.out.println("simple-lambda"));
    thd2.start();



  }
}