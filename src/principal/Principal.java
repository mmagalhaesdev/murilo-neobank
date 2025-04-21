package principal;

public class Principal {

    public static void main(String[] args) {
        //Intanciando o objeto user em MenuConta()
        MenuConta user = new MenuConta();
        //Executando o método executar() que MenuConta() herda de Menu
        user.executar();
    }
    
}
