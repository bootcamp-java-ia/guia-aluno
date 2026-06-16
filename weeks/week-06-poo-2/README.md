# Semana 06 – POO II (Herança, Polimorfismo e Interfaces)

## 🎯 Big Picture
Sem herança e polimorfismo, sistemas crescem por **copiar e colar**.
Reuso bem feito reduz bugs e custo de manutenção — e é a base de quase todo framework.

---

## 🧩 Conexão com o Projeto Final
A classe `Produto` agora pode ter **variações** (ex.: `ProdutoFisico`, `ProdutoDigital`)
ou comportamentos plugáveis via **interface** (ex.: `Tributavel`, `Descontavel`).
O squad escolhe **uma** variação e aplica — sem inventar hierarquia exagerada.

---

## 🚀 MVP da Semana (Obrigatório)
Em squad:

- Criar **uma** das opções:
    - Classe base + classe filha (`extends`) com método sobrescrito (`@Override`)
    - **ou** uma interface implementada por `Produto`
- Demonstrar **polimorfismo**: tratar variações pelo tipo da referência base
- Justificar no commit/README **por que** essa modelagem ajuda o projeto

📌 Onde commitar:
- Estudos de herança e interface → `practice`
- Única modelagem escolhida → `projeto-final`

---

## 🎮 Side Quest (Opcional)
- Adicionar uma classe `abstract`
- Comparar **herança vs composição** em um README curto
- Demonstrar uma interface funcional (`@FunctionalInterface`)

---

## 🛠 Conteúdo Técnico
- `extends` e `super`
- `@Override`
- Classes `abstract`
- `interface` e `implements`
- Polimorfismo (uma referência, vários comportamentos)
- Quando **não** usar herança

---

## 🧠 Debug & Desenvolvimento Mental
- Hierarquia profunda demais → difícil de manter
- Tipo da referência vs tipo do objeto real
- `super.metodo()` para reusar a lógica do pai
- Pergunta: "isso é **um tipo de** ou só **tem um**?" → herança vs composição

---

## 🤖 Second Brain – Uso Consciente de IA
Use IA para: comparar herança vs composição, revisar polimorfismo, sugerir nomes.

❌ Não use IA para: criar hierarquias que o squad não consegue justificar.

### Prompt sugerido
> Explique herança e polimorfismo usando exemplos simples do cotidiano,
> mostrando por que isso evita código duplicado e quando não é a melhor escolha.

---

## 🧠 Contexto para IA (Second Brain do squad)
```
Semana 06 – POO II
Objetivo: reuso via herança/interfaces e polimorfismo.
Conceitos-chave: extends, abstract, interface, override, polimorfismo.
Domínio do projeto: variações de Produto OU interface plugável.
Decisões já tomadas: Produto é classe; lista é ArrayList<Produto>.
O que NÃO usar ainda: exceções customizadas, persistência, frameworks.
```

---

## 📚 Referências
Material completo em [`./references.md`](./references.md).

---

## 📁 Exemplos
- [`examples/Funcionario.java`](./examples/Funcionario.java)
- [`examples/Gerente.java`](./examples/Gerente.java)
- [`examples/Main.java`](./examples/Main.java)


## ✅ Checklist de Entrega
- [ ] Uma hierarquia OU uma interface no projeto
- [ ] Polimorfismo demonstrado em pelo menos um ponto
- [ ] Justificativa de modelagem no README do squad
- [ ] Commit em `projeto-final`

