# Semana 04 – Estruturas de Dados

## 🎯 Big Picture
Dados mal organizados geram sistemas lentos e frágeis.
Saber **qual coleção usar** é uma das decisões mais frequentes do dia a dia.

---

## 🧩 Conexão com o Projeto Final
O loop da semana 03 cadastra produtos, mas **esquece** tudo ao fechar.
Esta semana, o squad guarda os produtos em uma `ArrayList`,
podendo **listar** depois — primeiro passo rumo ao CRUD da semana 10.

---

## 🚀 MVP da Semana (Obrigatório)
Em squad:

- Substituir variáveis soltas por uma `ArrayList<String>` (ou `ArrayList<Object>`) de produtos
- Implementar uma opção de menu "listar" que percorre a coleção
- Demonstrar **ao menos um uso** de `HashMap` (ex.: produto por código)
- Tratar lista vazia (mensagem amigável)

📌 Onde commitar:
- Brincadeiras com várias coleções → `practice`
- Lista de produtos do projeto → `projeto-final`

---

## 🎮 Side Quest (Opcional)
- `Set` para garantir códigos de produto únicos
- Ordenar a lista por preço usando `Collections.sort`
- Usar `Map<String, List<String>>` para agrupar por categoria

---

## 🛠 Conteúdo Técnico
- `ArrayList` — quando usar
- `HashMap` — quando usar
- Iteração: `for`, `for-each`, `Iterator`
- Generics (`<String>`, `<Integer>`) — o básico
- Tamanho, busca, remoção

---

## 🧠 Debug & Desenvolvimento Mental
- `IndexOutOfBoundsException` (esqueceu do `size - 1`)
- `NullPointerException` ao iterar lista nunca instanciada
- Modificar a lista enquanto itera (`ConcurrentModificationException`)
- Diferença mental: **lista = ordem; mapa = chave→valor**

---

## 🤖 Second Brain – Uso Consciente de IA
Use IA para: comparar estruturas, ver casos de uso, simular dados.

❌ Não use IA para: escolher a estrutura sem entender o trade-off.

### Prompt sugerido
> Explique a diferença entre ArrayList e HashMap, quando usar cada um
> e quais erros iniciantes costumam cometer, com exemplos simples.

---

## 🧠 Contexto para IA (Second Brain do squad)
```
Semana 04 – Estruturas de Dados
Objetivo: armazenar e iterar dados em memória.
Conceitos-chave: ArrayList, HashMap, generics, iteração.
Domínio do projeto: lista de produtos cadastrados em memória.
Decisões já tomadas: entrada via Scanner, loop de cadastro, regras simples.
O que NÃO usar ainda: classes próprias (POO vem na semana 05), persistência, banco.
```

---

## 📚 Referências
Material completo em [`./references.md`](./references.md).

---

## 📁 Exemplos
- [`examples/ArrayListExample.java`](./examples/ArrayListExample.java)
- [`examples/HashMapExample.java`](./examples/HashMapExample.java)


## ✅ Checklist de Entrega
- [ ] Produtos armazenados em coleção
- [ ] Listagem funciona
- [ ] Pelo menos um `HashMap` no projeto
- [ ] Mensagens claras para lista vazia
- [ ] Commit em `projeto-final`

