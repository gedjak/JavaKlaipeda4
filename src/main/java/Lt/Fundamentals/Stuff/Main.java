package Lt.Fundamentals.Stuff;

public class Main {
    public static void main(String[] args) {

        int arr[][] = new int[][]{
                {1, 20, 2},
                {5, 3, 2, 100},
                {5, 3, 2, 10}
        };

        int sumLine = 0;
        int index = 0;
        int highValue = Integer.MIN_VALUE; // Integer.MIN_VALUE priskiria mažiausią įmanoma int reikšmę
        int highIndex = Integer.MIN_VALUE;
        int lowValue = Integer.MAX_VALUE; // Integer.MAX_VALUE priskiria didžiausią įmanoma int reikšmę
        int lowIndex = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sumLine += arr[i][j];           //Prie sumLine pridedama eilutės suma
                index = i;                      // nurodomas eilutės indeksas
            }
            if (sumLine >= highValue) {
                highValue = sumLine;            // į highValue perkeliama aukščiausia suma
                highIndex = index;              // newIndex pakeičiamas if salygą atitinkančiu indexu

            }
            if (sumLine <= lowValue) {
                lowValue = sumLine;
                lowIndex = index;
            }
            sumLine = 0;                        // sumLine reikšmė pakeičiama į 0 kad apskaičiuoti sekančios eilutės sumą

        }
        System.out.println("Highest: " + highValue + ", index: " + highIndex);
        System.out.println("Lowest: " + lowValue + ", index: " + lowIndex);

    }
}

