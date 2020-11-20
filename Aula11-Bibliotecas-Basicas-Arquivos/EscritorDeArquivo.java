import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EscritorDeArquivo {

  public static void escrever(String nomeDoArquivo) {
    try {
      File arquivo = new File(nomeDoArquivo);

      BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivo));

      String dados = "Primeira Linha\nSegunda Linha\n";
      escritor.write(dados);
      escritor.close();
      System.out.println("Dados escritos no arquivo " + nomeDoArquivo);
    }
    catch(IOException e) {
      System.out.println("Erro ao ler o arquivo.");
    }
  }

  public static void main(String args[]) {
    if(args.length != 1) {
      System.out.println("Precisamos de um argumento e ele é o nome do arquivo");
      System.exit(1);
    }

    escrever(args[0]);

  }
}
