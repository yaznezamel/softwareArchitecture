package solid.SRP.after;

import java.util.Scanner;

public class SumApplication {

    private final NumberReader reader;
    private final Adder adder;
    private final ResultPresenter resultPresenter;



    private SumApplication(NumberReader reader , Adder adder , ResultPresenter resultPresenter){
        this.reader = reader;
        this.adder = adder;
        this.resultPresenter = resultPresenter;
    }


    public void run(){
        int[] numbers = reader.readTwoNumbers();
        int result = adder.add(numbers[0], numbers[1]);
        resultPresenter.showResult(result);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberReader  reader = new NumberReader(scanner);
        Adder adder = new Adder();
        ResultPresenter presenter = new ResultPresenter(); 


        SumApplication app = new SumApplication(reader, adder, presenter);
    
        app.run();
    }


}
