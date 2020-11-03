/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.thread;

public class MessagePrinterClient {

  public static void main(String[] args) {
    // DONE: create two instances of your thread subclass and start them up
      MessagePrinter msgPrntr1 = new MessagePrinter("apples are yummy");
      MessagePrinter msgPrntr2 = new MessagePrinter("pears, too", 1500);
      msgPrntr1.start();
      msgPrntr2.start();
  }
}