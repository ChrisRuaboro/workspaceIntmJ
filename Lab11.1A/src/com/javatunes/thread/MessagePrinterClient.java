/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.thread;

import javax.swing.plaf.TableHeaderUI;

public class MessagePrinterClient {

  public static void main(String[] args) {
    // DONE: create two instances of your thread subclass and start them up
      MessagePrinter msgPrntr1 = new MessagePrinter("apples are yummy");
      MessagePrinter msgPrntr2 = new MessagePrinter("pears, too", 1500);
//      msgPrntr1.start();
//      msgPrntr2.start();

    Thread thd1 = new Thread(msgPrntr1,"Msg-Prntr-1");
    thd1.start();
    Thread thd2 = new Thread(msgPrntr2, "Msg-Prntr-2");
    thd2.start();

  }
}