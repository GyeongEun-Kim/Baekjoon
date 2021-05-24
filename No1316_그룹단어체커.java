package NEW;

import java.io.*;

public class No1316_그룹단어체커 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        boolean group [] = new boolean[26]; //알파벳 길이 배열
        int cnt=0;

        for (int i=0;i<num;i++) {
            int isGroup= 1;

            String word = br.readLine();
            for (int j=0;j<word.length();j++) {
                if (group[word.charAt(j)]==false)
                    group[word.charAt(j)]=true;
                else {
                    if (word.charAt(j)!=word.charAt(j-1)) {
                        isGroup=0;
                        break;
                    }
                }
                if (isGroup==1)
                    cnt++;
            }
        }

        System.out.println(cnt);
    }
}
