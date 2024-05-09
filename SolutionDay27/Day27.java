package SolutionDay27;

import java.util.*;

public class Day27 {
    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }

    static class TestDataEmptyArray {
        //create an empty array
        public static int[] get_array() {
            int [] a = new int [0];
            return a;
        }
    }

    static class TestDataUniqueValues {
        public static int[] get_array() {
            int [] array = arrayWithNum();
            //check if elements are unique
            for (int i = 0; i < array.length; i++){
                for (int j = i+1 ; j < array.length; j++){
                    if (array[i] == array[j]){get_array();}
                }
            }
            return array;
        }

        //create an array with random numbers    
        public static int [] arrayWithNum(){
            int [] array = new int [3];
            for (int i = 0; i < array.length; i++){
                array[i] = random();

            }
            //sort array for proper answer
            Arrays.sort(array);
            return array;
        }

        //random numbers
        public static int random (){
            int random = (int)(Math.random()*100)+1;
            return random;
        }

        public static int get_expected_result() {
            int [] array = get_array();
            int minValue = minNumber(array);
            return minValue;
        }

        public static int minNumber (int [] array){
            //to get an minimum index  of the erray
            int min_idx = 0;
            for (int i = 1; i < array.length; ++i) {
                if (array[i] < array[min_idx]) {
                    min_idx = i;
                }
            }
            return min_idx;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums{
        //pass int value from Class TestDataUniqueValues, method: get_expected_result()
        private TestDataUniqueValues testDataUniqueValues;
        public TestDataExactlyTwoDifferentMinimums (TestDataUniqueValues testDataUniqueValues){
            this.testDataUniqueValues = testDataUniqueValues;
        }

        public static int[] get_array() {
            int [] array = arrayWithNum();

            //check if elements are the same
            for (int i = 0; i < array.length; i++){
                for (int j = i+1 ; j < array.length; j++){
                    if (!(array[i] == array[j])){get_array();}
                }
            }
            return array;
        }

        //create an array with min numbers    
        public static int [] arrayWithNum(){
            int [] array = new int [] {1, 1};
            return array;
        }

        //random numbers
        public static int random (){
            int num = TestDataUniqueValues.get_expected_result();
            return num;
        }

        public static int get_expected_result() {
            int [] array = get_array();
            int minValue = minNumber(array);
            return minValue;
        }

        public static int minNumber (int [] array){
            //this code will find the min index of the object
            int min_idx = 0;
            for (int i = 1; i < array.length; ++i) {
                if (array[i] < array[min_idx]) {
                    min_idx = i;
                }
            }
            return min_idx;
        }
    }

    public static void TestWithEmptyArray() {
        try {
            int[] seq = TestDataEmptyArray.get_array();
            int result = minimum_index(seq);
        } catch (IllegalArgumentException e) {
            return;
        }
        throw new AssertionError("Exception wasn't thrown as expected");
    }

    public static void TestWithUniqueValues() {
        int[] seq = TestDataUniqueValues.get_array();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        Integer[] tmp = new Integer[seq.length];
        for (int i = 0; i < seq.length; ++i) {
            tmp[i] = Integer.valueOf(seq[i]);
        }
        if (!((new LinkedHashSet<Integer>(Arrays.asList(tmp))).size() == seq.length)) {
            throw new AssertionError("not all values are unique");
        }

        int expected_result = TestDataUniqueValues.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void TestWithExactlyTwoDifferentMinimums() {
        int[] seq = TestDataExactlyTwoDifferentMinimums.get_array();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        int[] tmp = seq.clone();
        Arrays.sort(tmp);
        if (!(tmp[0] == tmp[1] && (tmp.length == 2 || tmp[1] < tmp[2]))) {
            throw new AssertionError("there are not exactly two minimums in the array");
        }

        int expected_result = TestDataExactlyTwoDifferentMinimums.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void main(String[] args) {
        TestWithEmptyArray();
        TestWithUniqueValues();
        TestWithExactlyTwoDifferentMinimums();
        System.out.println("OK");
    }
}