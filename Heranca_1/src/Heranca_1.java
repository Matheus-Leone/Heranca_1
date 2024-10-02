//Atributos da SuperClasse, que irá repassar para outras classes
class Pessoa {
    private String nome;
    private String endereco;
    private String email;

    public Pessoa(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Email: " + email);
    }
}

// Classe "PessoaFísica" q herda os atributos de Pessoa
class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String endereco, String email, String cpf) {
        super(nome, endereco, email);
        this.cpf = cpf;
    }

    @Override //Sobrescreve a informação setada para a atual, fazendo assim, com que cada override sobrescreva a informação do outro, tendo respostas diferentes para o mesma pergunta
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("CPF: " + cpf);
    }
}

// Classe PessoaJuridica herdando de Pessoa
class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String email, String cnpj) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
    }

    @Override//Sobrescreve a informação setada para a atual, fazendo assim, com que cada override sobrescreva a informação do outro, tendo respostas diferentes para o mesma pergunta
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("CNPJ: " + cnpj);
    }
}

// Classe Funcionario herdando de Pessoa
class Funcionario extends PessoaFisica {
    private double salario;

    public Funcionario(String nome, String endereco, String email, String cpf, double salario) {
        super(nome, endereco, email, cpf);
        this.salario = salario;
    }

    @Override//Sobrescreve a informação setada para a atual, fazendo assim, com que cada override sobrescreva a informação do outro, tendo respostas diferentes para o mesma pergunta
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Salário: " + salario);
    }
}

