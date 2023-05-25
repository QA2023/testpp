package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import javax.xml.transform.Result;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    @BeforeAll
    public static void setUp() {
        System.out.println("before all");
    }

    @BeforeEach
    public void setUpEach() {
        System.out.println("before each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("after all");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("after all");
    }

    @Test
    @DisplayName("Проверка суммирования1")
    @Timeout(10)
    @Tag("summ")
    void summ1() {
        Calc calc = new Calc();
        int result = calc.summ(1, 6);
        Assertions.assertEquals(7, result, "Ошибка при вычислении");

    }

    @RepeatedTest(10)
    @DisplayName("Проверка суммирования2")
    @Timeout(10)
    void summ2() {
        Calc calc = new Calc();
        int result = calc.summ(1, 6);
        Assertions.assertEquals(7, result, "Ошибка при вычислении");

    }

    @ParameterizedTest(name = "# {index} - сложение {0}  и {1}), ожидаем {2}")
    @CsvSource({"1,2,3", "-1,2,1", "0,0,0"})
    void summ3(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, result, "Ошибка при вычислении");
    }
}

