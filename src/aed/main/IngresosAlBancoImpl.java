package aed.main;
import java.util.Vector;

public class IngresosAlBancoImpl {
    private Vector<Vector<Integer>> totales;

    // Constructor has a time complexity of O(1)
    public IngresosAlBancoImpl() {
        this.totales = new Vector<Vector<Integer>>();
    }

    // registrarNuevoDia has a time complexity of O(n), where n is the number of days.
    // This is because it contains a loop that runs once for each day.
    public void registrarNuevoDia(int cant) {
        Vector<Integer> nuevoVector = new Vector<Integer>();
        int nuevoDia = this.totales.size();
        int diaAnterior = this.totales.size() - 1;
        int j = 0;
        while (j <= nuevoDia) {
            int total;
            if (j < nuevoDia) {
                total = this.totales.get(diaAnterior).get(j) + cant;
                nuevoVector.add(total);
            } else {
                nuevoVector.add(cant);
            }
            j++;
        }
        this.totales.add(nuevoVector);
    }

    // cantDias has a time complexity of O(1) because it simply returns the size of the vector.
    public int cantDias() {
        return this.totales.size();
    }

    // cantPersonas has a time complexity of O(1) because it simply returns an element from the vector.
    public int cantPersonas(int desde, int hasta) {
        return this.totales.get(hasta).get(desde);
    }
}

