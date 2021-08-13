/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.o.o;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author 20171INF_I0238
 */
public class Texto {
    public int Forca = 0, Velocidade = 0, Energia = 0, Visao = 0, Resistencia = 0, Altura = 0;
    String Nome = "", Habilidade = "";
    private final String nomeArquivo = "Z:\\Dados.txt";
    private File arquivo = null;
    private FileWriter arquivoEscrita = null;
    private FileReader arquivoLeitura = null;
    public BufferedReader Leitor = null;
    
    public void Texto(){ 
    }
    
    public void Criar(){
        arquivo = new File(nomeArquivo);
            try {
                arquivo.createNewFile();
            } catch (IOException ex) {
                System.out.println("ERRO!!!");
            }
    }
    
    public int Continuar(int Continuar){
        arquivo = new File(nomeArquivo);
            if (arquivo.exists()){
                Continuar = 1;
        }
        return Continuar;
    }
    
    public void Salvar(int Forca, int Velocidade, int Energia, int Visao, int Resistencia, int Altura, String Nome, String Habilidade){
    try {
            arquivoEscrita = new FileWriter(arquivo,false);
            arquivoEscrita = new FileWriter(arquivo,true);
            arquivoEscrita.append(Nome + '\n');
            arquivoEscrita.append(Habilidade + '\n');
            arquivoEscrita.append(String.valueOf(Forca) + '\n');
            arquivoEscrita.append(String.valueOf(Velocidade) + '\n');
            arquivoEscrita.append(String.valueOf(Energia) + '\n');
            arquivoEscrita.append(String.valueOf(Visao) + '\n');
            arquivoEscrita.append(String.valueOf(Resistencia) + '\n');
            arquivoEscrita.append(String.valueOf(Altura));
            arquivoEscrita.close();
            
        } catch (IOException ex) {
            System.out.println("ERRO!!!");
        }
    }
    
    public void StatusSalvar(int Forca, int Velocidade, int Energia, int Visao, int Resistencia, int Altura, String Nome, String Habilidade){
            System.out.println("1");
            Criar();
            this.Forca = Forca;
            this.Velocidade = Velocidade;
            this.Energia = Energia;
            this.Visao = Visao;
            this.Resistencia = Resistencia;
            this.Altura = Altura;
            this.Nome = Nome;
            this.Habilidade = Habilidade;
            Salvar(this.Forca, this.Velocidade, this.Energia, this.Visao, this.Resistencia, this.Altura, this.Nome, this.Habilidade);
            }
    
    public String Ler(int Click, int Recebeu, int Estato){
        try {
            String Linha, Parte1 = "", Parte2 = "", Parte3 = "", Parte4 = "", Parte5 = "", Parte6 = "", Parte7 = "", Parte8 = "";
            arquivoLeitura = new FileReader(nomeArquivo);
            Leitor = new BufferedReader(arquivoLeitura);
            for(int i = 0;((Linha = Leitor.readLine()) != null); i++) {
                System.out.println("1");
            switch(i){
                case 0:
                    Parte1 = Linha;
                    if(Click == 1)
                        return Parte1;
                    break;
                case 1:
                    Parte2 = Linha;
                    if(Click == 2)
                        return Parte2;
                    break;
                case 2:
                    Parte3 = Linha;
                    if(Recebeu == 3)
                        Parte3 = String.valueOf(Estato);
                    if(Click == 3)
                        return Parte3;
                    break;
                case 3:
                    Parte4 = Linha;
                    if(Recebeu == 4)
                        Parte4 = String.valueOf(Estato);
                    if(Click == 4)
                        return Parte4;
                    break;
                case 4:
                    Parte5 = Linha;
                    if(Recebeu == 5)
                        Parte5 = String.valueOf(Estato);
                    if(Click == 5)
                        return Parte5;
                    break;
                case 5:
                    Parte6 = Linha;
                    if(Recebeu == 6)
                        Parte6 = String.valueOf(Estato);
                    if(Click == 6)
                        return Parte6;
                    break;
                case 6:
                    Parte7 = Linha;
                    if(Recebeu == 7)
                        Parte7 = String.valueOf(Estato);
                    if(Click == 7)
                        return Parte7;
                    break;
                case 7:
                    Parte8 = Linha;
                    if(Recebeu == 8)
                        Parte8 = String.valueOf(Estato);
                    if(Click == 8)
                        return Parte8;
                    break;
            }
            }
            this.Forca = Integer.parseInt(Parte3);
            this.Velocidade = Integer.parseInt(Parte4);
            this.Energia = Integer.parseInt(Parte5);
            this.Visao = Integer.parseInt(Parte6);
            this.Resistencia = Integer.parseInt(Parte7);
            this.Altura = Integer.parseInt(Parte8);
            this.Nome = Parte1;
            this.Habilidade = Parte2;
            StatusSalvar(this.Forca, this.Velocidade, this.Energia, this.Visao, this.Resistencia, this.Altura, this.Nome, this.Habilidade);
        } catch (IOException ex) {
            System.out.println("ERRO!!!");
        }
        return Nome;
    }
}
