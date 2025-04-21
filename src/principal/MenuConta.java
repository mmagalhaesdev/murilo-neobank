package principal;
import javax.swing.JOptionPane;
public class MenuConta extends Menu {
    //Definindo variável do tipo private que herda atributos e métodos da classe ContaCorrente
    private ContaCorrente contaCC;
    //Definindo variável do tipo private que herda atributos e métodos da classe ContaPoupança
    private ContaPoupança contaCP;
    //Executa o executarMenu() de Menu
    protected void executarMenu(){
         super.executarMenu();
    }
    //Executa o avaliarOpçãoEscolhida()de Menu
    public void avaliarOpçãoEscolhida(){
           super.avaliarOpçãoEscolhida();
    }
     //Executa o operarCOntaCC
    public void operarContaCC(){
        //Permite que os dados fiquem salvos enquanto o programa é executado
        if (contaCC == null) {
            contaCC = new ContaCorrente();
        }
        //Entrada de dados
        int op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: \n1 - Consultar saldo \n2 - Depositar \n3 - Sacar \n4 - Atualizar saldo \n0 - Voltar"));
        //Executa uma ação dependendo do valor selecionado 
        switch(op) {
            case 0:
                //Retorna para o método que foi chamado, ou seja, avaliarOpçãoEscolhida() em Menu
                return;
            case 1:
                //Cria uma variável que recebe o retorno do método toString()
                String valor = contaCC.toString();
                // Exibe uma interface com o resultado de valor
                JOptionPane.showMessageDialog(null, valor);
                // Executa novamente operarcontaCC()
                operarContaCC();
                break;
            case 2:
                //Entrada do valor que o usuário deseja depositar
                double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que deseja depositar:"));
                //Executa o método depositar com a entrada do parâmetro, sendo o valo digitado pelo usuário anteriormente
                contaCC.depositar(valorDeposito);
                //Depois que o método depositar() terminar de ser executado, é executado novamente operarContaCC
                operarContaCC();
                break;
            case 3:
                //Entrada do valor que o usuário deseja sacar
                double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que deseja sacar:"));
                //Executa o método sacar com a entrada do parâmetro, sendo o valo digitado pelo usuário anteriormente
                contaCC.sacar(valorSaque);
                //Depois que o método sacar() terminar de ser executado, é executado novamente operarContaCC
                operarContaCC();
                break;
            case 4:
                //Como o parâmetro de atualizarSaldo é só usado em contaCP, vamos declarar uma variável com o valor zero
                double m = 0;
                //Executa o método atualizarSaldo com a entrada do parâmetro, sendo o valor digitado pelo usuário anteriormente
                contaCC.atualizarSaldo(m);
                 //Depois que o método atualizarSaldo() terminar de ser executado, é executado novamente operarContaCC
                operarContaCC();
                break;
            default:
                //Caso o usuário informe uma opção não equivalente ao que foi pedido, o programa imprime uma 
                //mensagem de erro e executa o método executar() novamente
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                //Depois que a mensagem for exibida, é executado novamente operarConraCC()
                operarContaCC();
                break;
        }
    }
    
    public void operarContaCP(){
        //Permite que os dados fiquem salvos enquanto o programa é executado
        if (contaCP == null) {
            contaCP = new ContaPoupança();
        }
         //Entrada de dados
        int op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: \n1 - Consultar saldo \n2 - Depositar \n3 - Sacar \n4 - Atualizar saldo \n0 - Voltar"));
         //Executa uma ação dependendo do valor selecionado 
        switch(op) {
            case 0:
                //Retorna para o método que foi chamado, ou seja, avaliarOpçãoEscolhida() em Menu
                return;
            case 1:
                //Cria uma variável que recebe o retorno do método toString()
                String valor = contaCP.toString();
                // Exibe uma interface com o resultado de valor
                JOptionPane.showMessageDialog(null, valor);
                break;
            case 2:
                 //Entrada do valor que o usuário deseja depositar
                double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que deseja depositar:"));
                 //Executa o método depositar com a entrada do parâmetro, sendo o valo digitado pelo usuário anteriormente
                contaCP.depositar(valorDeposito);
                break;
            case 3:
                  //Entrada do valor que o usuário deseja sacar
                double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que deseja sacar:"));
                //Executa o método sacar com a entrada do parâmetro, sendo o valo digitado pelo usuário anteriormente
                contaCP.sacar(valorSaque);
                break;
            case 4:
                //Entrada da porcentagem, parâmetro de atualizarSaldo()
                double Porcentagem = Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem:"));
                //Executa o método atualizarSaldo com a entrada do parâmetro, sendo o valor digitado pelo usuário anteriormente
                contaCP.atualizarSaldo(Porcentagem);
                break;
            default:
                //Caso o usuário informe uma opção não equivalente ao que foi pedido, o programa imprime uma 
                //mensagem de erro e executa o método executar() novamente
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                break;
        }
        // Executa novamente operarcontaCC() caso a opção seja diferente de zero
        if(op > 0){
             operarContaCP();
        }
    }
}

