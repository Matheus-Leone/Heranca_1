public class Main {

	// Classe principal para teste
	public class heranca {
	    public static void main(String[] args) {
	        // Criando as informações da Classe PessoaFisica
	        PessoaFisica pessoaFisica1 = new PessoaFisica("João Silva", "Rua A, 123", "joao@email.com", "123.456.789-00");
	        PessoaFisica pessoaFisica2 = new PessoaFisica("Maria Oliveira", "Rua B, 456", "maria@email.com", "987.654.321-00");

	        // Criando as informações da Classe PessoaJuridica
	        PessoaJuridica pessoaJuridica1 = new PessoaJuridica("Empresa ABC", "Avenida C, 789", "contato@empresaabc.com", "12.345.678/0001-00");

	        // Criando as informações da Classe Funcionario
	        Funcionario funcionario1 = new Funcionario("Carlos Pereira", "Rua D, 987", "carlos@email.com", "111.222.333-44", 3500.0);

	        // Exibindo informações
	        System.out.println("---- Pessoa Física 1 ----");
	        pessoaFisica1.exibirInformacoes();
	        System.out.println();

	        System.out.println("---- Pessoa Física 2 ----");
	        pessoaFisica2.exibirInformacoes();
	        System.out.println();

	        System.out.println("---- Pessoa Jurídica 1 ----");
	        pessoaJuridica1.exibirInformacoes();
	        System.out.println();

	        System.out.println("---- Funcionário 1 ----");
	        funcionario1.exibirInformacoes();
	    }

}
	
}