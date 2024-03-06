package ChainResponsability;

public class Produto {
    private String nome;
    private int id;
    private double preco;

    public Produto(String name, int id, double price) {
        this.nome = name;
        this.id = id;
        this.preco = price;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return  nome +
                ": id = " + id +
                ", preço = " + preco;
    }
}