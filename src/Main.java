public class Main {
    public static void main(String[] args) {

        int randomNum0 = (int)(Math.random() * 3);
        String ppt0 = null;

        if (randomNum0 == 0){
            ppt0 = "Primeiro escolhido: Pedra";
            System.out.println(ppt0);
        } else if (randomNum0 == 1) {
            ppt0 = "Primeiro escolhido: Papel";
            System.out.println(ppt0);
        } else {
            ppt0 = "Primeiro escolhido: Tesoura";
            System.out.println(ppt0);
        }

        int randomNum1 = (int)(Math.random() * 3);
        String ppt1 = null;
        if (randomNum1 == 0){
            ppt1 = "Segundo escolhido: Pedra";
            System.out.println(ppt1);
        } else if (randomNum1 == 1) {
            ppt1 = "Segundo escolhido: Papel";
            System.out.println(ppt1);
        } else {
            ppt1 = "Segundo escolhido: Tesoura";
            System.out.println(ppt1);
        }

        if (randomNum0 == 0 && randomNum1 == 1){
            System.out.println("\nPapel venceu!");
        } else if (randomNum0 == 0 && randomNum1 == 2) {
            System.out.println("\nPedra venceu!");
        } else if (randomNum0 == 1 && randomNum1 == 2) {
            System.out.println("\nTesoura venceu!");
        } else if (randomNum0 == 1 && randomNum1 == 0) {
            System.out.println("\nPapel venceu!");
        } else if (randomNum0 == 2 && randomNum1 == 0) {
            System.out.println("\nPedra venceu!");
        } else if (randomNum0 == 2 && randomNum1 == 1) {
            System.out.println("\nTesoura venceu!");
        } else {
            System.out.println("\nEmpate!");
        }
    }
}