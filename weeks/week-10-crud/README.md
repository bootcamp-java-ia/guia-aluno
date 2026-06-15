# Semana 10 – CRUD (Create, Read, Update, Delete)

## 🎯 Big Picture
**CRUD é o esqueleto de quase todo sistema do mundo real.**
Antes de framework, banco e API, todo software precisa criar, ler, atualizar e remover dados.
Esta semana é onde o projeto vira, de fato, um **sistema usável**.

---

## 🧩 Conexão com o Projeto Final
O squad agora estrutura o `projeto-final` em **camadas**:
- `Produto` (modelo, semana 05)
- `ProdutoRepository` (lista + persistência das semanas 04 e 09)
- `Main` / `Menu` (entrada do usuário)

O CRUD é o conjunto de **operações públicas** do repositório.

---

## 🚀 MVP da Semana (Obrigatório)
Em squad:

- Criar (ou consolidar) a classe `ProdutoRepository` com:
    - `create(Produto)`
    - `findAll()`
    - `findById(...)`
    - `update(...)`
    - `delete(...)`
- Conectar o menu/loop ao repositório
- Validar operações (ex.: atualizar item inexistente)
- Persistir as alterações (reuso da semana 09)

📌 Onde commitar:
- Estudos de CRUD com várias entidades → `practice`
- CRUD completo de Produto → `projeto-final`

---

## 🎮 Side Quest (Opcional)
- Separar `ProdutoService` (regras) de `ProdutoRepository` (dados)
- Adicionar busca por nome/categoria
- Paginar a listagem

---

## 🛠 Conteúdo Técnico
- Padrão Repository
- CRUD como contrato
- Separação de responsabilidades: dados vs regras vs interface
- Idempotência básica (update/delete idempotentes)
- Identificação por ID

---

## 🧠 Debug & Desenvolvimento Mental
- Atualizar/remover o item errado por busca frágil
- Misturar lógica de negócio no `main`
- "Quem deveria ser responsável por isso?"
- Testar manualmente cada operação **antes** de passar para API

---

## 🤖 Second Brain – Uso Consciente de IA
Use IA para: revisar contratos do Repository, sugerir nomes de método, gerar casos de teste.

❌ Não use IA para: gerar o repositório inteiro sem entender cada método.

### Prompt sugerido
> Explique o conceito de CRUD passo a passo, mostrando como Create, Read,
> Update e Delete se relacionam, usando um exemplo simples em memória.

---

## 🧠 Contexto para IA (Second Brain do squad)
```
Semana 10 – CRUD
Objetivo: oferecer as 4 operações básicas sobre Produto.
Conceitos-chave: Repository, separação de camadas, persistência integrada.
Domínio do projeto: CRUD completo de Produto, persistido em arquivo.
Decisões já tomadas: Produto + lista + validações + persistência.
O que NÃO usar ainda: HTTP/API, autenticação, framework web.
```

---

## 📚 Referências
Material completo em [`./references.md`](./references.md).

---

## 📁 Exemplos
- [`examples/Produto.java`](./examples/Produto.java)
- [`examples/ProdutoRepository.java`](./examples/ProdutoRepository.java)
- [`examples/Main.java`](./examples/Main.java)

---

## 📝 Revisão da Semana
Aplicada no início da semana 11: [`./reviews/review-week10.csv`](./reviews/review-week10.csv)

---

## ✅ Checklist de Entrega
- [ ] Repositório com 4 operações
- [ ] Menu conectado ao repositório
- [ ] Persistência funcionando ao longo das operações
- [ ] Validação de "item inexistente"
- [ ] Commit em `projeto-final`

