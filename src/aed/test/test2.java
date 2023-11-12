package aed.test;

import aed.main.IngresosAlBancoImpl;

public class test2 {
    public static void main(String[] args) {
        // Test case 1: Test with large number of days and deposits
        IngresosAlBancoImpl banco1 = new IngresosAlBancoImpl();
        for (int i = 1; i <= 1000; i++) {
            banco1.registrarNuevoDia(i);
        }
        assert banco1.cantDias() == 1000 : "Test case 1 failed";
        assert banco1.cantPersonas(0, 999) == 500500 : "Test case 1 failed"; // Sum of first 1000 natural numbers

        // Test case 2: Test with large deposits
        IngresosAlBancoImpl banco2 = new IngresosAlBancoImpl();
        for (int i = 1; i <= 100; i++) {
            banco2.registrarNuevoDia(i * 1000);
        }
        assert banco2.cantDias() == 100 : "Test case 2 failed";
        assert banco2.cantPersonas(0, 99) == 5050000 : "Test case 2 failed"; // Sum of first 100 natural numbers multiplied by 1000

        // Test case 3: Test with large number of days and random deposits
        IngresosAlBancoImpl banco3 = new IngresosAlBancoImpl();
        int total = 0;
        for (int i = 1; i <= 10000; i++) {
            int deposit = (int)(Math.random() * 1000);
            total += deposit;
            banco3.registrarNuevoDia(deposit);
        }
        assert banco3.cantDias() == 10000 : "Test case 3 failed";
        assert banco3.cantPersonas(0, 9999) == total : "Test case 3 failed";

        System.out.println("All test cases passed");
    }
}
