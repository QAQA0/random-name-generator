import qaqa.Namer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Namer namer = new Namer();
        int count = 0;

        List<String> names = namer.generateNames(10000);
        for(String name : names) {
            if(name.equals("김")) {
                count++;
            }
        }
        System.out.println(names);
        System.out.println(count);
    }
}