import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;


public class Main {
    private static final String fonte = "C:/Users/rique/Downloads/ExercicioTecnico_DellAcademy/src/TA_PRECO_MEDICAMENTO.csv";
    private static final Scanner teclado = new Scanner(System.in);
    private static final ArrayList<Medicamento> medicamentos = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {// INICIO DO PROGRAMA
        load(fonte);
        //interfaceSistema();
        //System.out.println(medicamentos.get(0));
    }

    public static void load(String fonte)throws FileNotFoundException  { // carrega o arquivo .csv

        BufferedReader br = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(fonte), "ISO-8859-1"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        String linha;
        String[] linhaLst;

        Medicamento m;

        List<String[]> r;

        try (CSVReader reader = new CSVReader(br)) {
            r = reader.readAll();
            for (String[] arrays : r){
                linhaLst = Arrays.toString(arrays).split(";");
                System.out.println("_____________________________");
                System.out.println("problema: "+linhaLst[8]);
                System.out.println("_____________________________");
                m = new Medicamento(  linhaLst[0],
                        linhaLst[1],
                        linhaLst[2],
                        linhaLst[3],
                        linhaLst[4],
                        linhaLst[5],
                        linhaLst[6],
                        linhaLst[7],
                        linhaLst[8],
                        linhaLst[9],
                        linhaLst[10],
                        linhaLst[11],
                        linhaLst[12],
                        linhaLst[13],
                        linhaLst[14],
                        linhaLst[15],
                        linhaLst[16],
                        linhaLst[17],
                        linhaLst[18],
                        linhaLst[19],
                        linhaLst[20],
                        linhaLst[21],
                        linhaLst[22],
                        linhaLst[23],
                        linhaLst[24],
                        linhaLst[25],
                        linhaLst[26],
                        linhaLst[27],
                        linhaLst[28],
                        linhaLst[29],
                        linhaLst[30],
                        linhaLst[31],
                        linhaLst[32],
                        linhaLst[33],
                        linhaLst[34],
                        linhaLst[35],
                        linhaLst[36],
                        linhaLst[37],
                        linhaLst[38],
                        linhaLst[39]);
                System.out.println(m);

                medicamentos.add(m);
                break;
            }

        }catch (NumberFormatException | IOException | CsvException e) {
            e.printStackTrace();
        }

        System.out.println(medicamentos.size() + " carregados...");// uma resposta visual para o usuario, para dizer que o load funcionou
    }

    /**
    private static void interfaceSistema() {// onde o usuario interage com o sistema
        int escolha;
        System.out.println("Seja bem-vindo ao sistema de bolsistas de Porto Alegre");
        boolean loop = true;
        Busca local = new Busca();
        while(loop) {// um loop infinito (inicialmente) que recebe o input do usuario
            System.out.println("Por favor selecione um servico: \n");
            System.out.println("1- Consultar bolsa zero/Ano");
            System.out.println("2- Conferir dados de bolsista");
            System.out.println("3- Consultar média anual");
            System.out.println("4- Ranking valores de bolsa");
            System.out.println("0- Terminar o programa\n");
            escolha = teclado.nextInt();
            switch (escolha) {
                case 1: {//[Consultar bolsa zero/Ano]
                    System.out.println("Por favor, Insira um ano:");
                    int ano =  teclado.nextInt();
                    if(!anos.contains(ano)) {
                        System.out.println("Ano inserido nao existente no arquivo, tente inserir outro ano");
                    }
                    local.buscaBolsistaZero(bolsistas,ano);
                }break;
                case 2: {//[Codificar nomes]
                    teclado.nextLine();
                    String nome;
                    System.out.println("Por favor, insira um nome: ");
                    nome = teclado.nextLine().toUpperCase();
                    local.buscaBolsista(bolsistas,nome);
                }break;
                case 3: {//[Consultar média anual]
                    System.out.println("Por favor, Insira um ano:");
                    int ano = teclado.nextInt();
                    if(!anos.contains(ano)) {
                        System.out.println("Ano inserido nao existente no arquivo, tente inserir outro ano");
                    }
                    local.buscaMediaValoresAno(bolsistas,ano);
                }break;
                case 4: {//[Ranking valores de bolsa]
                    local.buscaRank(bolsistas);
                }break;
                case 0: {//[Terminar o programa]
                    System.out.println("Obrigado");
                    loop = false;
                }break;
                default: {
                    System.out.println("Input invalido, tente novamente");
                }
            }
        }
        teclado.close();
    }*/


}