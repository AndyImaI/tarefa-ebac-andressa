public class VendaFinal {

    public static void main (String args[]){

        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua Dos Testes");
        //System.out.println("SENHA :");
        cliente.setSenha(1);
        System.out.println(cliente.getSenha());
        cliente.retornarNomeCliente();




    }
    
}
