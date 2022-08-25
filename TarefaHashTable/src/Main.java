import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        Hashtable<String, Integer> listatelefonica = new Hashtable<String, Integer>();
        String opcao = "-";
        String nome;
        Integer telefone;

            do{
                System.out.println("Opcao 1: Adicionar novo contato");
                System.out.println("Opcao 2: Buscar contato");
                System.out.println("Opcao 0: Encerrar");
                try {

                    opcao = sc1.next();

                    switch (opcao) {
                        case "1":
                            System.out.println("Digite o nome da pessoa");
                            nome = sc1.next();
                            System.out.println("Digite o telefone da pessoa");
                            telefone = sc1.nextInt();
                            listatelefonica.put(nome, telefone);
                            System.out.println("Contato Adicionado");
                            break;
                        case "2":
                            System.out.println("Digite o nome da pessoa que deseja procurar");
                            nome = sc1.next();
                            System.out.println("Telefone de: " + nome);
                            if(listatelefonica.get(nome) == null){
                                System.out.println("Telefone nao encontrado!");
                                break;
                            }else{
                                System.out.println(listatelefonica.get(nome));
                            }
                            break;
                        case "0":
                            System.out.println("Programa encerrado");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Valor digitado incorreto");
                            break;
                    }
                }catch(Exception ex){
                    System.out.println("Valor digitado invalido");
                    opcao = sc1.next();
                }

            }while(!opcao.equals("0"));
    }
}