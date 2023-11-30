package tasks12.Task2;

import java.util.ArrayList;
import java.util.List;

public class NumberProcessorTest {
    public static void main(String[] args){
        NumberProcessor np1 = new NumberProcessor((n)-> {
            if (n % 3 == 0 && n % 5 !=0){
                System.out.println("fizz");
            }
        });
        NumberProcessor np2 = new NumberProcessor((n)-> {
            if (n % 3 != 0 && n % 5 ==0){
                System.out.println("buzz");
            }
        });
        NumberProcessor np3 = new NumberProcessor((n)-> {
            if (n % 3 == 0 && n % 5 == 0){
                System.out.println("fizzbuzz");
            }
        });
        NumberProcessor np4 = new NumberProcessor((n)-> {
            if (n % 3 != 0 && n % 5 != 0){
                System.out.println(n);
            }
        });

        List<NumberProcessor> nps = new ArrayList<>();
        nps.add(np1);
        nps.add(np2);
        nps.add(np3);
        nps.add(np4);

        for(NumberProcessor np : nps){
            np.start();
        }
        for(int i = 1; i <= 15 ; i++){
            for(NumberProcessor np : nps){
                np.process(i);
            }
            while (true){
                int processedNumbersCount = 0;
                for (NumberProcessor np : nps){
                    if (np.isNumberProcessed()){
                        processedNumbersCount++;
                    }
                }

                if (processedNumbersCount == 4){
                    break;
                }
            }
        }
    }
}
