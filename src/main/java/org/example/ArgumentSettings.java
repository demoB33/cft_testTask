package org.example;

import org.example.exception.InvalidArgumentException;
import org.example.exception.MissingDataTypeException;
import org.example.model.Arguments;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ArgumentSettings {
    public static Arguments CheckArgs(String[] args) {
        Arguments arguments = new Arguments();
        int argIdx = 0;
        if (args.length < 3) {
            throw new IllegalArgumentException("Введите минимум 3 аргумента:\n" +
                    "1.Tип сортировки(по желанию)[-a] или [-d]\n" +
                    "Обязательно:\n" +
                    "2.Tип данных [-s] или [-i]\n" +
                    "3.Выходной файл [out.txt]\n" +
                    "4.Входные файлы [in.txt]");
        } else {

            if (Objects.equals(args[argIdx], "-d") || Objects.equals(args[argIdx], "-a")) {
                arguments.setSortType(args[argIdx]);
                argIdx++;
            }
            if (Objects.equals(args[argIdx], "-i") || Objects.equals(args[argIdx], "-s")) {
                arguments.setDataType(args[argIdx]);
                argIdx++;
            } else {
                throw new MissingDataTypeException("Проверьте " + argIdx + "-й аргумент (" + args[argIdx] + ") и введите тип сортируемых данных [-s] или [-i]");
            }
            arguments.setOutputFileName(args[argIdx]);
            argIdx++;
            arguments.setInputFileNames(new ArrayList<>(Arrays.asList(args).subList(argIdx, args.length)));
        }
        return arguments;
    }
}
