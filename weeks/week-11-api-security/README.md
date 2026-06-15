# Semana 11 – APIs e Segurança Básica

## 🎯 Big Picture
Sistemas raramente trabalham sozinhos — eles **conversam** via APIs.
Uma API é, em essência: *uma função acessível pela rede, com regras bem definidas.*
Esta semana, o squad **expõe** o CRUD para o mundo via HTTP.

---

## 🧩 Conexão com o Projeto Final
O `ProdutoRepository` da semana 10 vira o **backend** de uma pequena API:
- `GET /produtos` → `findAll`
- `POST /produtos` → `create`
- (opcional) `PUT` e `DELETE`

A persistência da semana 09 continua funcionando. Não muda o domínio,
muda apenas **como ele é acessado**.

---

## 🚀 MVP da Semana (Obrigatório)
Em squad:

- Subir uma aplicação Java que escute em uma porta (ex.: 8080)
- Endpoint `GET` que retorna a lista de produtos (JSON simples)
- Endpoint `POST` que cria um produto
- Retornar status HTTP coerentes (200, 201, 400, 404)
- Testar com `curl`, Postman ou navegador

📌 Onde commitar:
- Experimentos com servidores e libs HTTP → `practice`
- API do projeto → `projeto-final`

---

## 🎮 Side Quest (Opcional)
- Validação de payload (preço > 0, nome obrigatório)
- Header com **token simples** (ex.: `Authorization: Bearer ...`) — segurança didática
- Organizar em camadas (Controller / Service / Repository)
- Documentar endpoints num README ou Postman collection

---

## 🛠 Conteúdo Técnico
- HTTP: GET, POST, PUT, DELETE
- Status codes principais
- JSON (estrutura e serialização)
- Cliente ↔ Servidor
- Noção de autenticação (header / token)
- `com.sun.net.httpserver.HttpServer` ou Spark/Javalin (a critério)

---

## 🧠 Debug & Pensamento de Dev
- "Porta já em uso" → quem está ocupando?
- JSON malformado → onde foi serializado?
- Endpoint 404 → método HTTP ou path errado?
- **Sempre teste o GET antes do POST.**

---

## 🤖 Second Brain – Uso Consciente de IA
Use IA para: entender o fluxo HTTP, revisar contratos, gerar exemplos de payload.

❌ Não use IA para: gerar a API inteira sem entender requisição/resposta.

### Prompt sugerido
> Explique como uma API HTTP funciona do início ao fim, da requisição do cliente
> até a resposta do servidor, com exemplos simples.

---

## 🧠 Contexto para IA (Second Brain do squad)
```
Semana 11 – APIs e Segurança
Objetivo: expor o CRUD via HTTP retornando JSON.
Conceitos-chave: HTTP, JSON, status codes, header de autenticação simples.
Domínio do projeto: GET/POST de Produto sobre o repositório da semana 10.
Decisões já tomadas: domínio + CRUD + persistência + tratamento de erros.
O que NÃO usar ainda: frameworks pesados (Spring) sem necessidade; banco grande.
```

---

## 📚 Referências
Material completo em [`./references.md`](./references.md).

---

## 📁 Exemplos
- [`examples/ApiApp.java`](./examples/ApiApp.java)
- [`examples/Produto.java`](./examples/Produto.java)

---

## 📝 Revisão da Semana
Aplicada no início da semana 12: [`./reviews/review-week11.csv`](./reviews/review-week11.csv)

---

## ✅ Checklist de Entrega
- [ ] Servidor sobe localmente
- [ ] GET retorna produtos como JSON
- [ ] POST cria produto e responde com 201
- [ ] Status codes coerentes
- [ ] Commit em `projeto-final`

