package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> list = Arrays.asList(5,23,6,0,12,123,6,5,1,99,3,4,1,2);
        System.out.println("Сумма всех чисел: " + list.stream().mapToDouble(a -> a).sum());
        System.out.printf("Среднеарифметическое значение: %.2f\n", list.stream().mapToDouble(a -> a).sum()/ list.size());
        Map<Integer, Long> frequency = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        frequency.forEach((k, v) -> System.out.println("Количество повторений элементов " + k + " = " + v));
    }
}
