package capitulo_12.exercicios_resolvidos.exercicio_resolvido1;

public class Produto {
  
  private String descricao;
  private Tipo tipo;
  private double preco;
  private double imposto;

  public Produto() {
  }

  public double calcPrecoFinal() {
    return preco + imposto;
  }

  /*  
   * Getters & Setters
   * ==================================================
   */
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  public String getDescricao() {
    return descricao;
  }

  public void setTipo(Tipo tipo) {
    this.tipo = tipo;
    setImposto(preco * tipo.getPercTipo() / 100);
  }
  public Tipo getTipo() {
    return tipo;
  }

  public void setImposto(double imposto) {
    this.imposto = imposto;
  }
  public double getImposto() {
    return imposto;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }
  public double getPreco() {
    return preco;
  }
  

}
