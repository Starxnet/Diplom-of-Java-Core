package ru.netology.javacore;

import org.junit.jupiter.api.*;


public class TodosTests {
    Todos todos = new Todos();
    Todos todos1 = new Todos();
    Todos todos2 = new Todos();

    @BeforeAll
    public static void startedAllTests() {
        System.out.println("Testing has started");
    }

    @AfterAll
    public static void finishAllTest() {
        System.out.println("Testing completed");
    }

    public void testAddTask() {
        boolean expected = true;
        todos.addTask("Acrobat");
        boolean result = todos.getList().contains("Acrobat");

        Assertions.assertEquals(expected, result);
    }

    @BeforeEach
    public void startedEachTest() {
        System.out.println("Test started");
    }

    @AfterEach
    public void finishEachTest() {
        System.out.println("The test is over");
    }

    @Test
    public void testRemoveTask() {
        boolean expected = false;
        todos1.addTask("Begun");
        todos1.removeTask("Begun");
        boolean result = todos1.getList().contains("Begun");

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testGetAllTasks() {
        String expected = "Acrobat Barman Begun ";
        todos2.addTask("Begun");
        todos2.addTask("Acrobat");
        todos2.addTask("Barman");
        String result = todos2.getAllTasks();

        Assertions.assertEquals(expected, result);
    }
}
