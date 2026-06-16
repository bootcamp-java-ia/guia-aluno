# Semana 03 – Controle de Fluxo

## 🎯 Big Picture
Controle de fluxo é o **cérebro do sistema**. É aqui que o software
deixa de "imprimir coisas" e começa a **tomar decisões**.
Sem `if` e loops, não existe regra de negócio.

---

## 🧩 Conexão com o Projeto Final
O programa de entrada de produto (semana 02) agora precisa **decidir**:
- preço negativo? rejeita
- desconto aplicável? calcula
- repetir entrada até o usuário digitar "sair"

O squad já está construindo uma mini-regra de negócio.

---

## 🚀 MVP da Semana (Obrigatório)
Em squad:

- Adicionar pelo menos uma decisão `if/else` ao programa do projeto
- Adicionar **um loop** que permita cadastrar vários produtos seguidos
- Encerrar o loop por comando do usuário (ex.: digitar `sair`)
- Imprimir um resumo ao final (ex.: "Você cadastrou N produtos")

📌 Onde commitar:
- Exercícios de `if`, `for`, `while`, `switch` → `practice`
- Loop de cadastro do projeto → `projeto-final`

---

## 🎮 Side Quest (Opcional)
- Limitar tentativas de entrada inválida
- Usar `switch` para um pequeno menu (1-cadastrar, 2-listar, 0-sair)
- Bloquear loop infinito com uma flag bem nomeada

---

## 🛠 Conteúdo Técnico
- `if` / `else if` / `else`
- `switch` (forma clássica e moderna `switch ->`)
- `for`, `while`, `do/while`
- `break` e `continue`
- Booleanos como guardas legíveis

---

## 🧠 Debug & Desenvolvimento Mental
- Loops infinitos (esquecer de atualizar a variável)
- Condições com `==` vs `.equals()` em `String`
- Lógica invertida (`!`) que confunde
- Identificar **qual `if` está sendo executado** via print/debug

---

## 🤖 Second Brain – Uso Consciente de IA
Use IA para: ver analogias de decisão, revisar condições, gerar dados de teste.

❌ Não use IA para: escrever o loop pronto, decidir sozinha a regra de negócio do squad.

### Prompt sugerido
> Explique como if, else e loops funcionam usando exemplos de decisões do dia a dia,
> sem mostrar código.

---

## 🧠 Contexto para IA (Second Brain do squad)
```
Semana 03 – Controle de Fluxo
Objetivo: decisões e repetições no código.
Conceitos-chave: if/else, switch, for, while, break/continue, equals.
Domínio do projeto: cadastro repetido de produtos com validação.
Decisões já tomadas: entrada via Scanner, tipos básicos, projeto = produtos.
O que NÃO usar ainda: classes próprias, coleções (List/Map), exceções.
```

---

## 📚 Referências
Material completo em [`./references.md`](./references.md).

---

## 📁 Exemplos
- [`examples/IfElseExample.java`](./examples/IfElseExample.java)
- [`examples/LoopExample.java`](./examples/LoopExample.java)


## ✅ Checklist de Entrega
- [ ] Fluxo com decisão funciona
- [ ] Loop permite múltiplos cadastros
- [ ] Encerramento controlado (sem `Ctrl+C`)
- [ ] Sem loop infinito acidental
- [ ] Commit em `projeto-final`

