import java.util.Scanner;

class Game {

    static int respostasPositivas = 0;

    static String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"
    };

    static Classificacao classificacao;

    public static void Start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Digite seu nome: ");
            String name = scanner.nextLine();
            System.out.print("Você é suspeito de um crime. Responda as perguntas com S ou N.\n");
            for (int i = 0; i < 5; i++) {
                System.out.print("\n" + perguntas[i] + " (S/N): ");
                char resposta = scanner.next().toUpperCase().charAt(0);
                resposta = ValidarResposta(resposta, scanner);
                VerificarResposta(resposta);

            }

            classificacao = Classificacao.Classificar(respostasPositivas);
            System.out.println("\nO veredito foi dado para você, " + name + "!");
            System.out.println("\nVocê é " + classificacao + ", " + name + "!");

            System.out.print("\nDeseja jogar novamente? (S/N): ");
            char jogarNovamente = scanner.next().toUpperCase().charAt(0);
            jogarNovamente = ValidarResposta(jogarNovamente, scanner);
            if (jogarNovamente == 'N') {
                System.out.println("Obrigado por jogar!\n");
                break;
            } else {
                respostasPositivas = 0;
                Start();
            }
            scanner.close();

        }

    }

    public static char ValidarResposta(char resposta, Scanner scanner) {
        while (resposta != 'S' && resposta != 'N') {
            System.out.print("\nEntrada inválida. Digite 'S' para sim ou 'N' para não: ");
            resposta = scanner.next().toUpperCase().charAt(0);
        }
        return resposta;
    }

    public static void VerificarResposta(char resposta) {
        if (resposta == 'S') {
            respostasPositivas++;
        }
    }

}