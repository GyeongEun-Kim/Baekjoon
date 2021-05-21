import java.io.*;

public class No2941_크로아티아알파벳 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int cnt=0;
        int i=0;

        while (i<word.length()) {
            if (word.charAt(i)=='c') {
                if (i+1<word.length() && word.charAt(i+1)=='=') {
                    cnt++;
                    i+=2;
                    //System.out.println("c=");
                }
                else if (i+1<word.length() && word.charAt(i+1)=='-') {
                    cnt++;
                    i+=2;
                    //System.out.println("c-");
                }
                else {
                    cnt++;
                    i++;
                  //  System.out.println("c");
                }
            }

            else if (word.charAt(i)=='d') {
                if (i+1<word.length() && word.charAt(i+1)=='-') {
                    cnt++;
                    i+=2;
                   // System.out.println("d-");
                }
                else if(i+1<word.length() && word.charAt(i+1)=='z') {
                    if (i+2<word.length() && word.charAt(i+2)=='=') {
                        cnt++;
                        i += 3;
                      //  System.out.println("dz=");
                    }
                    else {
                        cnt+=2;
                        i+=2;
                      //  System.out.println("d");
                       // System.out.println("z");
                    }
                }
                else {
                    cnt++;
                    i++;
                  //  System.out.println("d");
                }
            }

            else if (word.charAt(i)=='l' && i+1<word.length() && word.charAt(i+1)=='j') {
                cnt++;
                i+=2;
             //   System.out.println("lj");

            }

            else if (word.charAt(i)=='n' && i+1<word.length() &&  word.charAt(i+1)=='j') {
                cnt++;
                i+=2;
              //  System.out.println("nj");

            }

            else if (word.charAt(i)=='s' && i+1<word.length() && word.charAt(i+1)=='=') {
                cnt++;
                i+=2;
            //    System.out.println("s=");

            }

            else if (word.charAt(i)=='z' && i+1<word.length() && word.charAt(i+1)=='=') {
                cnt++;
                i+=2;
               // System.out.println("z=");
            }
            else {
               // System.out.println(word.charAt(i));
                cnt++;
                i++;

            }
       // System.out.println(i);
        }

        System.out.println(cnt);
    }
}
