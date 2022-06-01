import java.io.*;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

public class Main {
    private static final String path = "src/main/resources/TA_PRECO_MEDICAMENTO.csv";
    private static final Scanner input = new Scanner(System.in,"ISO-8859-1");
    private static final ArrayList<Medicamento> medicamentos = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {//Execucao
        readStore(path);
        sistema();
    }
    
    public static void readStore(String path)throws FileNotFoundException  { //Le o csv e guarda as colunas como objeto Medicamento

        BufferedReader br = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(path), "ISO-8859-1"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        String[] linha;

        Medicamento m;

        List<String[]> r;

        CSVParser parser = new CSVParserBuilder().withSeparator(';').withQuoteChar('"').build();

        try (CSVReader reader = new CSVReaderBuilder(br)
                .withSkipLines(1)
                .withCSVParser(parser)
                .build();) {
            r = reader.readAll();
            for (String[] arrays : r){
                linha = arrays;
                String produtoSemAcento = (Normalizer.normalize(linha[8], Normalizer.Form.NFD)).replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
                m = new Medicamento(  linha[0],
                        linha[1],
                        linha[2],
                        linha[3],
                        linha[4],
                        linha[5],
                        linha[6],
                        linha[7],
                        produtoSemAcento,
                        linha[9],
                        linha[10],
                        linha[11],
                        linha[12],
                        linha[13],
                        linha[14],
                        linha[15],
                        linha[16],
                        linha[17],
                        linha[18],
                        linha[19],
                        linha[20],
                        linha[21],
                        linha[22],
                        linha[23],
                        linha[24],
                        linha[25],
                        linha[26],
                        linha[27],
                        linha[28],
                        linha[29],
                        linha[30],
                        linha[31],
                        linha[32],
                        linha[33],
                        linha[34],
                        linha[35],
                        linha[36],
                        linha[37],
                        linha[38],
                        linha[39]);

                medicamentos.add(m);
            }

        }catch (NumberFormatException | IOException | CsvException e) {
            e.printStackTrace();
        }

    }

    private static void sistema() { //Parte visual do sistema, acesso direto do usuário
        String escolha;
        boolean rodando = true;
        Funcionalidades app = new Funcionalidades();
        System.out.println("Sistema de dados de medicamentos do Brasil");
        while(rodando) {//Mantemos o programa rodando enquanto foi desejado
            System.out.println("\nSelecione uma funcionalidade: \n");
            System.out.println("[1] Consultar medicamento pelo nome do produto");
            System.out.println("[2] Buscar produtos pelo código de barras");
            System.out.println("[3] Comparativo de lista de concessão");
            System.out.println("[0] Encerrar serviço\n");
            System.out.print("Sua entrada: ");
            escolha = input.next();
            switch (escolha) {
                case "1": {//Consultar pelo nome do produto
                    input.nextLine();
                    String nome;
                    System.out.print("\nInsira o nome do medicamento: ");
                    nome =  input.nextLine();
                    System.out.println(nome);
                    app.consultarPeloNome(medicamentos, nome);

                }break;
                case "2": {//Buscar informações do produto pelo código de barras
                    input.nextLine();
                    String cod;
                    System.out.print("\nDigite o código de barras: ");
                    cod = input.nextLine();
                    app.buscarCodigoDeBarras(medicamentos,cod);
                }break;
                case "3": {//Tabela de análise da lista de concessão
                    app.comparativoConcessao(medicamentos);
                }break;
                case "0": {//[Terminar o programa]
                    System.out.println("Serviço encerrado.");
                    rodando = false;
                }break;
                default: {
                    System.out.println("Entrada inválida, tente novamente");
                }
            }
        }
        input.close();
    }

}