package types.computers;

import io.vavr.collection.List;

public class Acountant {

    public static void main(String[] args) {

        
        List<String> wordes = List.of(
                "english",
                "abc"
                );

        
        /**
         * I want output like this:
         * abc = 6
         * def = 15
         * 
         * @return
         */
//        public static void accountant() {
            wordes.forEach(word -> System.out.format("%s %sbodsafasfas safsadf f saa %n",word, word));
            

//    }


    }
    
    
}
