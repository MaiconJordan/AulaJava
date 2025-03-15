package ordenandodados;

import java.util.concurrent.TimeUnit;

public class Teste {

    public static void main(String[] args) {
        var d =         TimeUnit.HOURS.toMillis(11) + 
        TimeUnit.MINUTES.toMillis(43) + 
        TimeUnit.SECONDS.toMillis(10);
        
        System.out.println(d);

    }
    
}
