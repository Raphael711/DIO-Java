public class RodarAplicacao {

    public static void main(String[] args) {
        
        // Funcionario funcionario = new Funcionario();
    
        // // UPCASTS
        
        // //Funcionario gerente = new Gerente();
        // //Funcionario vendedor = new Vendedor();
        // //Funcionario faxineiro = new Faxineiro();

        // //DOWNCASTS

        // //Vendedor vendedor_ = (Vendedor) new Funcionario();

        Funcionario[] classes = new Funcionario[]{new Faxineiro(), new Gerente(), new Vendedor(), new Funcionario()};

        for (Funcionario classe : classes){
            classe.metodo1();
        }
        
        System.out.println(" ");
    }
    
}
