package testRun;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.collection.List;

public class CanTheyVoteTest {

    @Test
    public void printPeopleCanVoteTest() {
        CanTheyVote.printPeopleCanVote(List.of(tup(2002, "Bob"), tup(2008, "Lisa")));
    }


    @Test(dataProvider="canTheyVoteTestDP")
    public void canTheyVoteTest(List<Tuple2<Integer, String>> in, List<String> expected) {
        assertEquals(CanTheyVote.peopleCanVote(in), expected);
    }
    

    @DataProvider
    Object[][] canTheyVoteTestDP() {
        return new Object[][] {
            {List.of(), List.of()},

            {List.of(tup(2002, "Bob"), tup(2008, "Lisa")), List.of("Bob can vote", "Lisa can't vote")},
            {List.of(tup(2019, "Child")), List.of("Child can't vote")},
            {List.of(tup(2008, "Bob")), List.of("Bob can't vote")}
        };
    }


    public Tuple2<Integer, String> tup(Integer i, String s) {
        return Tuple.of(i,s);
    }

}
