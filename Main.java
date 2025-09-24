import java.util.Scanner;

public class Main{
    
    public static void Menu() {
        for (int i = 0; i < 20; ++i)
            System.out.println();
        System.out.println("Bem-vindo à Cachoeira do Sapo!\n");
        System.out.println("1 - Iniciar Jogo");
        System.out.println("2 - Sair");
        System.out.print("\nEscolha uma opção: ");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        switch (escolha) {
        case 1:
                Game.Start();
                scanner.close();
                break;
            case 2:
                System.out.println("Obrigado por jogar!");
                scanner.close();
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");
                Menu();
    }

}

public static void main(String[] args) {
    Menu();
}



}
