package it.openly.excercises.basic01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuiltinSortAlgorithmImpl implements SortAlgorithm {

    public List<String> sort(List<String> inputStrings) {
        List<String> outputStrings = new ArrayList<>(inputStrings);
        Collections.sort(outputStrings);
        return outputStrings;
    }
}
