import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(N + " x " + i + " = " + N*i);
        }
    }
}
