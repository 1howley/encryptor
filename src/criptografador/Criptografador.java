package criptografador;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class Criptografador
{
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase para criptografar:");
        String phrase = scan.nextLine();
        System.out.println(alfabeto(phrase));
    }
    
    public static ArrayList<String> alfabeto(String toEncrypt) throws InterruptedException, IOException {
        String charGroup = "qwertyuiop´[]{}asdfghjklç~^|zxcvbnm,.;/><";
        String charDrafted = "";
        String a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, xx, yy, z;
        String result = "";
        int x = 0, y = 0;
        int cont1 = 0;
        Random random = new Random();
        ArrayList<String> stock = new ArrayList<String>();
        toEncrypt = toEncrypt.toLowerCase();

        loading();

        while (x < 26) {
            charDrafted = "";
            charDrafted += charGroup.charAt(random.nextInt(charGroup.length()));
            charDrafted += charGroup.charAt(random.nextInt(charGroup.length()));
            stock.add(charDrafted);
            
            while (y < x) {
                if (stock.get(x) == stock.get(y)) {
                    stock.remove(x);
                    charDrafted = "";
                    charDrafted += charGroup.charAt(random.nextInt(charGroup.length()));
                    charDrafted += charGroup.charAt(random.nextInt(charGroup.length()));
                    stock.add(charDrafted);
                }
                y += 1;
            }
            x += 1;
        }
        x = 0;
        
        a = stock.get(0);
        b = stock.get(1);
        c = stock.get(2);
        d = stock.get(3);
        e = stock.get(4);
        f = stock.get(5);
        g = stock.get(6);
        h = stock.get(7);
        i = stock.get(8);
        j = stock.get(9);
        k = stock.get(10);
        l = stock.get(11);
        m = stock.get(12);
        n = stock.get(13);
        o = stock.get(14);
        p = stock.get(15);
        q = stock.get(16);
        r = stock.get(17);
        s = stock.get(18);
        t = stock.get(19);
        u = stock.get(20);
        v = stock.get(21);
        w = stock.get(22);
        xx = stock.get(23);
        yy = stock.get(24);
        z  = stock.get(25);
        
        while(cont1 < toEncrypt.length()) {
            switch (toEncrypt.substring(cont1, cont1 + 1)) {
                case "a":
                    result += a;
                    break;
                case "b":
                    result += b;
                    break;
                case "c":
                    result += c;
                    break;
                case "d":
                    result += d;
                    break;
                case "e":
                    result += e;
                    break;
                case "f":
                    result += f;
                    break;
                case "g":
                    result += g;
                    break;
                case "h":
                    result += h;
                    break;
                case "i":
                    result += i;
                    break;
                case "j":
                    result += j;
                    break;
                case "k":
                    result += k;
                    break;
                case "l":
                    result += l;
                    break;
                case "m":
                    result += m;
                    break;
                case "n":
                    result += n;
                    break;
                case "o":
                    result += o;
                    break;
                case "p":
                    result += p;
                    break;
                case "q":
                    result += q;
                    break;
                case "r":
                    result += r;
                    break;
                case "s":
                    result += s;
                    break;
                case "t":
                    result += t;
                    break;
                case "u":
                    result += u;
                    break;
                case "v":
                    result += v;
                    break;
                case "w":
                    result += w;
                    break;
                case "x":
                    result += xx;
                    break;
                case "y":
                    result += yy;
                    break;
                case "z":
                    result += z;
                    break;
                case " ":
                    result += "-";
                    break;
            }
            cont1 += 1;
        }
        System.err.println(result);
        return stock;
    }

    public static void loading() throws InterruptedException, IOException {

        System.out.println("loading...");
        System.out.println("█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("5%");
        Thread.sleep(1400);
        System.out.println("██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("10%");
        Thread.sleep(1400);
        System.out.println("███▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("15%");
        Thread.sleep(1400);
        System.out.println("████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("20%");
        Thread.sleep(1400);
        System.out.println("█████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("25%");
        Thread.sleep(1400);
        System.out.println("██████▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("30%");
        Thread.sleep(1400);
        System.out.println("███████▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("35%");
        Thread.sleep(1400);
        System.out.println("████████▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("40%");
        Thread.sleep(1400);
        System.out.println("█████████▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("45%");
        Thread.sleep(1400);
        System.out.println("██████████▒▒▒▒▒▒▒▒▒▒");
        System.out.println("50%");
        Thread.sleep(1400);
        System.out.println("████████████▒▒▒▒▒▒▒▒");
        System.out.println("60%");
        Thread.sleep(1400);
        System.out.println("██████████████▒▒▒▒▒▒");
        System.out.println("70%");
        Thread.sleep(1400);
        System.out.println("████████████████▒▒▒▒");
        System.out.println("80%");
        Thread.sleep(1400);
        System.out.println("██████████████████▒▒");
        System.out.println("90%");
        Thread.sleep(1550);
        System.out.println("████████████████████");
        System.out.println("100%");
        System.out.println("greatfull encrypting!");
    }
}