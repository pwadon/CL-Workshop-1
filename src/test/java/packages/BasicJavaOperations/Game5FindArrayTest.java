package packages.BasicJavaOperations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Game5FindArrayTest {

    @Test
    void given2Tabs_ResultLastOccurrenceStartingIndex() {
        //given
        int [] mainTab = {1,2,4,5,6,1,2,3,4,22,44,55,2,3,1,2,3,53,56};
        int [] tabToSearch = {1,2,3};


        //when

        Game5FindArray game5FindArray = new Game5FindArray();
        int result = game5FindArray.findArray2(mainTab,tabToSearch);

        // then

        assertEquals(14,result);
    }
    @Test
    void secondGivenArrayDoesNotOccursIn1stOne_ResultMinus1(){
        //given
        int [] mainTab = {1,2,4,5,6,1,2,3,4,22,44,55,2,3,1,2,3,53,56};
        int [] tabToSearch = {1,22,3};


        //when

        Game5FindArray game5FindArray = new Game5FindArray();
        int result = game5FindArray.findArray2(mainTab,tabToSearch);

        // then

        assertEquals(-1,result);
    }
    @Test
    void secondGivenArrayBiggerThan1stArray_thenResultIsMinus1(){
        //given
        int [] mainTab = {1,2,};
        int [] tabToSearch = {1,2,3,4,5,6,1,2,3,4,22,44,55,2,3,1,2,3,53,56};


        //when

        Game5FindArray game5FindArray = new Game5FindArray();
        int result = game5FindArray.findArray2(mainTab,tabToSearch);

        // then

        assertEquals(-1,result);
    }
    @Test
    void givenEmptyTab_ThrowsArrayIndexOutOfBoundsException(){
        //given
        int [] mainTab = {1,2,4,5,6,1,2,3,4,22,44,55,2,3,1,2,3,53,56};
        int [] tabToSearch = {};
        Game5FindArray game5FindArray = new Game5FindArray();
        Throwable exception = assertThrows(ArrayIndexOutOfBoundsException.class, () ->game5FindArray.findArray2(mainTab,tabToSearch));

        assertEquals("given array is empty",exception.getMessage());

    }
}