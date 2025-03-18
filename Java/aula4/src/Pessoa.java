public class Pessoa {
        private String nome;
        private int idade;
        private double altura;
        private String email;
        private String cpf;
        private Double peso;
        private int genero ;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPeso() {
        return peso;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public int getGenero() {
        return genero;
    }

    public void setNome (String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void setIdade (int idade) {
            this.idade = idade;
        }

        public int getIdade() {
            return idade;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public double getAltura() {
            return altura;
        }


        public void aniversario() {
            idade += 1;
            altura += 0.02;
        }
    }

