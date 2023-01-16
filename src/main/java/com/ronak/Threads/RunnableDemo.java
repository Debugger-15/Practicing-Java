package com.ronak.Threads;

public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        //Can't throw a checked exception(opposite of runtime exception)
        // since run() in Runnable doesn't have throw Exception as a part of its signature.

        //But can throw Runtime Exceptions
        throw new RuntimeException();
    }
}
