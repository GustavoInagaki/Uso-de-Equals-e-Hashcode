🧠 Estudando equals() e hashCode() em Java

Neste projeto estou praticando e entendendo melhor o funcionamento dos métodos equals() e hashCode() em Java. Esses dois métodos são fundamentais quando trabalhamos com coleções que não permitem duplicidade de elementos, como o HashSet.

✔️ O que eu aprendi

Para que a comparação entre objetos funcione corretamente, não basta comparar suas referências na memória. Muitas vezes, dois objetos representam a mesma entidade do ponto de vista do domínio. Por isso, sobrescrevemos os métodos:

equals() para definir quando dois objetos devem ser considerados iguais;

hashCode() para garantir que objetos iguais gerem o mesmo código de hash.

No meu caso, implementei uma classe Produto, onde dois produtos são considerados iguais apenas se tiverem o mesmo código. Isso me permitiu testar e visualizar como o HashSet trata a inserção de objetos duplicados.

🔍 Por que isso é importante?

Evita que objetos duplicados sejam adicionados em coleções baseadas em hash.

Garante integridade e consistência quando trabalhamos com estruturas como HashSet.

É um conceito essencial em coleções, banco de dados, entidades, regras de negócio e APIs.

É muito utilizado em situações de comparação lógica, e não por referência.

💡 Conclusão

Entender e implementar corretamente equals() e hashCode() é parte fundamental da Programação Orientada a Objetos em Java. Além de evitar problemas de duplicidade, também melhora a eficiência das buscas e inserções em coleções que utilizam hashing.
