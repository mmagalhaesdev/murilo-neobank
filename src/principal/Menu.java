package principal;
import javax.swing.JOptionPane;
public class Menu {
    // Declarando variável privada,ou seja, somente classe Menu tem acesso do tipo int para identificar a 
    //opção escolhida pelo usuário
    private int opção;
    // Declarando variável privada ,ou seja, somente classe menu tem acesso do tipo String
    private String mensagemMenu = "";
    //Criando método executar que irá inicializar o programa, executando o método executarMenu() e avaliarOpçãoEscolhida()
    // enquanto a opção foir diferente de 0, que no caso encerra o programa
    public void executar(){
        do {
            executarMenu();
            avaliarOpçãoEscolhida();
        }while(opção != 0);
    }
    //Executa uma interface, recebe o valor do usuário em opção e converte em inteiro
    protected void executarMenu(){
         this.opção = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: \n1 - Conta Corrente \n2 - Conta Poupança \n0 - Sair"));
    }
    //Método que irá identificar qual opção foi selecionada pelo usuário e irá executar uma ação
    public void avaliarOpçãoEscolhida(){
        //Instanciândo um objeto em MenuConta() para ter acesso aos seus métodos
        MenuConta a = new MenuConta();
        //Switch Case que executará uma ação conforme o valor que o usuário digitou 
        switch (opção){
            case 1:
                //Executa o método operarContaCC() em MenuConta()
                a.operarContaCC();
                break;
            case 2:
                 //Executa o método operarContaCP() em MenuConta()
                 a.operarContaCP();
                 break;
            case 0:
                 //Finaliza o programa
                break;
            default:
                //Caso o usuário informe uma opção não equivalente ao que foi pedido, o programa imprime uma 
                //mensagem de erro e executa o método executar() novamente
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                //O método executar é executado novamente
                executar();
        }
    }
    //Método get que permite subclasses de Menu ter acesso a opção, que é do tipo private
    public int getOpção(){
        // Returna opção
        return this.opção;
    }
}
