package Model;

import java.util.Scanner;


public class Usuario {
    private String nome;
    private int usuario;
    
    public Usuario() {
        
    }

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getUsuario(){
        return usuario;
    }
    
    public void setUsuario(int usuario){
        this.usuario = usuario;
    }
    
    public int jogadaUsuario(){
        Scanner scan = new Scanner(System.in);
        usuario = scan.nextInt();
        scan.close();
                                   
        return usuario;  
    }

    public void anuncioJogada(){
        switch(usuario){
            case 1:
                usuario = 1;
                System.out.println("\nVocê escolheu: PEDRA\n");
                break;

            case 2:
                usuario = 2;
                System.out.println("\nVocê escolheu: PAPEL\n");
                break;

            case 3:
                usuario = 3;
                System.out.println("\nVocê escolheu: TESOURA\n");
                break;
            
        }
    }

    
}
