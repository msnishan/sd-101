package com.sd101.day1.history.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("hello day1");


        /**
         *
         * simple server socket to showcase usages of port and the first steps
         * to http server
         *
         *
         */

        int port = 32000;


        try(ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {
                Socket socket = serverSocket.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream());

                String line = in.readLine();
                System.out.println("Received request: " + line);

                // Send a simple HTTP response
                out.println("HTTP/1.1 200 OK");
                out.println("Content-Type: text/plain");
                out.println();
                out.println("Hello from the server!");
                out.flush();

                socket.close();
            }

        }

    }
}
