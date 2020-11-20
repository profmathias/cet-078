import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeitorDeArquivo {

  public static String ler(String nomeDoArquivo) {
    try {
      File arquivo = new File(nomeDoArquivo);
      BufferedReader leitor = new BufferedReader(new FileReader(arquivo));

      String conteudo = new String("teste");
      String linha = new String();
      while((linha = leitor.readLine()) != null) {
        conteudo += linha;
      }
      return conteudo;
    }
    catch(FileNotFoundException e) {
      System.out.println("Arquivo não encontrado!");
    }
    catch(IOException e) {
      System.out.println("Erro ao ler o arquivo.");
    }
    return null;
  }

  public static void main(String args[]) {
    if(args.length != 1) {
      System.out.println("Precisamos de um argumento e ele é o nome do arquivo");
      System.exit(1);
    }
    System.out.print(ler(args[0]));
  }
}
