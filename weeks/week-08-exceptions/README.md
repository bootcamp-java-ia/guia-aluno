# Semana 08 – Exceções e Validações

## 🎯 Big Picture
Sistemas reais **falham**. Conexão cai, usuário digita errado, arquivo some.
Sistemas bem projetados **lidam com falhas** sem virar uma tela branca de erro.

---

## 🧩 Conexão com o Projeto Final
O squad adiciona ao `projeto-final`:
- validação de entradas (preço, quantidade, código)
- pelo menos **uma exceção customizada** (ex.: `ProdutoInvalidoException`)
- mensagens amigáveis ao usuário (sem cuspir stack trace na cara)

Isso prepara o terreno para a persistência (semana 09) e a API (semana 11),
onde falhas viram **respostas HTTP**.

---

## 🚀 MVP da Semana (Obrigatório)
Em squad:

- Identificar 3 pontos do projeto que podem falhar
- Usar `try/catch` em **ao menos um** deles
- Criar **uma** exceção customizada com mensagem útil
- Exibir uma mensagem amigável no console (sem expor stack trace)

📌 Onde commitar:
- Estudos com `try/catch/finally` → `practice`
- Validações e exceções no projeto → `projeto-final`

---

## 🎮 Side Quest (Opcional)
- Logging básico com `java.util.logging` ou `System.err`
- Criar uma hierarquia de exceções do domínio
- Diferenciar **checked** vs **unchecked**

---

## 🛠 Conteúdo Técnico
- `try` / `catch` / `finally`
- `throw` e `throws`
- Exceções **checked** vs **unchecked**
- Exceções customizadas (estendendo `RuntimeException`)
- Stack trace: como ler e o que ignorar
- Validação defensiva no construtor

---

## 🧠 Debug & Desenvolvimento Mental
- ❌ Anti-padrão: `catch(Exception e) {}` (engolir erro)
- Capturar **mais específico** primeiro
- Mensagens de erro devem dizer: **o que aconteceu, onde, como resolver**
- "O erro foi do usuário ou do sistema?"

---

## 🤖 Second Brain – Uso Consciente de IA
Use IA para: entender stack trace, sugerir mensagens claras, propor cenários de teste.

❌ Não use IA para: esconder o erro com try/catch genérico.

### Prompt sugerido
> Explique a diferença entre erro e exceção em Java, por que exceções existem
> e como elas ajudam a tornar sistemas mais confiáveis. Dê exemplos de boas mensagens.

---

## 🧠 Contexto para IA (Second Brain do squad)
```
Semana 08 – Exceções e Validações
Objetivo: lidar com falhas previsíveis sem quebrar a UX.
Conceitos-chave: try/catch/finally, throw/throws, checked vs unchecked, exceções customizadas.
Domínio do projeto: validar preço, quantidade, código; rejeitar entradas inválidas.
Decisões já tomadas: classes do domínio, lista em memória, código refatorado.
O que NÃO usar ainda: persistência em arquivo/BD, APIs HTTP.
```

---

## 📚 Referências
Material completo em [`./references.md`](./references.md).

---

## 📁 Exemplos
- [`examples/ExceptionExample.java`](./examples/ExceptionExample.java)
- [`examples/ProdutoNaoEncontradoException.java`](./examples/ProdutoNaoEncontradoException.java)

---

## 📝 Revisão da Semana
Aplicada no início da semana 09: [`./reviews/review-week08.csv`](./reviews/review-week08.csv)

---

## ✅ Checklist de Entrega
- [ ] 3 pontos de falha mapeados
- [ ] `try/catch` em pelo menos um ponto
- [ ] Exceção customizada criada e usada
- [ ] Mensagens amigáveis ao usuário
- [ ] Commit em `projeto-final`

