package Trabalho;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {
    private FileWriter arqw;
    private BufferedWriter escritor;
    private FileReader arqr;
    private BufferedReader leitor;
    private List<Produtos> listProdutos;
    private String nomeArquivo;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        listProdutos = new ArrayList<>();
    }

    public void gravarArquivo(Produtos p) {
        // ESCREVENDO NO ARQUIVO
        try {
            arqw = new FileWriter(nomeArquivo + ".txt", true);
            escritor = new BufferedWriter(arqw);
            escritor.write(p.getCodigo() + "," + p.getDescricao() + "," + p.getEstoque() + "," + p.getPcusto() + "," + p.getPvenda());
            escritor.newLine();
            escritor.close();
            arqw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Produtos> leArquivo() {
        // LENDO NO ARQUIVO
        listProdutos.clear(); // Limpar a lista antes de ler novamente
        try {
            arqr = new FileReader(nomeArquivo + ".txt");
            leitor = new BufferedReader(arqr);
            String linha;

            while ((linha = leitor.readLine()) != null) {
                String campos[] = linha.split(",");

                String codigo = campos[0];
                String descricao = campos[1];
                int estoque = Integer.parseInt(campos[2]);
                float pcusto = Float.parseFloat(campos[3].replace(",", ".")); // Tratar o ponto decimal
                float pvenda = Float.parseFloat(campos[4].replace(",", ".")); // Tratar o ponto decimal

                Produtos produto = new Produtos(codigo, descricao, pcusto, pvenda, estoque);
                listProdutos.add(produto);
            }

            leitor.close();
            arqr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listProdutos;
    }

    public void regravarArquivo(List<Produtos> produtos) {
        try {
            arqw = new FileWriter(nomeArquivo + ".txt", false);
            escritor = new BufferedWriter(arqw);
            for (Produtos p : produtos) {
                escritor.write(p.getCodigo() + "," + p.getDescricao() + "," + p.getEstoque() + "," + p.getPcusto() + "," + p.getPvenda());
                escritor.newLine();
            }
            escritor.close();
            arqw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
