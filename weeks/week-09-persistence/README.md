# Semana 09 – Persistência de Dados

## 🎯 Big Picture
Sistemas precisam **lembrar**. Sem persistência, todo cadastro morre quando
o programa fecha. Persistência é a memória de longo prazo do software.

---

## 🧩 Conexão com o Projeto Final
A `ArrayList<Produto>` é volátil. Esta semana, o squad faz o projeto
**salvar e carregar** os produtos entre execuções — usando arquivo (CSV/TXT/JSON
simples). Banco de dados é opcional (Side Quest).

> Isso fecha o ciclo "cadastrar → listar → **persistir**" e prepara o CRUD da semana 10.

---

## 🚀 MVP da Semana (Obrigatório)
Em squad:

- Ao **encerrar** o programa, salvar a lista de produtos em arquivo
- Ao **iniciar** o programa, carregar a lista do arquivo (se existir)
- Tratar arquivo inexistente sem quebrar (semana 08 ajuda aqui)
- Formato livre (CSV simples é mais que suficiente)

📌 Onde commitar:
- Estudos de I/O e JDBC → `practice`
- Persistência integrada ao projeto → `projeto-final`

---

## 🎮 Side Quest (Opcional)
- Usar SQLite via JDBC
- Serializar em JSON com `Gson` ou `Jackson`
- Salvar a cada operação (vs. apenas no encerramento)

---

## 🛠 Conteúdo Técnico
- File I/O (`Files`, `BufferedReader`, `BufferedWriter`)
- Try-with-resources
- Caminhos relativos vs absolutos
- Conceito de **serialização**
- Visão geral de JDBC (sem precisar implementar)

---

## 🧠 Debug & Desenvolvimento Mental
- "Arquivo não encontrado" — em qual diretório o programa rodou?
- Encoding (UTF-8) e caracteres especiais
- O que fazer se o arquivo estiver corrompido?
- "Quem é dono de carregar/salvar?" → pista para próxima semana (Repository)

---

## 🤖 Second Brain – Uso Consciente de IA
Use IA para: ver formatos de arquivo, comparar I/O vs BD, revisar try-with-resources.

❌ Não use IA para: copiar código JDBC complexo sem entender conexão/SQL.

### Prompt sugerido
> Explique por que sistemas precisam persistir dados, a diferença entre
> guardar em memória, em arquivos e em banco, com exemplos simples.

---

## 🧠 Contexto para IA (Second Brain do squad)
```
Semana 09 – Persistência
Objetivo: salvar e carregar o estado entre execuções.
Conceitos-chave: File I/O, try-with-resources, serialização, JDBC (visão geral).
Domínio do projeto: salvar/carregar a lista de Produto em arquivo.
Decisões já tomadas: domínio em classes, validações e exceções básicas.
O que NÃO usar ainda: APIs HTTP, ORM, segurança.
```

---

## 📚 Referências
Material completo em [`./references.md`](./references.md).

---

## 📁 Exemplos
- [`examples/FileWriterExample.java`](./examples/FileWriterExample.java)

## ✅ Checklist de Entrega
- [ ] Dados salvos ao sair
- [ ] Dados carregados ao iniciar
- [ ] Não quebra na primeira execução (arquivo ausente)
- [ ] Commit em `projeto-final`

