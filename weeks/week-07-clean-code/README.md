# Semana 07 – Clean Code e Boas Práticas

## 🎯 Big Picture
Código é **lido muito mais vezes do que é escrito**.
Código limpo reduz bugs, custo de manutenção e atrito entre pessoas do time.
Esta semana é uma **pausa para refinar**, não para adicionar funcionalidade.

---

## 🧩 Conexão com o Projeto Final
Não há nova feature.
O squad **revisa** todo o `projeto-final` aplicando boas práticas:
- nomes melhores
- métodos pequenos
- responsabilidades separadas (uma classe ≠ um monstro)
- README do projeto atualizado e claro

> Esta semana é um excelente momento para criar uma **classe `Estoque`** ou
> separar responsabilidades em pacotes (ex.: `model`, `app`).

---

## 🚀 MVP da Semana (Obrigatório)
Em squad:

- Revisar o `projeto-final` e listar 3 melhorias possíveis
- Aplicar ao menos **2 refatorações** (sem mudar comportamento)
- Garantir que tudo continua rodando
- Atualizar o `README.md` do projeto com:
    - o que o sistema faz
    - como rodar
    - status atual

📌 Onde commitar:
- Estudos com `BadExample` / `GoodExample` → `practice`
- Refatorações reais → `projeto-final`

---

## 🎮 Side Quest (Opcional)
- Aplicar **um** princípio SOLID conscientemente (ex.: SRP)
- Configurar um linter/formatador (ex.: Spotless, Checkstyle)
- Aplicar um padrão simples (ex.: separar `Repository` de `Service`)

---

## 🛠 Conteúdo Técnico
- Clean Code: nomes, funções pequenas, sem comentários redundantes
- SRP (Single Responsibility Principle)
- Refatoração segura (mudança sem alterar comportamento)
- Code smells: nomes ruins, duplicação, métodos gigantes, `if` aninhado
- Convenções Java (camelCase, PascalCase)

---

## 🧠 Debug & Desenvolvimento Mental
- "Se eu voltar daqui a 3 meses, vou entender?"
- "Esse método faz **uma** coisa?"
- "Esse nome explica o **porquê**, não só o **o quê**?"
- Cuidado com refator + nova feature na mesma PR

---

## 🤖 Second Brain – Uso Consciente de IA
Use IA para: sugerir nomes melhores, apontar duplicação, propor pequenas refatorações.

❌ Não use IA para: refatorar tudo sozinha — o squad **precisa entender** as mudanças.

### Prompt sugerido
> Analise este trecho de código do ponto de vista de clareza.
> Sugira melhorias focadas em nomes, legibilidade e simplicidade,
> sem alterar o comportamento.

---

## 🧠 Contexto para IA (Second Brain do squad)
```
Semana 07 – Clean Code
Objetivo: refinar o que existe; nenhuma feature nova.
Conceitos-chave: nomes, funções pequenas, SRP, refatoração.
Domínio do projeto: gestão de produtos já com classes e coleções.
Decisões já tomadas: classes Produto + ArrayList + (talvez) herança/interface.
O que NÃO usar ainda: exceções customizadas profundas, persistência, APIs.
```

---

## 📚 Referências
Material completo em [`./references.md`](./references.md).

---

## 📁 Exemplos
- [`examples/BadExample.java`](./examples/BadExample.java)
- [`examples/GoodExample.java`](./examples/GoodExample.java)

---

## 📝 Revisão da Semana
Aplicada no início da semana 08: [`./reviews/review-week07.csv`](./reviews/review-week07.csv)

---

## ✅ Checklist de Entrega
- [ ] 3 melhorias identificadas
- [ ] 2 refatorações aplicadas
- [ ] Comportamento preservado
- [ ] README do `projeto-final` atualizado
- [ ] Commit explicando **o porquê** de cada refator

