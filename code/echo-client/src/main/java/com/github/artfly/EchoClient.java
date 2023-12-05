package com.github.artfly;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

/*
1_000 clients send smth to server
 */
class EchoClient {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[1_000];
        for (int i = 0; i < 1_000; i++) {
            Thread thread = new Thread(new Client(i));
            thread.start();
            threads[i] = thread;
        }
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println("Finished all clients!");
    }

    static class Client implements Runnable {

        private final int i;

        Client(int i) {
            this.i = i;
        }

        @Override
        public void run() {
            try(Socket socket = new Socket()) {
                socket.connect(new InetSocketAddress("localhost", 8080));
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                Thread.sleep(200);
                writer.print(i);
                writer.flush();
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
