# Semana 02 – Sintaxe Básica

## 🎯 Big Picture
Computadores não interpretam intenção, apenas regras.
**Sintaxe é o contrato entre você e a máquina.**
Esta semana é onde o medo do "código que não compila" começa a virar familiaridade.

---

## 🧩 Conexão com o Projeto Final
O `projeto-final` ainda é só um Hello World — e tudo bem.
Esta semana, ele evolui para um pequeno programa que:
- recebe entrada do usuário (ex.: nome do produto, preço)
- exibe um resumo formatado

Esse mini-programa **vira a base** que será refatorada para classes na semana 05.

---

## 🚀 MVP da Semana (Obrigatório)
Em squad:

- Criar um programa Java que declare variáveis de tipos diferentes (`int`, `double`, `String`, `boolean`)
- Realizar pelo menos 2 operações matemáticas
- Ler **um dado do usuário** via `Scanner`
- Exibir o resultado formatado no console
- Commitar a versão no `projeto-final` como `EntradaProduto.java` (ou similar)

📌 Onde commitar:
- Brincadeiras com tipos e operadores → `practice`
- Versão "limpa" do programa do squad → `projeto-final`

---

## 🎮 Side Quest (Opcional)
- Tratar divisão por zero (sem `try/catch` ainda — usar `if`)
- Formatar valores com `printf` ou `String.format`
- Validar entrada simples (ex.: preço negativo)

---

## 🛠 Conteúdo Técnico
- Tipos primitivos vs `String`
- Operadores aritméticos, relacionais e lógicos
- `Scanner` (entrada via console)
- `System.out.println` vs `printf`
- Casting básico (`int` ↔ `double`)

---

## 🧠 Debug & Desenvolvimento Mental
- Erros de tipo (`incompatible types`)
- `Scanner` "comendo" o `\n` entre `nextInt()` e `nextLine()`
- Variável não inicializada
- Ponto-e-vírgula faltando — como o compilador aponta a linha errada

---

## 🤖 Second Brain – Uso Consciente de IA
Use IA para: entender o que são tipos, comparar com outras linguagens, ver exemplos extras.

❌ Não use IA para: gerar o programa do MVP, resolver casting sem entender.

### Prompt sugerido
> Explique o que são linguagens de tipagem forte, por que Java exige tipos
> e como isso evita erros, usando exemplos do dia a dia.

---

## 🧠 Contexto para IA (Second Brain do squad)
```
Semana 02 – Sintaxe Básica
Objetivo: tipos, operadores, Scanner, console.
Conceitos-chave: int, double, String, boolean, Scanner, casting.
Domínio do projeto: gestão de produtos (ex.: nome + preço).
Decisões já tomadas: ambiente pronto, repositórios criados.
O que NÃO usar ainda: classes próprias, listas, herança, try/catch.
```

---

## 📚 Referências
Material completo em [`./references.md`](./references.md).

---

## 📁 Exemplos
- [`examples/VariablesExample.java`](./examples/VariablesExample.java)
- [`examples/ScannerExample.java`](./examples/ScannerExample.java)

---

## 📝 Revisão da Semana
Aplicada no início da semana 03: [`./reviews/review-week02.csv`](./reviews/review-week02.csv)

---

## ✅ Checklist de Entrega
- [ ] Programa compila e roda
- [ ] Pelo menos 4 tipos diferentes usados
- [ ] Entrada via `Scanner` funcionando
- [ ] Commit em `projeto-final`
- [ ] Squad sabe explicar cada linha

