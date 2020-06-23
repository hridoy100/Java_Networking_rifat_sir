/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.labnetworking;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author user
 */
public class LabNetworking {

    
    
    
    
    public static void main(String[] args) throws UnknownHostException, IOException {
        
        InetAddress address=InetAddress.getByName("127.0.0.1");
        
        System.out.println(address.getHostAddress());
        System.out.println(address.isReachable(1000));
        
        byte []ipaddress=new byte[4];
        ipaddress[0]=(byte)192;
        ipaddress[1]=(byte)168;
        ipaddress[2]=(byte)0;
        ipaddress[3]=(byte)6;
        
        InetAddress addresspc=InetAddress.getByAddress(ipaddress);
        System.out.println(addresspc.isReachable(10000));        
    }
    
}
