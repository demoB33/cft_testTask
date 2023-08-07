package org.example;

import org.example.exception.MissingDataTypeException;
import org.example.model.Arguments;
import org.example.sort.IntegerSort;
import org.example.sort.StringSort;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Arguments arguments = ArgumentSettings.CheckArgs(args);

            if (arguments.getDataType().equals("-i")) {
                IntegerSort integerSort = new IntegerSort();
                integerSort.mergeSort(arguments.getSortType(), arguments.getInputFileNames(), arguments.getOutputFileName());
            } else if (arguments.getDataType().equals("-s")) {
                StringSort stringSort = new StringSort();
                stringSort.mergeSort(arguments.getSortType(), arguments.getInputFileNames(), arguments.getOutputFileName());
            }else throw new MissingDataTypeException("Введите тип сортируемых данных [-s] или [-i]");
        } catch (MissingDataTypeException | IOException e) {
            System.err.println(e.getMessage());
        }
    }
}