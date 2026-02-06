public class MãoNaMassa3 {
    public static void main(String[] args) {

        String[] ListaNomes = {"Gabriel", "Gustavo", "Ildenir", "Helio", "Marilza", "Marilda", "Vinicius",
                "Matheus", "Adriano", "Marilia"};

        String Verificar = "Marilia";

        boolean achou = true;

        for (int i = 0; i < ListaNomes.length; i++) {
            if (ListaNomes[i].equals(Verificar)) {
                System.out.println("Aluno: " + Verificar + " rencontrado na posição: " + i);
                achou = true;
                break;
            }
        }

        if (!achou) {
            System.out.println("Aluno" + Verificar + "não está na lista");
        }
    }
}
