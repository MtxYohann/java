import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /*public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }*/
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.System.out.printf("Hello and welcome!");
        Scanner myObj = new Scanner(System.in);
       /* System.out.println("Exercice 1");

        System.out.println("Saisir un nombre :");

        int nombre = myObj.nextInt();

        if(nombre % 2 == 0 ){
           System.out.println("Votre nombre est pair !");
        }else{
            System.out.println("Votre nombre est impair :");
        }
        System.out.println("Exercice 2");

        System.out.println("Saisir un nombre :");
        int N = myObj.nextInt();
        int somme = 0;

        for (int i = 1; i <= N; i++) {
            somme += i;
        }
        System.out.println("La somme des " + N + " premiers nombres est : " + somme);

        System.out.println("Exercice 3");

        System.out.println("Saisir un nombre :");
        int exo3 = myObj.nextInt();
        int plusGrand = 0;
        while( exo3 != 0 ) {
           exo3  = myObj.nextInt();

            if( exo3 > plusGrand){
                plusGrand = exo3;
            }
        System.out.println("Le nombre le plus grand est :" + plusGrand);
        }
        if(exo3 == 0) {
            System.out.println("Vous avez saisie 0");
        }
        System.out.println("Exercice 4");
        System.out.println("Saisir un nombre entre 1 et 7 :");
        int day = myObj.nextInt();
        switch (day){
            case 1 -> System.out.println("Lundi");
            case 2 -> System.out.println("Mardi");
            case 3 -> System.out.println("Mercredi");
            case 4 -> System.out.println("Jeudi");
            case 5 -> System.out.println("Vendredi");
            case 6 -> System.out.println("Samedi");
            case 7 -> System.out.println("Dimanche");
            default -> System.out.println("nombre invalide");
        }*/

        int[] nums = {3,2,4};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println("[" + result[0] + "," + result[1] + "]");

    }
}