import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;


public class Main {
    private static final String fonte = "C:/Users/rique/Downloads/ExercicioTecnico_DellAcademy/src/TA_PRECO_MEDICAMENTO.csv";
    //private static final Scanner input = new Scanner(System.in);
    private static final ArrayList<Medicamento> medicamentos = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {//Execucao
        readStore(fonte);
    }

    public static void readStore(String fonte)throws FileNotFoundException  { //Le o arquivo csv e guarda as colunas no objeto Medicamento

        BufferedReader br = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(fonte), "ISO-8859-1"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        String[] linha;

        Medicamento m;

        List<String[]> r;

        try (CSVReader reader = new CSVReader(br)) {
            r = reader.readAll();
            for (String[] arrays : r){
                linha = Arrays.toString(arrays).split(";");
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
                
            }

        }catch (NumberFormatException | IOException | CsvException e) {
            e.printStackTrace();
        }

        System.out.println(medicamentos.size()-1 + " medicamentos carregados");
    }
    
}