# Semana 05 – POO I (Classes, Objetos e Encapsulamento)

## 🎯 Big Picture
Variáveis soltas não escalam.
**Programação Orientada a Objetos** modela o domínio do problema e torna o sistema
mais fácil de evoluir, manter e explicar para outras pessoas.

---

## 🧩 Conexão com o Projeto Final
Até agora o "produto" era um conjunto de variáveis (`nome`, `preco`).
Esta semana ele vira uma **classe `Produto`**, e a `ArrayList<String>` vira
`ArrayList<Produto>`. Esse é o **maior salto arquitetural** do bootcamp até aqui.

---

## 🚀 MVP da Semana (Obrigatório)
Em squad:

- Criar a classe `Produto` com atributos (`nome`, `preco`, `quantidade`...)
- Atributos privados + getters/setters (ou construtor + métodos de comportamento)
- Construtor com validação simples (ex.: preço não pode ser negativo)
- Método `exibir()` ou `toString()` claro
- Refatorar o projeto para usar `ArrayList<Produto>` no lugar das Strings

📌 Onde commitar:
- Experimentos com classes diversas → `practice`
- `Produto` + refator da lista → `projeto-final`

---

## 🎮 Side Quest (Opcional)
- Criar uma classe `Estoque` que encapsula a lista de produtos
- Adicionar `equals` e `hashCode` com base no código do produto
- Usar `record` (Java moderno) para uma classe sem comportamento

---

## 🛠 Conteúdo Técnico
- Classe vs Objeto
- Atributos e métodos
- Construtores (default e com parâmetros)
- Encapsulamento (`private` + getters/setters)
- `this`
- `toString()`

---

## 🧠 Debug & Desenvolvimento Mental
- Atributos não inicializados → `null` ou `0`
- Confusão entre **estado** (atributo) e **comportamento** (método)
- Esquecer de instanciar (`new`) e acessar como estático
- "Quem é dono dessa responsabilidade?" — pergunta-chave

---

## 🤖 Second Brain – Uso Consciente de IA
Use IA para: analogias de objetos, revisar coesão, comparar com structs/dicts.

❌ Não use IA para: gerar a classe `Produto` inteira sem discussão do squad.

### Prompt sugerido
> Explique programação orientada a objetos como se fosse um sistema do mundo real
> (produtos, pessoas, contas), sem usar termos técnicos avançados.

---

## 🧠 Contexto para IA (Second Brain do squad)
```
Semana 05 – POO I
Objetivo: modelar o domínio em classes.
Conceitos-chave: classe, objeto, atributo, método, construtor, encapsulamento.
Domínio do projeto: Produto agora é uma classe; lista vira ArrayList<Produto>.
Decisões já tomadas: usar ArrayList em memória.
O que NÃO usar ainda: herança, interfaces, exceções customizadas, persistência.
```

---

## 📚 Referências
Material completo em [`./references.md`](./references.md).

---

## 📁 Exemplos
- [`examples/Produto.java`](./examples/Produto.java)
- [`examples/Main.java`](./examples/Main.java)

---

## 📝 Revisão da Semana
Aplicada no início da semana 06: [`./reviews/review-week05.csv`](./reviews/review-week05.csv)

---

## ✅ Checklist de Entrega
- [ ] Classe `Produto` criada com atributos privados
- [ ] Construtor com validação básica
- [ ] `toString()` ou `exibir()` legível
- [ ] Projeto refatorado para `ArrayList<Produto>`
- [ ] Commit em `projeto-final`

