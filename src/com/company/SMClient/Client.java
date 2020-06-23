/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.SMClient;

import com.company.util.Reader;
import com.company.util.Writer;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author user
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("localhost",12345);
        
        System.out.println("Server Connected->>>>");
        
        Thread readerThread=new Thread(new Reader(socket));
        Thread writerThread=new Thread(new Writer(socket));
        
        readerThread.start();
        writerThread.start();
        
        try{
            readerThread.join();
            writerThread.join();
        }
        catch(Exception e){
            System.out.println("Thread exited");
        }
        
    }
}
