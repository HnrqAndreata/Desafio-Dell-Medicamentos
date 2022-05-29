import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

public class Main {
    private static final String fonte = "src/main/resources/TA_PRECO_MEDICAMENTO.csv";
    //private static final Scanner input = new Scanner(System.in);
    private static final ArrayList<Medicamento> medicamentos = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {//Execucao
        load(fonte);
        //readStore(fonte);
        Funcionalidades app = new Funcionalidades();
        //app.consultarPeloNome(medicamentos, "HYZAAR");
        //app.buscarCodigoDeBarras(medicamentos,"7897337706506");
        app.comparativoConcessao(medicamentos);
    }

    /**
    public static void readStore(String fonte)throws FileNotFoundException  { //Le o arquivo csv e guarda as colunas no objeto Medicamento
        String[] linha;

        Medicamento m;

        List<String[]> r;

        try (CSVReader reader = new CSVReader(new FileReader(fonte))) {
            r = reader.readAll();
            for (String a:r.get(1)) {
                System.out.println(a);

            }
            for (String[] arrays : r){
                //linha = Arrays.toString(arrays).split(";");
                linha = Arrays.toString(arrays).split(";(?=([^\"]*\"[^\"]*\")*[^\"])");

                m = new Medicamento(  linha[0],
                        linha[1],
                        linha[2],
                        linha[3],
                        linha[4],
                        linha[5],
                        linha[6],
                        linha[7],
                        linha[8],
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
                if (medicamentos.size() == 4000){
                    return;
                }
                
            }

        }catch (NumberFormatException | IOException | CsvException e) {
            e.printStackTrace();
        }

        System.out.println(medicamentos.size()-1 + " medicamentos carregados");
    }
     */

    /**
    public static void load(String fonte)throws FileNotFoundException  { // carrega o arquivo .csv
        //BufferedReader br = new BufferedReader(new FileReader(fonte));
        BufferedReader br = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:/Users/rique/Downloads/ExercicioTecnico_DellAcademy/src/TA_PRECO_MEDICAMENTO.csv"), "ISO-8859-1"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        String linha;
        String[] linhaLst;

        Medicamento m;

        try {
            br.readLine();
            while ((linha = br.readLine()) != null) {
                //linhaLst = linha.split(";");
                linhaLst = linha.split(";(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
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
               // System.out.println(m);

                medicamentos.add(m);
                if (medicamentos.size() > 4000){
                    return;
                }
            }
            br.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }

        System.out.println(medicamentos.size() + " carregados...");// uma resposta visual para o usuario, para dizer que o load funcionou
    }
     */

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

        CSVParser parser = new CSVParserBuilder().withSeparator(';').withQuoteChar('"').build();


        try (CSVReader reader = new CSVReaderBuilder(br)
                .withSkipLines(1)
                .withCSVParser(parser)
                .build();) {
            r = reader.readAll();
            for (String[] arrays : r){
                //System.out.println(Arrays.toString(arrays));
                linhaLst = arrays;
               // System.out.println("_____________________________");
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

                medicamentos.add(m);
                //break;
            }

        }catch (NumberFormatException | IOException | CsvException e) {
            e.printStackTrace();
        }

    }

}