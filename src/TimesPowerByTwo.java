public class TimesPowerByTwo {

    /*
        Schreiben Sie eine Methode, die folgende int-Werte übergeben bekommt:
        i: einen Startwert
        threshold: einen Schwellenwert
        Die Methode soll die Anzahl zurückgeben, wie oft i quadriert werden kann, bevor das Quadrat den Schwellenwert
        überschreitet.
    */
    public static int intTimesPowerBy2BelowThreshold(int i, int threshold) {
        int times = 0;
        int curr = i;

        while(curr <= threshold) {
            // hoch 2 entspricht Multiplikation mit sich selbst.
            curr *= curr;
            // In jedem hoch 2 Durchgang wird der Zähler um 1 inkrementiert.
            times++;
        }

        return times;
    }

    public static void main(String[] args) {
        int i = 5;
        int thresshold = 625;

        int times = intTimesPowerBy2BelowThreshold(i, thresshold);

        if(times == 3) {
            System.out.print("Correct!");
        } else {
            System.out.println("You performed the times 2 operation " + times + " times, but 3 would be correct.");
        }
    }
}
