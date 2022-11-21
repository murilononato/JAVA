package Exercicios;

import java.util.Scanner;

public class Nota_Vetor {
    public static void main(String[] args) {
        
        final int TOTAL_ALUNOS = 4;
        final int TOTAL_BIMESTRES = 4;
        final double NOTA_MINIMA = 70.0;
        
        Scanner input = new Scanner (System.in);
        String [] NOME_ALUNOS = new String[TOTAL_ALUNOS];
        double[][]  NOTA_ALUNOS = new double[TOTAL_ALUNOS][TOTAL_BIMESTRES];
        double[]  NOTA_MEDIA = new double[TOTAL_ALUNOS];
        
        //Obter nome dos alunos;
        for (int i = 0; i<TOTAL_ALUNOS; i++){
            System.out.println("INFORME O NOME DO " + (1+i) + "º ALUNO");
            NOME_ALUNOS[i] = input.nextLine();
        }
        
        System.out.println("");
        
            //Obter notas do alunos em todos os Bimestre
            for (int i = 0; i < TOTAL_ALUNOS; i++){
                for (int j = 0; j < TOTAL_BIMESTRES; j++){
                    System.out.println("Informe a nota do aluno " + NOME_ALUNOS[i] +
                    " para o " + (j+1) + "º Bimestre");
                    NOTA_ALUNOS[i][j] = input.nextDouble();
                }
            }
        
                //Calcular MEDIAS dos ALUNOS
                    for (int i = 0; i < TOTAL_ALUNOS; i++){
                        for (int j = 0; j < TOTAL_BIMESTRES; j++){
                            NOTA_MEDIA[i] += NOTA_ALUNOS[i][j];
                }
                        NOTA_MEDIA[i] /= TOTAL_BIMESTRES;
            }
                           for (int i = 0; i < TOTAL_ALUNOS; i++){
                               
                                if(NOTA_MEDIA[i] >= NOTA_MINIMA){
                                    System.out.println("ALUNO: " + NOME_ALUNOS[i] +
                                          " APROVADOR: " + NOTA_MEDIA[i]);
                                        continue;
                                }
                                   System.out.println("ALUNO: " + NOME_ALUNOS[i] +
                                            " REPROVADOR: " + NOTA_MEDIA[i]);
                                
                               
                                    }
        
    }
}
