import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class M2 {
    //随机点名器，每个人每次循环只能被点到一次
    static ArrayList<String> list=new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("t.txt"));
        Scanner sc=new Scanner(System.in);
        String s;
        while((s=br.readLine())!=null){
            list.add(s);
        }
        br.close();
        while(true) {
            Collections.shuffle(list);
            for (int i = 0; i < list.size(); i++) {
                sc.nextLine();
                System.out.println(list.get(i).split("-")[0]);
            }
            System.out.println("开始下一轮循环");
        }
    }
}
