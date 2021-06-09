import java.util.List;
import java.util.Random;

public class Main {


    private static String[] ppl = new String[]{
            "Боярова",
            "Быченков",
            "Василенко",
            "Вязовик",
            "Газизов",
            "Галанова",
            "Дерябина",
            "Динь",
            "Зяблицев",
            "Кириенко",
            "Климович",
            "Красов",
            "Криницин",
            "Кульбаев",
            "Кусмарцев",
            "Лосева",
            "Малютин",
            "Моисеев",
            "Нагуманова",
            "Новосельцева",
            "Романов",
            "Сергеев",
            "Синицина",
            "Якубов"
    };

    public static void main(String[] args){

        int N = 100;
        if(args.length>0){
            N = Integer.parseInt(args[0]);
        }
        int ra =0;
        int rb =0;
        Random random = new Random();

        for (int i =0;i<N;i++){
            ra = random.nextInt(ppl.length);
            rb = random.nextInt(ppl.length-1);
            if(rb>=ra) rb++;
            swap(ra,rb);

        }
        int counter =1;
        for (String str: ppl){
            System.out.println(counter+"\t"+str);
            counter++;
        }

    }

    static void swap(int a, int b){
        String buf = ppl[a];
        ppl[a]=ppl[b];
        ppl[b]=buf;
    }

}
