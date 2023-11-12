package aed.test;

import aed.main.IngresosAlBancoImpl;

public class test1 {
   public static void main(String[] args) {
        // Test case 1: Test with empty IngresosAlBancoImpl
        IngresosAlBancoImpl banco1 = new IngresosAlBancoImpl();
        assert banco1.cantDias() == 0 : "Test case 1 failed";

        // Test case 2: Test with one day of deposits
        IngresosAlBancoImpl banco2 = new IngresosAlBancoImpl();
        banco2.registrarNuevoDia(100);
        assert banco2.cantDias() == 1 : "Test case 2 failed";
        assert banco2.cantPersonas(0, 0) == 100 : "Test case 2 failed";

        // Test case 3: Test with multiple days of deposits
        IngresosAlBancoImpl banco3 = new IngresosAlBancoImpl();
        banco3.registrarNuevoDia(100);
        banco3.registrarNuevoDia(200);
        banco3.registrarNuevoDia(300);
        assert banco3.cantDias() == 3 : "Test case 3 failed";
        assert banco3.cantPersonas(0, 2) == 600 : "Test case 3 failed";
        assert banco3.cantPersonas(1, 2) == 500 : "Test case 3 failed";

        System.out.println("All test cases passed");
    }
}
