public class Main {


    public static void main(String[] args) {
        int[] tab1 = {1, 3, 4, 5, 6};
        int[] tab2 = {2, 3, 1, 5};

        System.out.println("Nombre manquant = " + nbManquant(tab1));
        System.out.println("Nombre manquant = " + nbManquant(tab2));
    }


    public static void triABulle(int[] tab) {


        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1 - i; j++) {
                if (tab[j] > tab[j + 1]) {

                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
    }

    public static int nbManquant(int[] tab) {
        triABulle(tab);

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != i + 1) {
                return i + 1;
            }
        }
        return null;
    }
}
















